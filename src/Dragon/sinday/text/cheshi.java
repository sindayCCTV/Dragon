package Dragon.sinday.text;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dragon.sinday.Service.LTanCommentDaoService;
import Dragon.sinday.Service.UserDaoService;
import Dragon.sinday.pojo.LTanComment;
import Dragon.sinday.pojo.User;

public class cheshi {
	public static void main(String[] args) {
		 ApplicationContext ac=new
				 ClassPathXmlApplicationContext("spring-mybatis.xml");
		 UserDaoService usc=(UserDaoService)ac.getBean("userService");
		 
		  
			 
			 LTanCommentDaoService ltdao=(LTanCommentDaoService)ac.getBean("ltcomm");
			 List<LTanComment> lt= ltdao.selectToLTid(4);
			 for(LTanComment lts:lt){
				 System.out.println(lts.getC_userCode());
			 }
			 
			 
		  
	}
}
