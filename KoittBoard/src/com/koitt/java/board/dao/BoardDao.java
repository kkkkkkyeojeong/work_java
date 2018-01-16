package com.koitt.java.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.model.Board;

public class BoardDao {

	private List<Board> board;
	
	public BoardDao() {
		this.board = new ArrayList<Board>();
	}
	
	// insert
	public void insert(Board board) {
		this.board.add(board);
	}
	
	// read
	
	// remove
	
	// update
	
}

