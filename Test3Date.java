package net.hb.day0615;
//작성자: 장윤영
//날짜: 2023-06-15
import java.util.Date;
public class Test3Date {

	public static void main(String[] args) {
		//Date대신 java.util.Calendar클래스는 추상클래스라서 new연산자로 객체생성
		Date wdate= new Date();
		System.out.println(wdate);
		System.out.println(wdate.toString());
		System.out.println(wdate.toLocaleString()); //권장 
		
		
		

	}//main end

}//class end
