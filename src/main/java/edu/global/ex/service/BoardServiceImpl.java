package edu.global.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import edu.global.ex.mapper.BoardMapper;
import edu.global.ex.repository.BoardDAO;
import edu.global.ex.vo.BoardVO;
import edu.global.ex.vo.GradeVO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor

public class BoardServiceImpl implements BoardService {

	@Autowired // 주입 (injection)
	private final BoardMapper mapper;

	@Override
	public List<BoardVO> getList() {
		log.info("getList()..");

		return mapper.getList();
	}

	@Override
	public BoardVO get(int bno) {
		log.info("get(int bne)..");
		return null;
	}

	/*
	 * package edu.global.ex.service;
	 * 
	 * import java.util.List; import
	 * org.springframework.beans.factory.annotation.Autowired; import
	 * org.springframework.dao.support.DaoSupport; import
	 * org.springframework.stereotype.Service;
	 * 
	 * import edu.global.ex.mapper.BoardMapper; import
	 * edu.global.ex.repository.BoardDAO; import edu.global.ex.vo.BoardVO; import
	 * edu.global.ex.vo.GradeVO; import lombok.AllArgsConstructor; import
	 * lombok.NoArgsConstructor; import lombok.RequiredArgsConstructor; import
	 * lombok.extern.slf4j.Slf4j;
	 * 
	 * @Slf4j
	 * 
	 * @Service
	 * 
	 * @RequiredArgsConstructor
	 * 
	 * public class BoardServiceImpl2 implements BoardService {
	 * 
	 * @Autowired // 주입 (injection) private final BoardMapper mapper;
	 * 
	 * 
	 * @Override public List<BoardVO> getList() { log.info("getList()..");
	 * 
	 * 
	 * return mapper.getList(); }
	 * 
	 * 
	 * 
	 * @Override public BoardVO get(int bno) { log.info("get(int bne).."); return
	 * dao.contentView(bno); }
	 * 
	 * 
	 * 
	 * }
	 */

}