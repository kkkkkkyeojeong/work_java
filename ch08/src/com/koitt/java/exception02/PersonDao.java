package com.koitt.java.exception02;

import java.util.ArrayList;
import java.util.List;

/* 
			 * 3. DAO(Data Access Object) 
			 * -> 실제 데이터에 접근하는 객체를 위한 클래스
			 * insert, update, read, delete(메소드라 생각)
			 * 
			 * insert(Person p): 사람 객체를 저장
			 * readAll(): 저장된 사람 전체 리스트 가져오기    
			 */
public class PersonDao {
	
	List<Person> list;		// DB 대신에 사용자를 저장할 자료구조

	public PersonDao() {
		this.list = new ArrayList<Person>();
	}
	
	public void insert(Person p) throws MyException{
		// list에서 중복된 인적정보 찾기
		for (Person item : this.list) {
			// 사람이름 비교해서 같다면 중복된 사람으로 처리
			if (item.equals(p)) {
				throw new MyException("E01: Person 객체 중복");
			}
		}
		
		this.list.add(p);
	}
	
	public List<Person> selectAll() {
		return this.list;
	}

}
