package edu.global.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.global.ex.repository.BoardDAO;
import edu.global.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
@NoArgsConstructor

public class BoardServiceImpl implements BoardService {

	@Autowired // 주입 (injection)
	private BoardDAO dao;

	@Override

	public List<BoardVO> getList() { 
		log.info("getList()..");

		return dao.boardSelect();
	}

}