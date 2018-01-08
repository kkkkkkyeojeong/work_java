package practice;

import java.util.Scanner;

public class Student extends Person {
	
	// 필드 선언
	String scoolN;			// 학교명
	String major;			// 학과	
	int sId;				// 학번
	double[] avgScore;	// 8개학기 총 점수 배열
	
	// 생성자 생성 (학교명, 학과, 학번)
	public Student(String scoolN, String major, int sId) {
		super();
		this.scoolN = scoolN;
		this.major = major;
		this.sId = sId;
		this.avgScore = new double[8];
	}
	
	// 8개학기 평균 학점 반환 메소드 
	public double average() {
		double sum = 0;
		for(int i = 0; i < avgScore.length; i++) {
			sum += avgScore[i];
		}
		return sum / avgScore.length;
	}
		//System.out.println("8학기 총 평균 평점은 " + total + "입니다.");
	
	
	public static void main(String[] args) {
		// 객체 생성해서 정보 출력하기
		Student dajeong = new Student("동양서울대학교", "전산정보학과", 20132222);
		dajeong.name = "김다정";
		dajeong.age = 20;
		dajeong.address = "서울시 관악구";
		
		System.out.printf("이름: %s%n나이: %d%n주소: %s%n학교: %s%n학과: %s%n학번: %d%n",
				dajeong.name, dajeong.age, dajeong.address, dajeong.scoolN, dajeong.major, dajeong.sId);
		
		System.out.println();
		
		// 학점 출력하기 
		//System.out.println("8학기 학점을 순서대로 입력하세요.");
		
		//double[] totalScore = {3.37, 3.89, 4.35, 3.76, 3.89, 3.89, 4.26, 4.89};
		Scanner input = new Scanner (System.in);
		System.out.println("8학기 학점을 순서대로 입력하세요.");
		
		/*for (int i = 0; i < s1.totalScore.length; i++) {
			System.out.print((i + 1) + "학기 학점 -> ");
			s1.totalScore[i] = scanner.nextDouble();
		}
		
		for (int i = 0; i < totalScore.length; i++) {
			for (int j = i + 1 ; j < 9; j++) {
				System.out.println(j + "학기 학점: " + totalScore[i]);
				break;
			}
		}*/
		System.out.println();
		
		// 평균 입력받아 출력하기 
		
	
		

			
		}

}
