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
		
		//����Service��login()�������е�½����
		User user=userService.SelectUser(userCode, userPassword);
		if(user!=null){//��½�ɹ�
			//����ǰ�û�������Session��
			session.removeAttribute(Constants.USER_SESSION);
			session.setAttribute(Constants.USER_SESSION, user);
			//�����û��鵽��ɫ
			String jues= roleService.selectToid(user.getUserRole()).getrLocation();
			String Stringjids[]=jues.split(",");
			Integer[] jidsint=new Integer[Stringjids.length];
			for(int i=0;i<jidsint.length;i++){
				jidsint[i]=Integer.parseInt(Stringjids[i]);
			}
 
			session.setAttribute("myRole", jservice.selectToid(jidsint));  
		 
			return "redirect:/main";//�ض���
		}else{//��½ʧ��
			
			request.setAttribute("error", "�û������������!");
			return "login";
		}
	
	}
	
	
	 
	
	
	

	//�ǳ�(�˳�)
	@RequestMapping(value="logout")
	public String logOut(HttpSession session){
		//����ǰ�û���Session���Ƴ�
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
		//����ǰ�û���Session���Ƴ�
	 
		return "/public/head";
	}
	
	
	
	
}
