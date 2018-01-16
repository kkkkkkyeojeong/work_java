package com.koitt.java.exception02;

import java.util.List;

// 2. Business Logic -> 실제 기능을 처리하는 부분
public class PersonService {
	
	private PersonDao dao;
	
	public PersonService() {
		this.dao = new PersonDao();
	}
	
	// insert
	public void add(Person p) throws MyException {
		dao.insert(p);
	}
	// read
	public List<Person> read() {
		return dao.selectAll();
	}
	
	// delete
	public void remove(Person p) throws MyException {
		dao.delete(p);
	}
	// update
	public void modify(Person p) throws MyException {
		dao.update(p);
	}

}
