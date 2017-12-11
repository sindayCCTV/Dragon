package Dragon.sinday.Service;

import java.util.List;
 

import Dragon.sinday.pojo.GameLabel;

 

public interface GameLabelDaoService {
	
	public List<GameLabel> SelectAll();
	 /*
	  * 增加
	  */
	public Integer addlabel(GameLabel label);
	/**
	 * 使用次数加一
	 */
	public void addCount(int id);
	/**
	 * 是否存在(或者按名字查询)
	 */
	public GameLabel selectISNO(String name);
	
	
}
