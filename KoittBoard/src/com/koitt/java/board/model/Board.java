package com.koitt.java.board.model;

import java.util.Date;

// Java Bean
public class Board {

	// 1. 멤버변수 
	private Integer id; 	// 게시글 번호
	private String title;	// 게시글 제목
	private String content;	// 게시글 내용
	private String writer;	// 작성자
	private Date regDate;	// 작성일

	// 2. 생성자
	public Board() {}
	// 생성자
	public Board(Integer id, String title, String content, String writer, Date regDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}

	// 3. getter, setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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

	// 4. equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Board)) {
			return false;
		}
		Board b = (Board)obj;
		if (this.id.equals(b.id)) {
			return true;
		}
		return false;
	}

	// 5. hashCode
	@Override
	public int hashCode() {
		return this.id.hashCode() + this.content.hashCode() + this.title.hashCode() +
				this.writer.hashCode() + this.regDate.hashCode();
	}

	// 6. toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [글번호 = ");
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
}
