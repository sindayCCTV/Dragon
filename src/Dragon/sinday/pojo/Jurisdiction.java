package Dragon.sinday.pojo;

public class Jurisdiction {
	/**
	 * Ȩ��id
	 */
	private int jId;
	/**
	 * Ȩ������
	 */
	private String jName;
	/**
	 * Ȩ��·������λ
	 */
	private String jLocation;
	/**
	 * Ȩ�ޱ�ע���������Ȩ�޿�ʼ��¼ �� 1-21-3
	 */
	 private String jRemarks;
	/**
	 * jSuperiorJid�ϼ�Ȩ��id��
	 * @return
	 */
	 private int jSuperiorJid;
	/**
	 * ��Ȩ��Ϊ����Ȩ��
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
