package Dragon.sinday.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.GameLabel;

public interface GameLabelDao {
	/**
	 * 查询热度最高的十条标签
	 * @return
	 */
	public List<GameLabel> allGameLable();
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
