package edu.global.ex.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.EmpVO;


@Mapper
public interface EmpMapper {
	public List<EmpVO> getList();
	public EmpVO read(int empno); // 파라미터는 url로 넘어오는 bid값을 의미
	
	
	//페이징
		//paging 관련
		   int getTotalCount();   
		   public List<EmpVO> getListWithPaging(Criteria cri);
}
