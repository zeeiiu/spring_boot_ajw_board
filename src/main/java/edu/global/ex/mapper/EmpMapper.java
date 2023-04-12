package edu.global.ex.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.global.ex.vo.BoardVO;
import edu.global.ex.vo.EmpVO;


@Mapper
public interface EmpMapper {
	public List<EmpVO> getList();
	public EmpVO read(int empno); // 파라미터는 url로 넘어오는 bid값을 의미
	/*
	 * public int update(BoardVO board); // 글 수정 public int delete(BoardVO board);
	 * // 글 삭제 public int insert(BoardVO board); // 글 작성
	 * 
	 * 
	 * //답글관련 void updateShape(BoardVO board); // 답글위치 void insertReply(BoardVO
	 * board); // 답글등록
	 */
}
