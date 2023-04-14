package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.global.ex.page.Criteria;
import edu.global.ex.page.PageVO;
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
	
	@GetMapping("/emp_list2")
	   public String list2(Criteria cri, Model model) {
	      log.info("emp_list2() ..");
	      log.info("emp_list2() Criteria " + cri);      
	      
	      model.addAttribute("emps", empService.getList(cri));
	      
	      // 페이징을 위한 처리
	      int total = empService.getTotal();
	      log.info("total" + total);         
	      
	      model.addAttribute("pageMaker", new PageVO(cri, total));   
	      
	      return "/emp/emp_list2";
	   }
	
	@GetMapping("/dept1")
	   public String dept1() {
	      log.info("dept1() ..");
	    
            System.out.println(empService.getEmpDeptOneVOList());
	      
	   
	      return "/emp/emp_list2";
	   }
	
	
}
