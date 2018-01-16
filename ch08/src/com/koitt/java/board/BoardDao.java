package com.koitt.java.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	List<Board> board;
	
	public BoardDao() {
		this.board = new ArrayList<Board>();
	}

	// insert 
	public void insert(Board b)	throws BoardException{
		// list에서 중복된 게시글 찾기
		for(Board item : this.board) {
			if(item.equals(b)){
				throw new BoardException("E01: 게시글이 중복됩니다.");
			}
		}
		this.board.add(b);
	}
	
	// 전체 목록 가져오기 
	public List<Board> selectAll() {
		return this.board;
	}
	
	// 입력받은 객체를 list에서 제거
	public void delete(Board b) throws BoardException {
		for (Board item : this.board) {
			if (item.equals(b)) {
				board.remove(item);
				return;
			}
		}
		throw new BoardException("E02: 삭제할 내용이 없습니다.");
	}
	
	// 동일한 객체 정보 새로 입력받기 
	public void update(Board b) throws BoardException {
		for(Board item : this.board) {
			if(item.equals(b)) {
				item.setTitle(b.getTitle());
                item.setContent(b.getContent());
                item.setWriter(b.getWriter());
				return;
			}
		}
		throw new BoardException("E03: 수정할 내용이 없습니다.");
	}
}
