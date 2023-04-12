package edu.global.ex.service;


import java.util.List;

import edu.global.ex.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
	public BoardVO get(int bno);
	int modify(BoardVO board);
	int remove(BoardVO board); // 글 삭제
	int register(BoardVO board); // 글 작성 (writting)
	void registerReply(BoardVO board); // 댓글 작성
	
}