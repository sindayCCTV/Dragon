package Dragon.sinday.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.Game;
import Dragon.sinday.pojo.Role;

public interface RoleDao {
 
	/**
	 * 
	 * @param ���ݽ�ɫid������Ϸ
	 * @return
	 */
	public Role selectToid(@Param("roleid")int rid);
	 
	
}
