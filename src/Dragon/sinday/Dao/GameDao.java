package Dragon.sinday.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.Game;

public interface GameDao {
	/**
	 * 
	 * @param 第几页
	 * @param  工具类有每页多少条
	 * @return
	 */
	public List<Game> allGame(@Param("indexGo")int indexGo);
	/**
	 * 
	 * @param gameName根据游戏名称查找游戏
	 * @return
	 */
	public List<Game> selectToName(@Param("gameName")String gameName);
	/**
	 * 增加游戏
	 */
	public Integer addGame(Game game);
	/**
	 * 删除游戏
	 */
	public int delete(Integer Gid);
	/**
	 * 
	 */
	
}
