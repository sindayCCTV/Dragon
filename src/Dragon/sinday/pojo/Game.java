package Dragon.sinday.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Game {
	/**
	 * ����ϷΨһ��ʶID
	 */
	private Integer gameId;
	/**
	 * ����Ϸ����
	 */
	private String gameName;
	/**
	 * ����Ϸ������
	 */
	private Integer distributors;
	/**
	 * ����Ϸ��ϸ��Ϣ
	 */
	private Integer details;
	/**
	 * ����Ϸ���۰ٷֱ� ����:-60%
	 */
	private Integer discount;
	
	/**
	 * ����Ϸ��ҳ��ʾͼƬ
	 */
	private String gameImage;
	/**
	 * ��������
	 */
	@DateTimeFormat
	private Date gameSale;
	/**
	 * �۸�
	 */
	private int gamePrice;
	/**
	 * ������� 9999�ǲ����
	 */
	private int countryNotVIP;
	/**
	 * ����� 9999�ǲ����
	 * @return
	 */
	private int ageBans;
	/**
	 * examine�Ƿ����1 λok 0λû�� 2��� 3�ܾ�
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
	 * �۸�
	 */
	public int getGamePrice() {
		return gamePrice;
	}
	/**
	 * �۸�
	 */
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	/**
	 * ��������
	 */
	public Date getGameSale() {
		return gameSale;
	}
	/**
	 * ��������
	 */
	public void setGameSale(Date gameSale) {
		this.gameSale = gameSale;
	}
	/**
	 * ����Ϸ��ҳ��ʾͼƬ
	 */
	public String getGameImage() {
		return gameImage;
	}
	/**
	 * ����Ϸ��ҳ��ʾͼƬ
	 */
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	/**
	 * ����Ϸ���۰ٷֱ� ����:-60%
	 */
	public Integer getDiscount() {
		return discount;
	}
	/**
	 * ����Ϸ���۰ٷֱ� ����:-60%
	 */
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	/**
	 * ����ϷΨһ��ʶID
	 */
	public Integer getGameId() {
		return gameId;
	}
	/**
	 * ����ϷΨһ��ʶID
	 */
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	/**
	 * ����Ϸ����
	 */
	public String getGameName() {
		return gameName;
	}
	/**
	 * ����Ϸ����
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	/**
	 * ����Ϸ������
	 */
	public Integer getDistributors() {
		return distributors;
	}
	/**
	 * ����Ϸ������
	 */
	public void setDistributors(Integer distributors) {
		this.distributors = distributors;
	}
	/**
	 * ����Ϸ��ϸ��Ϣ
	 */
	public Integer getDetails() {
		return details;
	}
	/**
	 * ����Ϸ��ϸ��Ϣ
	 */
	public void setDetails(Integer details) {
		this.details = details;
	}
	
	
	
	
}
