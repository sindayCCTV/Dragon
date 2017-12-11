package Dragon.sinday.ServiceImpl;

 

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
 
import Dragon.sinday.Dao.RoleDao; 
import Dragon.sinday.Service.RoleDaoService; 
import Dragon.sinday.pojo.Role;

@Service("RoleService")  
public class RoleDaoServiceImpl implements RoleDaoService {

	@Resource
	private RoleDao games;

	@Override
	public Role selectToid(int rid) {
		// TODO Auto-generated method stub
		return games.selectToid(rid);
	}

	 

 

}
