package Dragon.sinday.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.Game;
import Dragon.sinday.pojo.Role;

 

public interface RoleDaoService {
	
	public Role selectToid(int rid);
	
	
}
