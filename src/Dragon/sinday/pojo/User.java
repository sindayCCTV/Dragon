package Dragon.sinday.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import Dragon.sinday.Contool.Constants;

public class User {
	 
	  /**
	   * �û�Ψһ��ʶID
	   */
	  private int userId;//` int(11) NOT NULL AUTO_INCREMENT,
	  /**
	   * �û����˺�
	   */
	  private String userCode;//` varchar(16) NOT NULL,
	  /**
	   * �û��ǳ�
	   */
	  private String userName;//` varchar(10) NOT NULL,
	  /**
	   * �û��Ա�
	   */
	  private String userSex;//` char(2) DEFAULT NULL,
	  /**
	   * �û��绰
	   */
	  private String userPhone;//` varchar(11) DEFAULT NULL,
	  /**
	   * �û���ɫ
	   */
	  private int userRole;//` int(11) DEFAULT NULL,
	  /**
	   * �û��˺ŵȼ�
	   */
	  private Integer userLevel;//` int(11) NOT NULL DEFAULT '0',
	  /**
	   * �û�����ǩ��,����
	   */
	  private String  userCreed;//` varchar(50) DEFAULT NULL,
	  /**
	   * �û��������˺ŵ�����
	   */
	  @DateTimeFormat
	  private Date userCreationDate;
	  /**
	   * �û���������(����ͳ����Ϸ����������Լ���֤������,δ���갲ȫ)
	   */
	  @DateTimeFormat
	  private Date userBirthday;
	  /**
	   * �û���������(һ����ѭĳЩ���ҷ��ɶ������ض���������Ϊ)
	   */
	  private Integer userCountry;
	  /**
	   * �û��˺�״̬(���ACV)
	   * 0-���� 1-��� 
	   */
	  private Integer userState;
	  /**
	   * ����
	   */
	  private String userPwd;
	  
	  /**
	   * portrait�û�ͷ��
	   */
	  private String userPortrait;//` int(11) NOT NULL AUTO_INCREMENT,
	/**
	 * userBoos���ĸ������� 0���ǿ�����
	 */
	  private int userBoos;
	  
	  
	  
	  
	  
	  /**
		 * userBoos���ĸ������� 0���ǿ�����
		 */
	  public int getUserBoos() {
		return userBoos;
	}
	  /**
		 * userBoos���ĸ������� 0���ǿ�����
		 */
	public void setUserBoos(int userBoos) {
		this.userBoos = userBoos;
	}
	 
	/**
	   * ����
	   */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	   * ����
	   */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * �û�Ψһ��ʶID
	 */
	public int getUserId() {
		 
		return userId;
	}
	/**
	 * �û�Ψһ��ʶID
	 */
	public void setUserId(int userId) {
		 
		this.userId = userId;
	}
	/**
	   * �û����˺�
	   */
	public String getUserCode() {
		return userCode;
	}
	/**
	   * �û����˺�
	   */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	   * �û��ǳ�
	   */
	public String getUserName() {
		return userName;
	}
	/**
	   * �û��ǳ�
	   */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	   * �û��Ա�
	   */
	public String getUserSex() {
		return userSex;
	}
	/**
	   * �û��Ա�
	   */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	/**
	   * �û��绰
	   */
	
	public String getUserPhone() {
		return userPhone;
	}
	/**
	   * �û��绰
	   */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	/**
	   * �û���ɫ
	   */
	
	public int getUserRole() {
		return userRole;
	}
	/**
	   * �û���ɫ
	   */
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	/**
	   * �û��˺ŵȼ�
	   */
	public Integer getUserLevel() {
		return userLevel;
	}
	
	/**
	 * ��������
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
	   * �û��˺ŵȼ�
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
	   * �û�����ǩ��,����
	   */
	public String getUserCreed() {
		return userCreed;
	}
	/**
	   * �û�����ǩ��,����
	   */
	public void setUserCreed(String userCreed) {
		this.userCreed = userCreed;
	}
	/**
	   * �û��������˺ŵ�����
	   */
	public Date getUserCreationDate() {
		return userCreationDate;
	}
	/**
	   * �û��������˺ŵ�����
	   */
	
	public void setUserCreationDate(Date userCreationDate) {
		this.userCreationDate = userCreationDate;
	}
	/**
	   * �û���������(����ͳ����Ϸ����������Լ���֤������,δ���갲ȫ)
	   */
	public Date getUserBirthday() {
		return userBirthday;
	}
	/**
	   * �û���������(����ͳ����Ϸ����������Լ���֤������,δ���갲ȫ)
	   */
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	/**
	   * �û���������(һ����ѭĳЩ���ҷ��ɶ������ض���������Ϊ)
	   */
	public Integer getUserCountry() {
		return userCountry;
	}
	/**
	   * �û���������(һ����ѭĳЩ���ҷ��ɶ������ض���������Ϊ)
	   */
	public void setUserCountry(Integer userCountry) {
		this.userCountry = userCountry;
	}
	/**
	   * �û��˺�״̬(���ACV)
	   * 0-���� 1-��� 
	   */
	public Integer getUserState() {
		return userState;
	}
	/**
	   * �û��˺�״̬(���ACV)
	   * 0-���� 1-��� 
	   */
	public void setUserState(Integer userState) {
		this.userState = userState;
	}
	  
	  
	  
	  
	  
	  
	  
	  
}
