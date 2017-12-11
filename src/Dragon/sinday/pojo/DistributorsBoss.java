package Dragon.sinday.pojo;

public class DistributorsBoss {
	/**
	 * 开发商ID
	 */
	private Integer distrId;
	/**
	 * 开发商全称
	 */
	private String disName;
	/**
	 * 开发商自位介绍
	 */
	private String disIntroduce;
	/**
	 * 开发商联系电话
	 */
	private String disPhone;
	/**
	 * 是否以签约 可发售游戏
	 */
	private int isPass;
	/**
	 * 上级公司Id
	 */
	private int upperDis; 
	
	
	
	
	/**
	 * 上级公司Id
	 */
	public int getUpperDis() {
		return upperDis;
	}
	/**
	 * 上级公司Id
	 */
	public void setUpperDis(int upperDis) {
		this.upperDis = upperDis;
	}
	public Integer getDistrId() {
		return distrId;
	}
	public void setDistrId(Integer distrId) {
		this.distrId = distrId;
	}
	public String getDisName() {
		return disName;
	}
	public void setDisName(String disName) {
		this.disName = disName;
	}
	/**
	 * 开发商自位介绍
	 */
	public String getDisIntroduce() {
		return disIntroduce;
	}
	/**
	 * 开发商自位介绍
	 */
	public void setDisIntroduce(String disIntroduce) {
		this.disIntroduce = disIntroduce;
	}
	public String getDisPhone() {
		return disPhone;
	}
	public void setDisPhone(String disPhone) {
		this.disPhone = disPhone;
	}
	/**
	 * 是否以签约 可发售游戏
	 */
	public int getIsPass() {
		return isPass;
	}
	/**
	 * 是否以签约 可发售游戏
	 */
	public void setIsPass(int isPass) {
		this.isPass = isPass;
	}
	
	
	
	
	
	
}
