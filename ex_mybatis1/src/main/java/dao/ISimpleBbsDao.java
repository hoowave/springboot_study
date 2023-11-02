package dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import dto.SimpleBbsDto;

@Mapper
public interface ISimpleBbsDao {
	public List<SimpleBbsDto> listdao();

	public SimpleBbsDto viewDao(String id);

	public int writerDao(String writer, String title, String content);

	public int deleteDao(String id);
}
