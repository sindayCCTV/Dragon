package Dragon.sinday.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Game {
	/**
	 * 该游戏唯一标识ID
	 */
	private Integer gameId;
	/**
	 * 该游戏名称
	 */
	private String gameName;
	/**
	 * 该游戏发行商
	 */
	private Integer distributors;
	/**
	 * 该游戏详细信息
	 */
	private Integer details;
	/**
	 * 该游戏打折百分比 列如:-60%
	 */
	private Integer discount;
	
	/**
	 * 该游戏首页显示图片
	 */
	private String gameImage;
	/**
	 * 发售日期
	 */
	@DateTimeFormat
	private Date gameSale;
	/**
	 * 价格
	 */
	private int gamePrice;
	/**
	 * 封禁国家 9999是不封禁
	 */
	private int countryNotVIP;
	/**
	 * 年龄禁 9999是不封禁
	 * @return
	 */
	private int ageBans;
	/**
	 * examine是否审核1 位ok 0位没有 2打回 3拒绝
	 * @return
	 */
	
	
	
	public int getAgeBans() {
		return ageBans;
	}
	public void setAgeBans(int ageBans) {
		this.ageBans = ageBans;
	}
	public int getCountryNotVIP() {
		return countryNotVIP;
	}
	public void setCountryNotVIP(int countryNotVIP) {
		this.countryNotVIP = countryNotVIP;
	}
	/**
	 * 价格
	 */
	public int getGamePrice() {
		return gamePrice;
	}
	/**
	 * 价格
	 */
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	/**
	 * 发售日期
	 */
	public Date getGameSale() {
		return gameSale;
	}
	/**
	 * 发售日期
	 */
	public void setGameSale(Date gameSale) {
		this.gameSale = gameSale;
	}
	/**
	 * 该游戏首页显示图片
	 */
	public String getGameImage() {
		return gameImage;
	}
	/**
	 * 该游戏首页显示图片
	 */
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	/**
	 * 该游戏打折百分比 列如:-60%
	 */
	public Integer getDiscount() {
		return discount;
	}
	/**
	 * 该游戏打折百分比 列如:-60%
	 */
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	/**
	 * 该游戏唯一标识ID
	 */
	public Integer getGameId() {
		return gameId;
	}
	/**
	 * 该游戏唯一标识ID
	 */
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	/**
	 * 该游戏名称
	 */
	public String getGameName() {
		return gameName;
	}
	/**
	 * 该游戏名称
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	/**
	 * 该游戏发行商
	 */
	public Integer getDistributors() {
		return distributors;
	}
	/**
	 * 该游戏发行商
	 */
	public void setDistributors(Integer distributors) {
		this.distributors = distributors;
	}
	/**
	 * 该游戏详细信息
	 */
	public Integer getDetails() {
		return details;
	}
	/**
	 * 该游戏详细信息
	 */
	public void setDetails(Integer details) {
		this.details = details;
	}
	
	
	
	
}
