package Dragon.sinday.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import Dragon.sinday.Contool.Constants;

public class User {
	 
	  /**
	   * 用户唯一标识ID
	   */
	  private int userId;//` int(11) NOT NULL AUTO_INCREMENT,
	  /**
	   * 用户的账号
	   */
	  private String userCode;//` varchar(16) NOT NULL,
	  /**
	   * 用户昵称
	   */
	  private String userName;//` varchar(10) NOT NULL,
	  /**
	   * 用户性别
	   */
	  private String userSex;//` char(2) DEFAULT NULL,
	  /**
	   * 用户电话
	   */
	  private String userPhone;//` varchar(11) DEFAULT NULL,
	  /**
	   * 用户角色
	   */
	  private int userRole;//` int(11) DEFAULT NULL,
	  /**
	   * 用户账号等级
	   */
	  private Integer userLevel;//` int(11) NOT NULL DEFAULT '0',
	  /**
	   * 用户个性签名,信条
	   */
	  private String  userCreed;//` varchar(50) DEFAULT NULL,
	  /**
	   * 用户创建该账号的日期
	   */
	  @DateTimeFormat
	  private Date userCreationDate;
	  /**
	   * 用户出生日期(用于统计游戏面向的年龄以及保证青少年,未成年安全)
	   */
	  @DateTimeFormat
	  private Date userBirthday;
	  /**
	   * 用户所属国家(一般遵循某些国家法律而进行特定的锁区行为)
	   */
	  private Integer userCountry;
	  /**
	   * 用户账号状态(封禁ACV)
	   * 0-正常 1-封号 
	   */
	  private Integer userState;
	  /**
	   * 密码
	   */
	  private String userPwd;
	  
	  /**
	   * portrait用户头像
	   */
	  private String userPortrait;//` int(11) NOT NULL AUTO_INCREMENT,
	/**
	 * userBoos是哪个开发商 0不是开发商
	 */
	  private int userBoos;
	  
	  
	  
	  
	  
	  /**
		 * userBoos是哪个开发商 0不是开发商
		 */
	  public int getUserBoos() {
		return userBoos;
	}
	  /**
		 * userBoos是哪个开发商 0不是开发商
		 */
	public void setUserBoos(int userBoos) {
		this.userBoos = userBoos;
	}
	 
	/**
	   * 密码
	   */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	   * 密码
	   */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * 用户唯一标识ID
	 */
	public int getUserId() {
		 
		return userId;
	}
	/**
	 * 用户唯一标识ID
	 */
	public void setUserId(int userId) {
		 
		this.userId = userId;
	}
	/**
	   * 用户的账号
	   */
	public String getUserCode() {
		return userCode;
	}
	/**
	   * 用户的账号
	   */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	   * 用户昵称
	   */
	public String getUserName() {
		return userName;
	}
	/**
	   * 用户昵称
	   */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	   * 用户性别
	   */
	public String getUserSex() {
		return userSex;
	}
	/**
	   * 用户性别
	   */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	/**
	   * 用户电话
	   */
	
	public String getUserPhone() {
		return userPhone;
	}
	/**
	   * 用户电话
	   */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	/**
	   * 用户角色
	   */
	
	public int getUserRole() {
		return userRole;
	}
	/**
	   * 用户角色
	   */
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	/**
	   * 用户账号等级
	   */
	public Integer getUserLevel() {
		return userLevel;
	}
	
	/**
	 * 计算年龄
	 */
	private Integer age;
	
	
	  
	  
	  
	public Integer setAge() {
		int ages=0;
		try {
			ages=Constants.GetAge(this.userBirthday);
		} catch (Exception e) {
			 
		}
		return ages;
	}
	public Integer getAge() {
		int ages=0;
		try {
			ages=Constants.GetAge(this.userBirthday);
		} catch (Exception e) {
			 
		}
		return ages;
	}
	 
	/**
	   * 用户账号等级
	   */
	
	
	
	
	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}
	public String getUserPortrait() {
		return userPortrait;
	}
	public void setUserPortrait(String userPortrait) {
		this.userPortrait = userPortrait;
	}
	/**
	   * 用户个性签名,信条
	   */
	public String getUserCreed() {
		return userCreed;
	}
	/**
	   * 用户个性签名,信条
	   */
	public void setUserCreed(String userCreed) {
		this.userCreed = userCreed;
	}
	/**
	   * 用户创建该账号的日期
	   */
	public Date getUserCreationDate() {
		return userCreationDate;
	}
	/**
	   * 用户创建该账号的日期
	   */
	
	public void setUserCreationDate(Date userCreationDate) {
		this.userCreationDate = userCreationDate;
	}
	/**
	   * 用户出生日期(用于统计游戏面向的年龄以及保证青少年,未成年安全)
	   */
	public Date getUserBirthday() {
		return userBirthday;
	}
	/**
	   * 用户出生日期(用于统计游戏面向的年龄以及保证青少年,未成年安全)
	   */
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	/**
	   * 用户所属国家(一般遵循某些国家法律而进行特定的锁区行为)
	   */
	public Integer getUserCountry() {
		return userCountry;
	}
	/**
	   * 用户所属国家(一般遵循某些国家法律而进行特定的锁区行为)
	   */
	public void setUserCountry(Integer userCountry) {
		this.userCountry = userCountry;
	}
	/**
	   * 用户账号状态(封禁ACV)
	   * 0-正常 1-封号 
	   */
	public Integer getUserState() {
		return userState;
	}
	/**
	   * 用户账号状态(封禁ACV)
	   * 0-正常 1-封号 
	   */
	public void setUserState(Integer userState) {
		this.userState = userState;
	}
	  
	  
	  
	  
	  
	  
	  
	  
}
