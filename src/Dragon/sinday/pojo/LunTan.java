package Dragon.sinday.pojo;

 

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class LunTan {
	/**
	 * ��̳���к�
	 */
	private Integer lTid;
	/**
	 * ����̳��˭����
	 */
	private String userCode;
	/**
	 * ����ʱ��
	 */
	@DateTimeFormat
	private Date newTimes;
 
	/**
	 * ��̳����
	 */
	private String lTName;
	/**
	 * ��̳ͼƬ
	 */
	private String images;
	/**
	 * ��̳����
	 */
	private String lTtext;
	/**
	 * ��̳��Щ�˿ɼ�
	 */
	private int lTWhoSee;
	/**
	 * ��̳��������
	 */
	private int howMatchGood;
	/**
	 * ��̳����
	 * @return
	 */
	private String faceIamge;
	
	
	
	
	
	public String getFaceIamge() {
		return faceIamge;
	}
	public void setFaceIamge(String faceIamge) {
		this.faceIamge = faceIamge;
	}
	public Integer getlTid() {
		return lTid;
	}
	public void setlTid(Integer lTid) {
		this.lTid = lTid;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public Date getNewTimes() {
		return newTimes;
	}
	public void setNewTimes(Date newTimes) {
		this.newTimes = newTimes;
	}
 
	public String getlTName() {
		return lTName;
	}
	public void setlTName(String lTName) {
		this.lTName = lTName;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getlTtext() {
		return lTtext;
	}
	public void setlTtext(String lTtext) {
		this.lTtext = lTtext;
	}
	public int getlTWhoSee() {
		return lTWhoSee;
	}
	public void setlTWhoSee(int lTWhoSee) {
		this.lTWhoSee = lTWhoSee;
	}
	public int getHowMatchGood() {
		return howMatchGood;
	}
	public void setHowMatchGood(int howMatchGood) {
		this.howMatchGood = howMatchGood;
	}
	 
	
	
}