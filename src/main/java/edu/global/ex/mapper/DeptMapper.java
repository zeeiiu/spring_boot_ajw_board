package edu.global.ex.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.global.ex.page.EmpDeptVO;
import edu.global.ex.vo.DeptVO;



@Mapper
public interface DeptMapper {
	public List<EmpDeptVO> getEmpDeptOneVOList();
	public List<DeptVO> getEmpDeptList();
 

}
