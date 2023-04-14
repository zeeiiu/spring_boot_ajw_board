package edu.global.ex.service;

import java.util.List;
import edu.global.ex.page.Criteria;
import edu.global.ex.page.EmpDeptVO;
import edu.global.ex.vo.EmpVO;

public interface EmpService {
	public List<EmpVO> getList();
	public EmpVO get(int bno); // 글보기 메소드
	// 페이징 (paging)
		int getTotal();
		public List<EmpVO> getList(Criteria criteria); // 리스트 메소드
		
		// 1:N 처리
		public List<EmpDeptVO> getEmpDeptOneVOList();
		
}