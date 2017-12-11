package Dragon.sinday.pojo;

public class Role {
	//角色id
	private int rId;
	//角色名称
	private String rName;
	//角色拥有权限 jurisdiction 列如:1,2,3,44,21
	private String rLocation;
	
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getrLocation() {
		return rLocation;
	}
	public void setrLocation(String rLocation) {
		this.rLocation = rLocation;
	}
	
}
