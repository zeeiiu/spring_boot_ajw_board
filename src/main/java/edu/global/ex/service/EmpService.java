package edu.global.ex.service;

import java.util.List;

import edu.global.ex.vo.BoardVO;
import edu.global.ex.vo.EmpVO;

public interface EmpService {
	public List<EmpVO> getList();
	public EmpVO get(int bno); // 글보기 메소드
	
}