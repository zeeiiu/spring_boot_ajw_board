package edu.global.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.global.ex.mapper.DeptMapper;
import edu.global.ex.mapper.EmpMapper;
import edu.global.ex.page.Criteria;
import edu.global.ex.page.EmpDeptVO;
import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor

public class EmpServiceImpl implements EmpService {

	@Autowired
	private final DeptMapper deptMapper;

	@Override
	public int getTotal() {
		log.info("getTotal()..");

		return mapper.getTotalCount();
	}

	private final EmpMapper mapper;

	@Override
	public List<EmpVO> getList(Criteria criteria) {
		log.info("getList(Criteria criteria)");

		return mapper.getListWithPaging(criteria);
	}

	@Override
	public EmpVO get(int empno) {
		// TODO Auto-generated method stub
		return mapper.read(empno);
	}

	@Override
	public List<EmpVO> getList() {
		log.info("getList()..");

		return mapper.getList();
	}

	@Override
	public List<EmpDeptVO> getEmpDeptOneVOList() {

		return deptMapper.getEmpDeptOneVOList();
	}

	@Override
	public List<DeptVO> getEmpDeptList() {

		return deptMapper.getEmpDeptList();
	}

}