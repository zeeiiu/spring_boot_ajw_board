package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String content_view(BoardVO boardVO, Model model) {

		log.info("content_view...");

		int bid = boardVO.getBid();

		boardVO = boardService.get(bid);

		model.addAttribute("content_view", boardVO); // getList()를 통해서 dao.biardSelect()를 가지고 온다.

		return "/board/content_view";

	}

}
