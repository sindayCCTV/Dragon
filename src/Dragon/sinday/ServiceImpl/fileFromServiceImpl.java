package Dragon.sinday.ServiceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import Dragon.sinday.Dao.fileFromDao;
import Dragon.sinday.Service.fileFromService;
import Dragon.sinday.pojo.fileFrom;

@Service("fileFromService")
public class fileFromServiceImpl implements fileFromService {

	@Resource fileFromDao ffdao;
	
	@Override
	public Integer addOne(fileFrom gamed) {
		// TODO Auto-generated method stub
	 System.out.println("server++++++"+gamed.getfPath());
		return ffdao.addOne(gamed);
	}

}
