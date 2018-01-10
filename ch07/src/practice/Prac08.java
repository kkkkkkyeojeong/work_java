package practice;

import java.util.HashMap;
import java.util.Iterator;

public class Prac08 {
	
	public static void main(String[] args) {
	
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// key와 value 값 입력
		hm.put("cobol", 1);
		hm.put("cpp", 2);
		hm.put("c", 1);
		hm.put("java", 3);
		// key 출력
		System.out.println(hm.keySet() + " ");
		System.out.println(hm.keySet().size() + " distinct words detected:");
		
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			Integer value = hm.get(key);
			System.out.print(key + " = " + value + " ");
		}
	
	}
}
