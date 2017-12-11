package Dragon.sinday.Contrller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Application;

import org.apache.commons.io.FilenameUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.mysql.jdbc.StringUtils;

import Dragon.sinday.Service.UserDaoService;
import Dragon.sinday.pojo.Jurisdiction;
import Dragon.sinday.pojo.User;

@Controller
@RequestMapping(value="user")
public class UserContrller {
	
	@Resource
	private UserDaoService userService;
	
	@RequestMapping(value="addUser")
	public String addUser(User user,@RequestParam(value="a_userPortrait",required=false)
	MultipartFile attach,HttpSession sess,HttpServletRequest req
			){
		
			//userBirthday_a
		String dats= req.getParameter("userBirthday_a");
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		 
		try {
			Date dates =  formatter.parse(dats);
			 
			user.setUserBirthday(dates);
		} catch (ParseException e1) {
			System.out.println("ʱ���ʽ��������");
		}
		//ErrorFile
		System.out.println("-----------S-----------");
		String mysqlPath="";
		if(!attach.isEmpty()){//�ļ��Ƿ�Ϊ��
			String path=req.getSession().getServletContext().getRealPath("statics"+File.separator+"userPortrait");
			System.out.println(path);
			String oldName=attach.getOriginalFilename();//Դ�ļ���
			System.out.println(oldName);
			String prefix=FilenameUtils.getExtension(oldName);//�ļ���׺
			if(attach.getSize()>500000){//�������500KB
				req.setAttribute("ErrorFile", "�ļ����ɴ���500KB");
				System.out.println("�ļ�̫��");
				return "/user/userAdd";
			}else if(prefix.equalsIgnoreCase("jpg")
					||prefix.equalsIgnoreCase("png")
					||prefix.equalsIgnoreCase("jpeg")
					){//ֻ֧��Jpg�ȸ�ʽ
				Random ran=new Random();
				int random=ran.nextInt(100000);
				String fileNames="SD"+System.currentTimeMillis()+random+"_Sinday.jpg";
				System.out.println(fileNames);
				File target=new File(path,fileNames);
				if(target.exists()){
					target.mkdirs();
				}
				try {
					attach.transferTo(target);
				} catch (Exception e) {
					req.setAttribute("ErrorFile", "Ī�������ʧ�ܣ�");
					
					return "/user/toAddUser";
				}  
				mysqlPath="\\statics\\userPortrait\\"+fileNames;
				System.out.println(mysqlPath);
			}else{
				req.setAttribute("ErrorFile", "��ʽ����");
				return "/user/toAddUser";
			}
			
		}
		user.setUserPortrait(mysqlPath);
		user.setUserCreationDate(new Date());
		userService.addUser(user);
		 
		return "/login";
	}
	
	/**
	 * ȥ����û�����
	 * @return
	 */
	@RequestMapping(value="toAddUser")
	public String toAddUser(){
		return "/user/userAdd";
	}
	
	/**
	 * �ж��Ƿ���ڸ��˺�
	 */
	@RequestMapping(value="exitUserCode")
	@ResponseBody
	public Object exitUserCode(@RequestParam(value="userCode",required=true) String userCode){
		System.out.println("Good----UserCode");
		User user= userService.SelectUserCode(userCode);
		Map<String, String> resultMap=new HashMap<String, String>();
		if(StringUtils.isNullOrEmpty(userCode)){
			resultMap.put("isexist", "exist");
		}else{
			
			if(user!=null&&user.getUserName()!=null){
				resultMap.put("isexist", "exist");
			 }else{
				 //�����ڿ���ʹ��
				 resultMap.put("isexist", "noexist");
			 }
		}
		 
		Object json=JSON.toJSON(resultMap);
    	System.out.println("json: "+json);
    	return json;
	}
	
	
	/**
	 * ȥ�鿴�û�����
	 * @return
	 */
	@RequestMapping(value="goListUser")
	public String selectUser(Model mod){
		List<User> listUser=userService.SelectAll();
		mod.addAttribute("userList", listUser);
		for(User use:listUser){
		System.out.println(use.getUserPortrait());
		}
		return "/user/userList";
	}
	
	

	
	
}
