package Dragon.sinday.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

 
import org.springframework.stereotype.Component;

import Dragon.sinday.pojo.LTanComment;
 
@Component(value="myLTCdao")
public interface LTanCommentDao {
 
	/**
	 * 
	 * @param ���ݽ�ɫid������Ϸ
	 * @return				selectToLTid
	 */
	public List<LTanComment> oneId(int voids);
	
	
	
}
