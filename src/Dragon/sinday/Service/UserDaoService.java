package Dragon.sinday.Service;

 

import java.util.List;

import Dragon.sinday.pojo.User; 

public interface UserDaoService {
	public User SelectUserCode(String name);
	
	public User SelectUser(String name,String pwd);
	
	public boolean addUser(User user);
	public List<User> SelectAll();
}
