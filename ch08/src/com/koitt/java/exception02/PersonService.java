package com.koitt.java.exception02;

import java.util.List;

// 2. Business Logic -> 실제 기능을 처리하는 부분
public class PersonService {
	
	private PersonDao dao;
	
	public PersonService() {
		this.dao = new PersonDao();
	}
	
	public void add(Person p) {
		dao.insert(p);
	}
	
	public List<Person> read() {
		return dao.selectAll();
	}

}
