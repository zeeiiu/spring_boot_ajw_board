package edu.global.ex.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.global.ex.page.EmpDeptVO;



@Mapper
public interface DeptMapper {
	public List<EmpDeptVO> getEmpDeptOneVOList();
}
