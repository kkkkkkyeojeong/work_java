package com.koitt.java.exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	// 전체 목록 가져오기
	public List<Person> selectAll() {
		return this.list;
	}

	// Argument로 전달받은 객체를 list에서 제거 
	public void delete(Person p) throws MyException{
		// list에서 Argument로 전달받은 객체의 name과 동일한 객체가 있는지 확인
		for (Person item : this.list) {
			if (item.equals(p)) {
				list.remove(item);
				return;
			}
		}
		throw new MyException("E02: 삭제할 내용이 없습니다.");
	}
	
	public void update(Person p) throws MyException {
		// list에서 Argument로 전달받은 객체의 name과 동일한 객체가 있는지 확인
		for (Person item : this.list) {
			if (item.equals(p)) {
				item.setAge(p.getAge());
				return;		// 찾았으니 검색 중단 후 끝낸다.
			}
		}
		throw new MyException("E03: 수정할 내용이 없습니다.");
	}
	
	/* TODO 1.private void saveToFile(List<Board> list, String filename)
	 * list: BoardDao에 있는 list 필드
	 * filename: list 객체를 저장할 파일 이름  
	 */
	
	private void saveToFile(List<Person> list, String filename) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos); 
			
			oos.writeObject(list);
			
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * TODO 2. private List<Board> loadFromFile(String filename) 
	 * filename: 게시글 리스트가 저장된 파일명
	 * 
	 * List<Board> : 파일에서 불러온 list 객체를 리턴 
	 */
	private List<Person> loadFromFile(String filename) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		Object list = null;
		
		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			
			// Object 타입으로 읽어와 Object타입의 list에 저장됨 
			list = ois.readObject();
			
			ois.close();
			fis.close();
			
			return (List<Person>) list;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
