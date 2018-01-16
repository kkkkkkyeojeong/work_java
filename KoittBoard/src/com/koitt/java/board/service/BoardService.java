package com.koitt.java.board.service;

import com.koitt.java.board.dao.BoardDao;
import com.koitt.java.board.model.Board;

// Business Logic - 추가, 처리 부분 여기에 작성
public class BoardService {
	
	private BoardDao dao;
	
	public BoardService() {
		this.dao = new BoardDao();
	}
	
	// insert - add로 메소드 생성
	public void add(Board board) {
		this.dao.insert(board);
	}

}
