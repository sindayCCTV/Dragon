package Dragon.sinday.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class LTanComment {
	/**
	 * �������к�
	 */
	private Integer cId;
	 
	/**
	 * ˭���۵�
	 */
	private String c_userCode;
	/**
	 * ��������
	 */
	private String cText;
	/**
	 * ����ͼƬ
	 */
	private String images;
	/**
	 * �����ĸ�����
	 */
	
	private Integer lTId;
	/**
	 * ����ʱ��
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
