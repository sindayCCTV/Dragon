package Dragon.sinday.ServiceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
 
import Dragon.sinday.Dao.GameLabelDao; 
import Dragon.sinday.Service.GameLabelDaoService; 
import Dragon.sinday.pojo.GameLabel;

@Service("gameLabelService")  
public class GameLabelDaoServiceImpl implements GameLabelDaoService {

	@Resource
	private GameLabelDao gamelabel;
	
	@Override
	public List<GameLabel> SelectAll() {
		// TODO Auto-generated method stub
		return gamelabel.allGameLable();
	}

	@Override
	public Integer addlabel(GameLabel label) {
		// TODO Auto-generated method stub
		return gamelabel.addlabel(label);
	}

	@Override
	public void addCount(int id) {
		// TODO Auto-generated method stub
		gamelabel.addCount(id);
	}

	@Override
	public GameLabel selectISNO(String name) {
		// TODO Auto-generated method stub
		return gamelabel.selectISNO(name);
	}

 
	
 

 

}
