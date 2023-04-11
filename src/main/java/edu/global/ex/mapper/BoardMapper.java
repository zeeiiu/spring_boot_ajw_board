package edu.global.ex.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.global.ex.vo.BoardVO;


@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();

}
