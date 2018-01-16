package com.koitt.java.board;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardController {

	private BoardService service;
	private Scanner input;

	public BoardController() {
		// 서비스 사용위한 객체생성
		this.service = new BoardService();
		// 게시글 입력위한 객체생성
		this.input =  new Scanner(System.in);
	}

	public static void main(String[] args) {
		BoardController controller = new BoardController();
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("---- 게시글 관리 프로그램 ----");
			System.out.println("1. 게시글 입력");
			System.out.println("2. 게시글 전체 보기");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴번호 입력 >> ");

			// 입력받은 메뉴번호
			int menu = -1;
			try {
				menu = Integer.parseInt(input.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("E: 메뉴선택시 숫자로만 입력해주세요.");
				continue;
			}
			
			switch(menu) {
			case 1:
				controller.menuAdd();
				break;
			case 2:
				controller.menuRead();
				break;
			case 3:
				controller.menuRemove();
				break;
			case 4:
				controller.menuModity();
				break;
			case 5:
				System.out.println("프로그램을 종료하겠습니다.");
				input.close();
				System.exit(0);
				break;
			default:
				System.out.println("메뉴 번호를 잘못 입력했습니다.");
			}
		}
	}
	// 게시글 입력 메소드
	public void menuAdd() {
		System.out.println("---- 게시글 정보를 입력해주세요.----");
		System.out.print("글 제목: ");
		String title = this.input.nextLine();
		System.out.print("글 내용: ");
		String contents = this.input.nextLine();
		System.out.print("작성자: ");
		String name = this.input.nextLine();
		
		//Date day = new Date();

		// 입력받은 정보를 객체화
		// id가 null값인 이유는 Service에서 id값을 생성하기 때문에 (Integer id -> Integer는 클래스이고 기본값은 null 이다.
		// regDate가 null값인 이유는 Controller는 화면관련 클래스이기 때문에 regDate의 초기화는 Service 클래스에 맡긴다. 
		Board b = new Board(null, title, contents, name, null);

		// Service로 입력받은 객체 전달(추가)
		try {
			this.service.add(b);
			System.out.println("입력완료");
		}
		catch (BoardException e) {
			System.out.println(e.getMessage());
		}
	}
	// 게시글 불러오기 메소드
	public void menuRead() {
		System.out.println("---- 게시글 전체 목록 ----");
		// Service를 통해 전체 게시글 불러오기
		List<Board> list = this.service.read();
		// for - each 문 통해 하나씩 출력
		for (Board item : list) {
			System.out.println(item);
		}
	}
	// 게시글 삭제 메소드
	public void menuRemove() {
		System.out.println("---- 삭제할 게시글 글번호를 입력해주세요. ----");
		System.out.print("글번호: ");
		// 삭제할 글번호 입력받음 
		Integer id = Integer.parseInt(this.input.nextLine());
		Board b = new Board(id, null, null, null, null);
		try {
			this.service.remove(b);
			System.out.println(b.getId() + "번 게시글이 삭제되었습니다.");
		}
		catch (BoardException e) {
			System.out.println(e.getMessage());
		}
	}
	// 게시글 수정 메소드
	public void menuModity() {
		System.out.print("수정할 게시글 글번호를 입력해주세요: ");
		// 글번호
		Integer id = Integer.parseInt(this.input.nextLine());
		// 게시글 내용 수정 
		System.out.print("글 제목: ");
		String title = this.input.nextLine();
		System.out.print("글 내용: ");
		String contents = this.input.nextLine();
		
		Board b = new Board(id, title, contents, null, null);

		// Service로 입력받은 객체 전달(추가)
		try {
			this.service.modify(b);
			System.out.println("게시글이 수정되었습니다.");
		}
		catch (BoardException e) {
			System.out.println(e.getMessage());
		}
	}
}
