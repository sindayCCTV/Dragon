package Dragon.sinday.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.Game;
import Dragon.sinday.pojo.Jurisdiction;
import Dragon.sinday.pojo.Role;

public interface JurisdictionDao {
 
	/**
	 * 
	 * @param ���ݴ�id�������һ��Ȩ��
	 * @return
	 */
	public List<Jurisdiction> selectToid(Integer[] jid);
	 
	
}
