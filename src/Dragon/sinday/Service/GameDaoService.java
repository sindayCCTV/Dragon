package Dragon.sinday.Service;

import java.util.List;

import Dragon.sinday.pojo.Game;

 

public interface GameDaoService {
	public List<Game> SelectToGameName(String gameName);
 
	/**
	 * 增加游戏
	 */
	public Integer addGame(Game game);
	/**
	 * 删除游戏
	 */
	public int delete(Integer Gid);
	
	
}
