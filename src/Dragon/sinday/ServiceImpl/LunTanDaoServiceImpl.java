package Dragon.sinday.ServiceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
 




import Dragon.sinday.Dao.LunTanDao; 
import Dragon.sinday.Service.LunTanDaoService; 
import Dragon.sinday.pojo.LunTan; 

@Service("LunTanDaoService")  
public class LunTanDaoServiceImpl implements LunTanDaoService {

	@Resource
	private LunTanDao lts;

	@Override
	public List<LunTan> allLunTan() {
		// TODO Auto-generated method stub
		return lts.allLunTan();
	}

	@Override
	public int insertLT(LunTan lt) {
		// TODO Auto-generated method stub
		return lts.insertLTs(lt);
	}

	@Override
	public LunTan selectOne(Integer lTid) {
		// TODO Auto-generated method stub
		return lts.SeleOne(lTid);
	}

	 

	 

 

}
