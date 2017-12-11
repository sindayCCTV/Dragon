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
	 * ����������Ϸ
	 * @param gameName
	 * @param mod
	 * @return
	 */
	@RequestMapping(value="SelectToName",method=RequestMethod.POST)
	@ResponseBody
	public String selectToGame(@RequestParam(value="gameName") String gameName,Model mod){
		
		List<Game> oneGame=gameService.SelectToGameName(gameName.trim());
		System.out.println("��Ϸ����Ϊ"+oneGame.size());
		if(oneGame!=null){
			mod.addAttribute("listGame", oneGame);
		}
		
		return "game/gameList";
	}
	
	/**
	 * ȥ������Ϸ����
	 * @return
	 */
	@RequestMapping(value="goSearch")
	public String GoSearch(){
		return "/game/searchGame";
	}
	/**
	 * ȥ���ӽ���
	 * @return
	 */
	@RequestMapping(value="goGameAdd")
	public String goGameAdd(HttpSession sess,HttpServletRequest req){
		User bos= (User)
				sess.getAttribute(Constants.USER_SESSION);
		if(bos==null||bos.getUserRole()==4){
			req.setAttribute("ErrorFile", "������ԽȨ����");
			return "/error";
		}
		return "/game/gameAdd";
	}
	
	
	/**
	 * ����ִ����������
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
		
		//����������Ϸ��ϸ��Ϣ�е�ͼƬ�ļ��� name=s_userPortrait
		//������һ��33,34,35,36,������
		 String pathisID="";
		try {
			 pathisID=wenjianchuli(sess,req,gamedetails);
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		
		
		//��������Ϸ��ϸ��Ϣ ��������Ϸ
		//��ͼƬ�������ϸ��Ϣ
		 gdetails.setDetailspicture(pathisID);
		 
		 String classFiy="";		
		 String[] lables = req.getParameterValues("labels");
		
		 for(String g:lables){
			 //��ǩ��ʹ����Ҫ��һ
			 gameLabelService.addCount(Integer.parseInt(g));
			 classFiy=classFiy+g+",";
		 }
		 //������Ϸ��ϸ�еķ���
		 gdetails.setClassify(classFiy);
		 
		 //������Ϸ��ϸ��Ϣ
		 gameDetailsService.addOne(gdetails);
		//ʱ�䴦��
		 System.out.println("GAMDETAID=="+gdetails.getDetails());
		game.setGameSale(new Date());
		//ȡ��������
		User bos= (User)
				sess.getAttribute(Constants.USER_SESSION);
		game.setDistributors(bos.getUserRole());
		game.setDetails(gdetails.getDetails());
		//ErrorFile
		System.out.println("-----------S-----------");
		String mysqlPath="";
		if(!gameImage.isEmpty()){//�ļ��Ƿ�Ϊ��
			String path=req.getSession().getServletContext().getRealPath("statics"+File.separator+"gameImage");
			System.out.println(path);
			String oldName=gameImage.getOriginalFilename();//Դ�ļ���
			System.out.println(oldName);
			String prefix=FilenameUtils.getExtension(oldName);//�ļ���׺
			if(gameImage.getSize()>5000000){//�������500KB
				req.setAttribute("ErrorFile", "�ļ����ɴ���500KB");
				System.out.println("�ļ�̫��");
				return "/user/userAdd";
			}else if(prefix.equalsIgnoreCase("jpg")
					||prefix.equalsIgnoreCase("png")
					||prefix.equalsIgnoreCase("jpeg")
					){//ֻ֧��Jpg�ȸ�ʽ
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
					req.setAttribute("ErrorFile", "Ī�������ʧ�ܣ�");
					
					return "/game/gameAdd";
				}  
				mysqlPath="\\statics\\gameImage\\"+fileNames;
				System.out.println(mysqlPath);
			}else{
				req.setAttribute("ErrorFile", "��ʽ����");
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
					 * �ļ�����ʼ
					 */
			if(!gameImage.isEmpty()){//�ļ��Ƿ�Ϊ��
				
				System.out.println(path);
				String oldName=gameImage.getOriginalFilename();//Դ�ļ���
				System.out.println(oldName);
				String prefix=FilenameUtils.getExtension(oldName);//�ļ���׺
				if(gameImage.getSize()>50000000){//�������500KB
					req.setAttribute("ErrorFile", "�ļ����ɴ���500KB");
					System.out.println("�ļ�̫��");
			 
				}else if(prefix.equalsIgnoreCase("jpg")
						||prefix.equalsIgnoreCase("png")
						||prefix.equalsIgnoreCase("jpeg")
						){//ֻ֧��Jpg�ȸ�ʽ
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
						req.setAttribute("ErrorFile", "Ī�������ʧ�ܣ�");
						 
					}  
					mysqlpath="\\statics\\gameImage\\"+fileNames;
					fileFrom gamed=new fileFrom();
					gamed.setfPath(mysqlpath);
					gamed.setfType(2);
				int hh=	 fileFroms.addOne(gamed);
					 System.out.println("��ǰ��������ֵ��:"+hh);
					pathisID=pathisID+gamed.getfId()+",";
					System.out.println(mysqlpath);
				}else{
					req.setAttribute("ErrorFile", "��ʽ����");
					 
				}
			}
					/**
					 * �ļ��������
					 */
			
			
		}
		
		System.out.println("����ͼƬ�鷵�ص�pathisID"+pathisID);
		
		return pathisID;
		
	}
	
	
	
}
