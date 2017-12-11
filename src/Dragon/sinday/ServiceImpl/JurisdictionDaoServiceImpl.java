package Dragon.sinday.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import Dragon.sinday.Dao.JurisdictionDao;
import Dragon.sinday.Service.JurisdictionDaoService;
import Dragon.sinday.pojo.Jurisdiction;
@Service("JurisdictionService")  
public class JurisdictionDaoServiceImpl implements JurisdictionDaoService {

	@Resource
	private JurisdictionDao jsdao;
	
	@Override
	public List<Jurisdiction> selectToid(Integer[] jid) {
		// TODO Auto-generated method stub
		return  jsdao.selectToid(jid);
	}

}
