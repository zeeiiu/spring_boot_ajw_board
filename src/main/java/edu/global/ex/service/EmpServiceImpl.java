package edu.global.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;
import edu.global.ex.repository.BoardDAO;
import edu.global.ex.repository.EmpDAO;
import edu.global.ex.vo.BoardVO;
import edu.global.ex.vo.EmpVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor

public class EmpServiceImpl implements EmpService {

	@Autowired // 주입 (injection)
	private final EmpDAO dao; // final까지 적어줘야지 @RequiredArgsConstructor과 궁합이 맞게 되어 생성자 주입이 됨.
								// 수많은 개발자들은 final 잘 안적음.

	@Override
	public List<EmpVO> getList() {
		log.info("getList()..");

		return dao.empSelect();
	}

	@Override
	public EmpVO get(int bno) {
		log.info("get(int bne)..");

		return dao.contentView(bno);
	}

}