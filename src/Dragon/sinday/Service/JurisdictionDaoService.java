package Dragon.sinday.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.Game;
import Dragon.sinday.pojo.Jurisdiction;
import Dragon.sinday.pojo.Role;

public interface JurisdictionDaoService {
 
	/**
	 * 
	 * @param ���ݴ�id�������һ��Ȩ��
	 * @return
	 */
	public List<Jurisdiction> selectToid(Integer[] jid);
	 
	
}
