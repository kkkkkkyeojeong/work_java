package com.koitt.java.board.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.koitt.java.board.dao.BoardDao;
import com.koitt.java.board.exception.BoardException;
import com.koitt.java.board.model.Board;
import com.koitt.java.util.FileManager;

public class BoardService {
	
	private BoardDao dao;
	
	public BoardService() {
		this.dao = new BoardDao();
	}

	public void add(Board board) throws BoardException, SQLException {
		this.dao.insert(board);			// 자료구조(ArrayList)에 저장하기 위해 dao로 board 객체를 전달
	}
	

	public List<Board> read() throws SQLException {
		return dao.selectAll();
	}
	
	public void remove(Board board) throws BoardException, SQLException {
		dao.delete(board);
	}
	
	public void modify(Board board) throws BoardException, SQLException {
		board.setModiDate(new Date());
		dao.update(board);
	}
	
	public boolean isExist(Board board) throws SQLException {
		return dao.isExist(board);
	}
}
