package edu.global.ex.service;

import java.util.List;
import edu.global.ex.page.Criteria;
import edu.global.ex.page.EmpDeptVO;
import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpVO;

public interface EmpService {
	public List<EmpVO> getList();
	public EmpVO get(int bno); // 글보기 메소드
	// 페이징 (paging)
		int getTotal();
		public List<EmpVO> getList(Criteria criteria); // 리스트 메소드
		
		// 1:N 처리
		public List<EmpDeptVO> getEmpDeptOneVOList();
		public List<DeptVO> getEmpDeptList();
		
		// 둘 중에 하나만 사용하면 됨. Use one.
}