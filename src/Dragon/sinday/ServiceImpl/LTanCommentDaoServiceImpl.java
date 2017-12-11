package Dragon.sinday.ServiceImpl;

 

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
 



import Dragon.sinday.Dao.LTanCommentDao; 
import Dragon.sinday.Service.LTanCommentDaoService; 
import Dragon.sinday.pojo.LTanComment; 

@Service("ltcomm")  
public class LTanCommentDaoServiceImpl implements LTanCommentDaoService {

	@Resource(name="myLTCdao")
	private LTanCommentDao lTanCommentDao;

	@Override
	public List<LTanComment> selectToLTid(int ltid) {
		// TODO Auto-generated method stub
		return lTanCommentDao.oneId(ltid);
	}
 
	 

 

}
