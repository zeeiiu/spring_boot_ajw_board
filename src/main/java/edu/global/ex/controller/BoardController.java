package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.global.ex.service.BoardService;
import edu.global.ex.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j // 로그
@Controller
@RequestMapping("/jboard/*")
@RequiredArgsConstructor
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/list")
	public String view_list(Model model) {
		log.info("view_list()..");

		model.addAttribute("boards", boardService.getList());

		return "/board/list";
	}

	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) { //뷰로 값을 넘기고 싶을 때 모델을 쓴다. $를 쓰고 싶을 때

		log.info("content_view...");

		int bid = boardVO.getBid();

		boardVO = boardService.get(bid);

		model.addAttribute("content_view", boardVO); // getList()를 통해서 dao.biardSelect()를 가지고 온다.

		return "/board/content_view";

	}

	@PostMapping("/modify")
	public String modify(BoardVO boardVO, Model model) {

		log.info("modify...");

		int rn = boardService.modify(boardVO);

		log.info("modify...::" + rn);
		model.addAttribute("content_view", boardVO); // getList()를 통해서 dao.biardSelect()를 가지고 온다.

		return "redirect:list"; /* 유저로 하여금 리스트를 치고 들어와라. */

	}

	@GetMapping("/delete")
	public String delete(BoardVO boardVO, Model model) {
		
		log.info("delete...");
		
		int rn = boardService.remove(boardVO);
		
		log.info("delete...::" + rn);
		model.addAttribute("content_view", boardVO); // getList()를 통해서 dao.biardSelect()를 가지고 온다.
		
		return "redirect:list"; /* 유저로 하여금 리스트를 치고 들어와라. */
		
	}

	@GetMapping("/write_view")
	public String write_view() {
		
		
		return "/board/write_view"; 
		
	}
	
	@PostMapping("/write")
	public String write(BoardVO boardVO) {

		log.info("write()..");
		int rn = boardService.register(boardVO);
		
		return "redirect:list"; /* 유저로 하여금 리스트를 치고 들어와라. */
		
	}

	//http://localhost:8282/jboard/reply_view?bid=43
	@GetMapping("/reply_view")
	public String reply_view(BoardVO boardVO, Model model) {
		
		log.info("reply_view()..");
		model.addAttribute("reply_view", boardService.get(boardVO.getBid()));
		
		return "/board/reply_view";
		
	}
	
	//http://localhost:8282/jboard/reply
	@PostMapping("/reply")
	public String reply(BoardVO boardVO) {

		log.info("reply()..");
		boardService.registerReply(boardVO);
		
		return "redirect:list"; /* 로직 수행 후 유저로 하여금 리스트를 치고 들어와라. */
		
	}
}


