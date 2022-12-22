package com.spring.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.board.BoardService;
import com.spring.biz.board.BoardVO;
import com.sun.org.apache.bcel.internal.generic.LLOAD;
import com.sun.xml.internal.txw2.IllegalAnnotationException;

@Service("boardService")
public class BoardserviceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void insertBoard(BoardVO vo) {
		// 여러 비지니스 로직이 들어감
		// 1. logging
//		if (vo.getSeq() == 0) {
//			throw new IllegalAnnotationException("0번 글은 등록할 수 없습니다.");
//		}
		boardDAO.insertBoard(vo);
		// 2. transaction
		// 3. logging
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}

}
