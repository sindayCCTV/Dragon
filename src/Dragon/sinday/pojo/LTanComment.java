package Dragon.sinday.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class LTanComment {
	/**
	 * 评论序列号
	 */
	private Integer cId;
	 
	/**
	 * 谁评论的
	 */
	private String c_userCode;
	/**
	 * 评论类容
	 */
	private String cText;
	/**
	 * 评论图片
	 */
	private String images;
	/**
	 * 属于哪个帖子
	 */
	
	private Integer lTId;
	/**
	 * 成立时间
	 */ 
	private Date cTime;
	
	public Date getcTime() {
		return cTime;
	}
	public void setcTime(Date cTime) {
		this.cTime = cTime;
	}
	 
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	 
	public String getC_userCode() {
		return c_userCode;
	}
	public void setC_userCode(String c_userCode) {
		this.c_userCode = c_userCode;
	}
	public String getcText() {
		return cText;
	}
	public void setcText(String cText) {
		this.cText = cText;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Integer getlTId() {
		return lTId;
	}
	public void setlTId(Integer lTId) {
		this.lTId = lTId;
	}
	
	
}
