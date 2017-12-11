package Dragon.sinday.ServiceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import Dragon.sinday.Dao.GameDetailsDao;
import Dragon.sinday.Service.GameDetailsService;
import Dragon.sinday.pojo.GameDetails;

@Service("GameDetailsService")
public class GameDetailsServiceImpl implements GameDetailsService {

	@Resource
	private GameDetailsDao gamdao;
	
	@Override
	public Integer addOne(GameDetails gamed) {
		// TODO Auto-generated method stub
		return gamdao.addOne(gamed);
	}

}
