package Dragon.sinday.Contrller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import Dragon.sinday.Contool.Constants;
import Dragon.sinday.Service.LTanCommentDaoService;
import Dragon.sinday.Service.LunTanDaoService;
import Dragon.sinday.Service.UserDaoService;
import Dragon.sinday.pojo.Jurisdiction;
import Dragon.sinday.pojo.LTanComment;
import Dragon.sinday.pojo.LunTan;
import Dragon.sinday.pojo.User;
import Dragon.sinday.pojo.fileFrom;

@Controller
@RequestMapping(value="lunTan")
public class LunTanContrller {
	
	 
	
	@Resource(name="ltcomm")
	private LTanCommentDaoService ltancommService;
	
	@Resource
	private UserDaoService userService;
	
	@Resource(name="LunTanDaoService")
	private LunTanDaoService lt;
	 
	@RequestMapping(value="golunTan")
	public String golt(HttpServletRequest req){
		List<LunTan> mylt=lt.allLunTan();
		//session.setAttribute("listLT", lt.allLunTan());
		req.setAttribute("listLT", mylt);
		System.out.println("LTSL"+mylt.size());
		return "/lunTan/lunTanList";
	}
	
	/**
	 * 查看帖子详细信息
	 * @param songId
	 * @return
	 */
	@RequestMapping(value="goSeleOne")
	public String selectId(@RequestParam(value="songId") String songId
			,HttpServletRequest req){
		
			LunTan lxx= lt.selectOne(Integer.parseInt(songId));
			req.setAttribute("oneLT", lxx);
			User user=	userService.SelectUserCode(lxx.getUserCode());
			//查询评论
			 List<User> user_gaiComm=new ArrayList<User>();
		 	List<LTanComment> gaiComm=
		 			ltancommService.selectToLTid(Integer.parseInt(songId));
		 	
		 	for(LTanComment lc:gaiComm){
			 	User userv=userService.SelectUserCode(lc.getC_userCode());
			 	user_gaiComm.add(userv);
			 }
			
		 	req.setAttribute("user_gaiComm", user_gaiComm);
		 	req.setAttribute("ltComm", gaiComm);
			req.setAttribute("ltUser", user);
		return "/lunTan/SelectLTTieZi";
	}
	
	/**
	 * 去添加论坛
	 */
	@RequestMapping(value="addLT")
	public String goaddlt(
			@RequestParam(value="songId",required=true) Integer jid
			,HttpSession session){
		
		BodyContrller.goTwoRole(jid, session); 
		
		return "/lunTan/TianJiaLunTan";
	}
	
	
	/**
	 * 执行添加论坛
	 */
	@RequestMapping(value="doAddlt")
	public String doAddlt(LunTan lt,HttpSession sess,
			HttpServletRequest req,
			@RequestParam(value="s_userPortrait",required=false)
			MultipartFile[] gamedetails
			){
		String imags[]=wenjianchuli(sess, req, gamedetails);
		  
		 lt.setImages(imags[0]);
		 lt.setFaceIamge(imags[1]);
		lt.setNewTimes(new Date());
		 User use=(User)sess.getAttribute(Constants.USER_SESSION);
		 lt.setUserCode(use.getUserCode());
		 
		 this.lt.insertLT(lt);
		return "/golunTan";
	}
	
	
	
	
	
	
	public String[] wenjianchuli(HttpSession sess,
			HttpServletRequest req,
			MultipartFile[] gamedetails){
		
		String pathisID[]=new String[2];
		String path=req.getSession()
				.getServletContext()
				.getRealPath("\\statics"+"\\"+"lunTanImage");
		
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
					String fileNames="LunTan"+System.currentTimeMillis()+random+"_Sinday.jpg";
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
					mysqlpath="\\statics\\lunTanImage\\"+fileNames;
					pathisID[i]=mysqlpath;
					System.out.println(mysqlpath);
				}else{
					req.setAttribute("ErrorFile", "格式不对");
					 
				}
			}
					/**
					 * 文件处理结束
					 */
			
			
		}
		
		System.out.println("最终图片组返回的pathisID"+pathisID.toString());
		
		return pathisID;
		
	}
	
	
	
	
}
