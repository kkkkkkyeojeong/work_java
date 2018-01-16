package com.koitt.java.board;

import java.util.List;

public class BoardService {
	
	private BoardDao dao;
	private Integer count = 1;
	
	public BoardService() {
		this.dao = new BoardDao();
	}
	
	// insert
	public void add(Board b) throws BoardException {
		b.setId(count++);
		dao.insert(b);
	}
	// read
	public List<Board> read() {
		return dao.selectAll();
	}
	// delete
	public void remove(Board b) throws BoardException {
		dao.delete(b);
	}
	// update
	public void modify(Board b) throws BoardException {
		dao.update(b);
	}
}
