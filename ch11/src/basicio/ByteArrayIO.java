package basicio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIO {
	
	public static void main(String[] args) {
		int c;
		byte b [] = {'a', 'b', 'c', 'd'};
		// 영문자는 1byte, 한글은 2byte로 저장됨
		
		// 배열 b를 읽는 ByteArrayInputStream 객체 생성
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		// 배열 b를 소문자를 대문자로 출력하는 ByteArrayOutputStream 객체를 생성
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
		
		System.out.println("문자를 읽어 대문자로 출력");
		// read() 메소드 리턴형은 int 이다.
		while ((c = bInput.read()) != -1) {		// -1 -> 파일의 마지막, 배열의 끝을 의미 
			System.out.print((char)c);
			// 객체 ByteArrayOutputStream에 대문자를 출력
			// 대문자로 변환되어 출력 객체에 저장되어 있음 : bOutput
			bOutput.write(Character.toUpperCase((char)c));
		}
		
		System.out.println();
		// 객체 ByteArrayOutputStream을 출력하면 출력된 자료가 그대로 출력 / 저장되어 있던 대문자로 출력됨 
		System.out.println(bOutput);
		
		// 배열 Arrays 메소드 toString() 사용하여 각각 입력 값과 출력 값을 출력 
		System.out.println(Arrays.toString(b));		// byte 타입으로 저장되었다가 십진수로 변환되어 출력됨 
		System.out.println(Arrays.toString(bOutput.toByteArray()));		// toByteArray()는 Output에서 제공하는 메소드. 대문자 상태가 숫자로 출력됨 
	}

}
