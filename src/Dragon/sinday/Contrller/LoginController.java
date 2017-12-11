package Dragon.sinday.Contrller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Dragon.sinday.Contool.Constants;
import Dragon.sinday.Service.JurisdictionDaoService;
import Dragon.sinday.Service.RoleDaoService;
import Dragon.sinday.Service.UserDaoService;
import Dragon.sinday.pojo.User;


@Controller
public class LoginController {

	@Resource
	private UserDaoService userService;
	
	@Resource(name="RoleService")
	private RoleDaoService roleService;
	
	@Resource(name="JurisdictionService")
	private JurisdictionDaoService jservice;
	
	@RequestMapping(value="dologin")
	public String doLogin(@RequestParam(value="userCode",required=true) String userCode
			             ,@RequestParam(value="userPassword",required=true)String userPassword
			             ,HttpSession session
			             ,HttpServletRequest request){
		
		//调用Service层login()方法进行登陆处理
		User user=userService.SelectUser(userCode, userPassword);
		if(user!=null){//登陆成功
			//将当前用户保存在Session中
			session.removeAttribute(Constants.USER_SESSION);
			session.setAttribute(Constants.USER_SESSION, user);
			//根据用户查到角色
			String jues= roleService.selectToid(user.getUserRole()).getrLocation();
			String Stringjids[]=jues.split(",");
			Integer[] jidsint=new Integer[Stringjids.length];
			for(int i=0;i<jidsint.length;i++){
				jidsint[i]=Integer.parseInt(Stringjids[i]);
			}
 
			session.setAttribute("myRole", jservice.selectToid(jidsint));  
		 
			return "redirect:/main";//重定向
		}else{//登陆失败
			
			request.setAttribute("error", "用户名或密码错误!");
			return "login";
		}
	
	}
	
	
	 
	
	
	

	//登出(退出)
	@RequestMapping(value="logout")
	public String logOut(HttpSession session){
		//将当前用户从Session中移除
		session.removeAttribute(Constants.USER_SESSION);
		session.removeAttribute("myRole");
		return "login";
	}
	
	@RequestMapping(value="main")
	public String goMain(){
		
	 
		return "DiYiJieMia";
	}
	
	@RequestMapping(value="head")
	public String goHead(){
		//将当前用户从Session中移除
	 
		return "/public/head";
	}
	
	
	
	
}
