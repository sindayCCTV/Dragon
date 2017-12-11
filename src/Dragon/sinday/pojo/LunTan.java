package Dragon.sinday.pojo;

 

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class LunTan {
	/**
	 * 论坛序列号
	 */
	private Integer lTid;
	/**
	 * 该论坛是谁创建
	 */
	private String userCode;
	/**
	 * 创建时间
	 */
	@DateTimeFormat
	private Date newTimes;
 
	/**
	 * 论坛名称
	 */
	private String lTName;
	/**
	 * 论坛图片
	 */
	private String images;
	/**
	 * 论坛类容
	 */
	private String lTtext;
	/**
	 * 论坛哪些人可见
	 */
	private int lTWhoSee;
	/**
	 * 论坛点赞人数
	 */
	private int howMatchGood;
	/**
	 * 论坛封面
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