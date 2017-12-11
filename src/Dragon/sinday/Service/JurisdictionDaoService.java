package Dragon.sinday.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.Game;
import Dragon.sinday.pojo.Jurisdiction;
import Dragon.sinday.pojo.Role;

public interface JurisdictionDaoService {
 
	/**
	 * 
	 * @param 根据传id数组查找一堆权限
	 * @return
	 */
	public List<Jurisdiction> selectToid(Integer[] jid);
	 
	
}
