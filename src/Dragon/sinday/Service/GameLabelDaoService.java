package Dragon.sinday.Service;

import java.util.List;
 

import Dragon.sinday.pojo.GameLabel;

 

public interface GameLabelDaoService {
	
	public List<GameLabel> SelectAll();
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
