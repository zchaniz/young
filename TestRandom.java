package net.hb.day0615;
//작성자: 장윤영
//날짜: 2023-06-15
import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		Random r = new Random();
		r.nextInt();
		int value = r.nextInt(7)+1; //0~6
		
		System.out.println(value);
		System.out.println(r.nextInt(7)+1); //0~6
		
		System.out.println("\nTest2Rando.java 12:17"  );
		double d = Math.random()*7;
		int com= (int)d;
		System.out.println(com);
		
		
	}//main end

}//class end
