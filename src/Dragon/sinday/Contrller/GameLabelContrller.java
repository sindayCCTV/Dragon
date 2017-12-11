package Dragon.sinday.Contrller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import Dragon.sinday.Service.CountryDaoService;
import Dragon.sinday.Service.GameDaoService;
import Dragon.sinday.Service.GameLabelDaoService;
import Dragon.sinday.pojo.Country;
import Dragon.sinday.pojo.Game;
import Dragon.sinday.pojo.GameLabel;

@Controller
@RequestMapping(value="gameLabel")
public class GameLabelContrller {
	
	
	@Resource(name="gameLabelService")
	public GameLabelDaoService gamelabel;
	
	 
	
	@RequestMapping(value="allLabel")
	@ResponseBody
	public Object allCountry(){
		List<GameLabel> dragon= gamelabel.SelectAll();
		Object json=JSON.toJSON(dragon);
    	System.out.println("json: "+json);
    	
		return json;
	}
	
	@RequestMapping(value="addLable")
	@ResponseBody
	public Object addLable(HttpServletRequest req){
		 
		String labName="";
				
				try {
					labName=new String(req.getParameter("labName").getBytes("iso8859-1"),"utf-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					System.out.println("EEEEEEEEEEEEEE");
					e.printStackTrace();
				}
		System.out.println(labName);
		GameLabel dragon= gamelabel.selectISNO(labName);
		Object json=null;
		//如果不等于空说明存在这个标签了 就应该是count使用次数加一
		if(dragon!=null){
			System.out.println("执行加一");
		
			gamelabel.addCount(dragon.getLabelId());
			json=JSON.toJSON(dragon);
		}else{
			//不存在则需要新加一个
			GameLabel dragon2=new GameLabel();
			dragon2.setLabelName(labName);
					gamelabel.addlabel(dragon2);
			 json=JSON.toJSON(dragon2);
		    System.out.println("json: "+json);
		}
		 
    	
		return json;
	}
	
	 
	
	
	
}
