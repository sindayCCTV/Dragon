package Dragon.sinday.Service;

import java.util.List;
 
 
import Dragon.sinday.pojo.LTanComment; 

 

public interface LTanCommentDaoService {
	
	public List<LTanComment> selectToLTid(int ltid);
	
	
}
