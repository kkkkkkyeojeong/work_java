package com.koitt.java.board;

import java.util.Date;

public class Board {
	
	private Integer id;				// 게시물 번호
	private String title; 		// 제목
	private String content;		// 내용
	private String writer;		// 작성자
	private Date regDate;		// 작성일 
	
	// 기본생성자
	public Board() {}
	// 전체생성자
	public Board(Integer id, String title, String content, String writer, Date regDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}

	// getter, setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if (!(obj instanceof Board)) {
			return false;
		}
		Board b = (Board) obj;
		if(this.id == b.id) {
			return true;
		}
		return false;
	}
	
	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [게시물 번호 = ");
		builder.append(id);
		builder.append(", 제목 = ");
		builder.append(title);
		builder.append(", 내용 = ");
		builder.append(content);
		builder.append(", 작성자 = ");
		builder.append(writer);
		builder.append(", 작성일 = ");
		builder.append(regDate);
		builder.append("]");
		return builder.toString();
	}
	
	// hashcode
	@Override
	public int hashCode() {
		return this.id + this.title.hashCode() + this.content.hashCode() + this.writer.hashCode()
				+ this.regDate.hashCode();
	}
}
	

