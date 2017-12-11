package Dragon.sinday.pojo;

public class GameDetails {
	
	/**
	 * 游戏详情流水号
	 */
	private int details;
	
	 
	/**
	 * 游戏介绍
	 */
	private String introduce;
	/**
	 * 分类别标签
	 */
	private String classify;
	/**
	 * 游戏视频(启用)
	 */
	private String video;
	/**
	 * 游戏版本
	 */
	private String edition;
	/**
	 * 游戏下载地址
	 */
	private String download;
	/**
	 * 游戏图片组
	 * @return
	 */
	private String detailspicture;
	
	
	
	public String getDetailspicture() {
		return detailspicture;
	}
	public void setDetailspicture(String detailspicture) {
		this.detailspicture = detailspicture;
	}
	public int getDetails() {
		return details;
	}
	public void setDetails(int details) {
		this.details = details;
	}
	 
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getDownload() {
		return download;
	}
	public void setDownload(String download) {
		this.download = download;
	}
	
	
}
