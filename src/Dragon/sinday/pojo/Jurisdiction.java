package Dragon.sinday.pojo;

public class Jurisdiction {
	/**
	 * 权限id
	 */
	private int jId;
	/**
	 * 权限名称
	 */
	private String jName;
	/**
	 * 权限路径，定位
	 */
	private String jLocation;
	/**
	 * 权限备注：从最顶级的权限开始记录 如 1-21-3
	 */
	 private String jRemarks;
	/**
	 * jSuperiorJid上级权限id、
	 * @return
	 */
	 private int jSuperiorJid;
	/**
	 * 该权限为几级权限
	 * @return
	 */
	private int jLive;
	 
	
	public int getjLive() {
		return jLive;
	}
	public void setjLive(int jLive) {
		this.jLive = jLive;
	}
	public String getjRemarks() {
		return jRemarks;
	}
	public void setjRemarks(String jRemarks) {
		this.jRemarks = jRemarks;
	}
	public int getjSuperiorJid() {
		return jSuperiorJid;
	}
	public void setjSuperiorJid(int jSuperiorJid) {
		this.jSuperiorJid = jSuperiorJid;
	}
	/*public int getRegion() {
		return region;
	}
	public void setRegion(int region) {
		this.region = region;
	}*/
	public int getjId() {
		return jId;
	}
	public void setjId(int jId) {
		this.jId = jId;
	}
	public String getjName() {
		return jName;
	}
	public void setjName(String jName) {
		this.jName = jName;
	}
	public String getjLocation() {
		return jLocation;
	}
	public void setjLocation(String jLocation) {
		this.jLocation = jLocation;
	}
	
 
}
