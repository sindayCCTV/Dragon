package Dragon.sinday.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.GameLabel;

public interface GameLabelDao {
	/**
	 * ��ѯ�ȶ���ߵ�ʮ����ǩ
	 * @return
	 */
	public List<GameLabel> allGameLable();
	 /*
	  * ����
	  */
	public Integer addlabel(GameLabel label);
	/**
	 * ʹ�ô�����һ
	 */
	public void addCount(int id);
	/**
	 * �Ƿ����(���߰����ֲ�ѯ)
	 */
	public GameLabel selectISNO(String name);
	
}
