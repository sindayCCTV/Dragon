package Dragon.sinday.Contrller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Dragon.sinday.pojo.Jurisdiction;

@Controller
@RequestMapping(value="body")
public class BodyContrller {
	
	/**
	 * 点击用户 显示第二级的用户权限
	 */
	@RequestMapping(value="goBody")
	public String goUser(@RequestParam(value="songId",required=true) Integer jid
			,HttpSession session
			){
		//传过来了一个顶级jid上级是0的
		System.out.println(jid);
		List<Jurisdiction> ejiRole=new ArrayList<Jurisdiction>();
		List<Jurisdiction> myros=(List<Jurisdiction>)session.getAttribute("myRole");
		for(Jurisdiction jsr:myros){
			if(jsr.getjSuperiorJid()==jid){
				ejiRole.add(jsr);
			}
			
		}
		session.setAttribute("ErJiRole", ejiRole);
		
		return "/body/userBody";
	}

	/**
	 * 获取二级权限 
	 * @param jid
	 * @param session
	 */
	
	public static void goTwoRole(Integer jid,HttpSession session){
		//传过来了一个顶级jid上级是0的
		System.out.println(jid);
		List<Jurisdiction> ejiRole=new ArrayList<Jurisdiction>();
		List<Jurisdiction> myros=(List<Jurisdiction>)session.getAttribute("myRole");
		for(Jurisdiction jsr:myros){
			if(jsr.getjSuperiorJid()==jid){
				ejiRole.add(jsr);
				System.out.println(jsr.getjId());
			}
			
			
		}
		session.setAttribute("SanJiRole", ejiRole);
		 
	}
	
	
	
	
}
