package Dragon.sinday.Service;

import java.util.List;

import Dragon.sinday.pojo.Game;

 

public interface GameDaoService {
	public List<Game> SelectToGameName(String gameName);
 
	/**
	 * ������Ϸ
	 */
	public Integer addGame(Game game);
	/**
	 * ɾ����Ϸ
	 */
	public int delete(Integer Gid);
	
	
}
