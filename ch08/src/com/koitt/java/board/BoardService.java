package com.koitt.java.board;

import java.util.Date;
import java.util.List;

	// 데이터 가공(계산) 할것들은 Service 클래스에서 한다. 
public class BoardService {
	
	private BoardDao dao;
	private Integer count;		// Integer의 기본값은 null이다.
	
	public BoardService() {
		this.dao = new BoardDao();
		count = 0;		// 0 초기화 
	}
	
	// insert
	public void add(Board b) throws BoardException {
		b.setId(++count);			// null값이었던 id값이 증가된다.
		b.setRegDate(new Date());	// new Date() 하는 순간의 시간이 저장된다. 
		this.dao.insert(b);			// 자료구조 ArrayList에 저장하기 위해 bao로 객체 b를 전달한다.
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
