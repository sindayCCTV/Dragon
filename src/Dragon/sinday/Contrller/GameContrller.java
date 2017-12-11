package Dragon.sinday.Contrller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;

import Dragon.sinday.Contool.Constants;
import Dragon.sinday.Service.GameDaoService;
import Dragon.sinday.Service.GameDetailsService;
import Dragon.sinday.Service.GameLabelDaoService;
import Dragon.sinday.Service.fileFromService;
import Dragon.sinday.pojo.DistributorsBoss;
import Dragon.sinday.pojo.Game;
import Dragon.sinday.pojo.GameDetails;
import Dragon.sinday.pojo.User;
import Dragon.sinday.pojo.fileFrom;

@Controller
@RequestMapping(value="game")
public class GameContrller {
	//gameLabelService
	
	@Resource(name="gameLabelService")
	private GameLabelDaoService gameLabelService;
	
	@Resource
	private GameDaoService gameService;
	
	@Resource(name="GameDetailsService")
	private GameDetailsService gameDetailsService;
	
	@Resource(name="fileFromService")
	private fileFromService fileFroms;
	
	/**
	 * 正在搜索游戏
	 * @param gameName
	 * @param mod
	 * @return
	 */
	@RequestMapping(value="SelectToName",method=RequestMethod.POST)
	@ResponseBody
	public String selectToGame(@RequestParam(value="gameName") String gameName,Model mod){
		
		List<Game> oneGame=gameService.SelectToGameName(gameName.trim());
		System.out.println("游戏个数为"+oneGame.size());
		if(oneGame!=null){
			mod.addAttribute("listGame", oneGame);
		}
		
		return "game/gameList";
	}
	
	/**
	 * 去搜索游戏界面
	 * @return
	 */
	@RequestMapping(value="goSearch")
	public String GoSearch(){
		return "/game/searchGame";
	}
	/**
	 * 去增加界面
	 * @return
	 */
	@RequestMapping(value="goGameAdd")
	public String goGameAdd(HttpSession sess,HttpServletRequest req){
		User bos= (User)
				sess.getAttribute(Constants.USER_SESSION);
		if(bos==null||bos.getUserRole()==4){
			req.setAttribute("ErrorFile", "您不可越权操作");
			return "/error";
		}
		return "/game/gameAdd";
	}
	
	
	/**
	 * 正在执行增加命令
	 * @return
	 */
	@RequestMapping(value="doAddGame")
	public String doAddGame(GameDetails gdetails,Game game,
			@RequestParam(value="a_userPortrait",required=false)
			MultipartFile gameImage,
			@RequestParam(value="s_userPortrait",required=false)
			MultipartFile[] gamedetails,
			HttpSession sess,
			HttpServletRequest req
			){
		
		//最先增加游戏详细信息中的图片文件组 name=s_userPortrait
		//返回了一个33,34,35,36,的主键
		 String pathisID="";
		try {
			 pathisID=wenjianchuli(sess,req,gamedetails);
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		
		
		//先增加游戏详细信息 在增加游戏
		//将图片组放入详细信息
		 gdetails.setDetailspicture(pathisID);
		 
		 String classFiy="";		
		 String[] lables = req.getParameterValues("labels");
		
		 for(String g:lables){
			 //标签被使用了要加一
			 gameLabelService.addCount(Integer.parseInt(g));
			 classFiy=classFiy+g+",";
		 }
		 //增加游戏详细中的分类
		 gdetails.setClassify(classFiy);
		 
		 //增加游戏详细信息
		 gameDetailsService.addOne(gdetails);
		//时间处理
		 System.out.println("GAMDETAID=="+gdetails.getDetails());
		game.setGameSale(new Date());
		//取到开发商
		User bos= (User)
				sess.getAttribute(Constants.USER_SESSION);
		game.setDistributors(bos.getUserRole());
		game.setDetails(gdetails.getDetails());
		//ErrorFile
		System.out.println("-----------S-----------");
		String mysqlPath="";
		if(!gameImage.isEmpty()){//文件是否为空
			String path=req.getSession().getServletContext().getRealPath("statics"+File.separator+"gameImage");
			System.out.println(path);
			String oldName=gameImage.getOriginalFilename();//源文件名
			System.out.println(oldName);
			String prefix=FilenameUtils.getExtension(oldName);//文件后缀
			if(gameImage.getSize()>5000000){//如果大于500KB
				req.setAttribute("ErrorFile", "文件不可大于500KB");
				System.out.println("文件太大");
				return "/user/userAdd";
			}else if(prefix.equalsIgnoreCase("jpg")
					||prefix.equalsIgnoreCase("png")
					||prefix.equalsIgnoreCase("jpeg")
					){//只支持Jpg等格式
				Random ran=new Random();
				int random=ran.nextInt(100000);
				String fileNames="Game"+System.currentTimeMillis()+random+"_Sinday.jpg";
				System.out.println(fileNames);
				File target=new File(path,fileNames);
				if(target.exists()){
					target.mkdirs();
				}
				try {
					gameImage.transferTo(target);
				} catch (Exception e) {
					req.setAttribute("ErrorFile", "莫名其妙的失败？");
					
					return "/game/gameAdd";
				}  
				mysqlPath="\\statics\\gameImage\\"+fileNames;
				System.out.println(mysqlPath);
			}else{
				req.setAttribute("ErrorFile", "格式不对");
				return "/game/gameAdd";
			}
		 
		}
		
		game.setGameImage(mysqlPath);
		System.out.println(game.getCountryNotVIP());
		System.out.println(game.getGameName());
		gameService.addGame(game);
		 
		return "/game/gameAdd";
	}
	
	
	public String wenjianchuli(HttpSession sess,
			HttpServletRequest req,
			MultipartFile[] gamedetails){
		
		String pathisID="";
		String path=req.getSession()
				.getServletContext()
				.getRealPath("\\statics"+"\\"+"gameImage");
		
		for(int i=0;i<gamedetails.length;i++){
			MultipartFile gameImage=gamedetails[i];
			String mysqlpath="";
					/**
					 * 文件处理开始
					 */
			if(!gameImage.isEmpty()){//文件是否为空
				
				System.out.println(path);
				String oldName=gameImage.getOriginalFilename();//源文件名
				System.out.println(oldName);
				String prefix=FilenameUtils.getExtension(oldName);//文件后缀
				if(gameImage.getSize()>50000000){//如果大于500KB
					req.setAttribute("ErrorFile", "文件不可大于500KB");
					System.out.println("文件太大");
			 
				}else if(prefix.equalsIgnoreCase("jpg")
						||prefix.equalsIgnoreCase("png")
						||prefix.equalsIgnoreCase("jpeg")
						){//只支持Jpg等格式
					Random ran=new Random();
					int random=ran.nextInt(100000);
					String fileNames="Game"+System.currentTimeMillis()+random+"_Sinday.jpg";
					System.out.println(fileNames);
					File target=new File(path,fileNames);
					if(target.exists()){
						target.mkdirs();
					}
					try {
						gameImage.transferTo(target);
					} catch (Exception e) {
						req.setAttribute("ErrorFile", "莫名其妙的失败？");
						 
					}  
					mysqlpath="\\statics\\gameImage\\"+fileNames;
					fileFrom gamed=new fileFrom();
					gamed.setfPath(mysqlpath);
					gamed.setfType(2);
				int hh=	 fileFroms.addOne(gamed);
					 System.out.println("当前主键返回值是:"+hh);
					pathisID=pathisID+gamed.getfId()+",";
					System.out.println(mysqlpath);
				}else{
					req.setAttribute("ErrorFile", "格式不对");
					 
				}
			}
					/**
					 * 文件处理结束
					 */
			
			
		}
		
		System.out.println("最终图片组返回的pathisID"+pathisID);
		
		return pathisID;
		
	}
	
	
	
}
