package Dragon.sinday.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.User; 


public interface UserDao {
 
	/**
	 * 
	 * @param �����û��˺Ų�ѯ
	 * @return
	 */
	public User SelectUserCode(@Param("name")String name);
	
	public List<User> SelectAll();
	
	
	public User SelectUser(@Param("name")String name,@Param("pwd")String pwd);
	
	public boolean addUser(User user);
}
