package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.global.ex.service.BoardService;
import edu.global.ex.service.EmpService;
import edu.global.ex.vo.BoardVO;
import edu.global.ex.vo.EmpVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j // 로그
@Controller
@RequestMapping("/emp/*")
@RequiredArgsConstructor
public class EmpController {

	@Autowired
//	private BoardService boardService;
	private final EmpService empService;

	@GetMapping("/list")
	public String view_list(Model model) {
		log.info("view_list().." + empService.getList());

		model.addAttribute("emps", empService.getList());

		return "/emp/emp_list";
	}

	@GetMapping("/empContent_view")
	public String content_view(EmpVO empVO, Model model) {

		log.info("empContent_view..." + empVO);

		int empno = empVO.getEmpno();

		empVO = empService.get(empno);

		model.addAttribute("empContent_view", empVO); // getList()를 통해서 dao.biardSelect()를 가지고 온다.

		return "/emp/empContent_view";

	}

}
