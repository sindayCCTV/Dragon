package Dragon.sinday.Service;

import java.util.List;

import Dragon.sinday.pojo.LunTan;

public interface LunTanDaoService {
	
	public List<LunTan> allLunTan();
	public int insertLT(LunTan lt);
	public LunTan selectOne(Integer lTid);
}
