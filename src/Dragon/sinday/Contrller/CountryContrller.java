package Dragon.sinday.Contrller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import Dragon.sinday.Service.CountryDaoService;
import Dragon.sinday.Service.GameDaoService;
import Dragon.sinday.pojo.Country;
import Dragon.sinday.pojo.Game;

@Controller
@RequestMapping(value="country")
public class CountryContrller {
	
	
	@Resource(name="CountryService")
	public CountryDaoService countryService;
	
	 
	
	@RequestMapping(value="allCountry")
	@ResponseBody
	public Object allCountry(){
		List<Country> dragon= countryService.SelectAll();
		Object json=JSON.toJSON(dragon);
    	System.out.println("json: "+json);
    	
		return json;
	}
	 
	
	
	
}
