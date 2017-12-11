package Dragon.sinday.Dao;

import java.util.List;

import Dragon.sinday.pojo.LunTan;

public interface LunTanDao {
	
	public List<LunTan> allLunTan();
	
	public int insertLTs(LunTan lt);
	
	public LunTan SeleOne(Integer lTid);
}
