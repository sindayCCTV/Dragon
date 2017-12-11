package Dragon.sinday.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Dragon.sinday.pojo.Game;

public interface GameDao {
	/**
	 * 
	 * @param �ڼ�ҳ
	 * @param  ��������ÿҳ������
	 * @return
	 */
	public List<Game> allGame(@Param("indexGo")int indexGo);
	/**
	 * 
	 * @param gameName������Ϸ���Ʋ�����Ϸ
	 * @return
	 */
	public List<Game> selectToName(@Param("gameName")String gameName);
	/**
	 * ������Ϸ
	 */
	public Integer addGame(Game game);
	/**
	 * ɾ����Ϸ
	 */
	public int delete(Integer Gid);
	/**
	 * 
	 */
	
}
