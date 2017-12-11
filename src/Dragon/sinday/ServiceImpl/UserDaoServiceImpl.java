package Dragon.sinday.ServiceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import Dragon.sinday.Dao.UserDao;
import Dragon.sinday.Service.UserDaoService;
import Dragon.sinday.pojo.User; 

@Service("userService")  
public class UserDaoServiceImpl implements UserDaoService {

	@Resource
	private UserDao userd;
	
	 

	@Override
	public User SelectUser(String name, String pwd) {
		 
		return userd.SelectUser(name, pwd);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userd.addUser(user);
	}

	@Override
	public User SelectUserCode(String name) {
		// TODO Auto-generated method stub
		return userd.SelectUserCode(name);
	}

	@Override
	public List<User> SelectAll() {
		 
		return userd.SelectAll();
	}

 

}
