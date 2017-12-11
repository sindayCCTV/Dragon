package Dragon.sinday.ServiceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import Dragon.sinday.Dao.CountryDao; 
import Dragon.sinday.Service.CountryDaoService; 
import Dragon.sinday.pojo.Country; 

@Service("CountryService")  
public class CountryDaoServiceImpl implements  CountryDaoService {

	@Resource 
	private CountryDao cdao;
	
	@Override
	public List<Country> SelectAll() {
		// TODO Auto-generated method stub
		return cdao.SelectAll();
	}

 
	
 

 

}
