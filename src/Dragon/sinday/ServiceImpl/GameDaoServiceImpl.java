package Dragon.sinday.ServiceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import Dragon.sinday.Dao.GameDao;
import Dragon.sinday.Service.GameDaoService;
import Dragon.sinday.pojo.Game;

@Service("gameService")  
public class GameDaoServiceImpl implements GameDaoService {

	@Resource
	private GameDao games;

	@Override
	public List<Game> SelectToGameName(String gameName) {
		// TODO Auto-generated method stub
		return games.selectToName(gameName);
	}

	@Override
	public Integer addGame(Game game) {
		// TODO Auto-generated method stub
		return games.addGame(game);
	}

	@Override
	public int delete(Integer Gid) {
		// TODO Auto-generated method stub
		return games.delete(Gid);
	}
	
 

 

}
