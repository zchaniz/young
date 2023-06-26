package net.hb.day0615;
import java.util.Scanner;

public class UserTest{
	public static void main(String[] args) {
	
		int pwd; // 무조건 생성필요
		String email;
		
		Scanner sc = new Scanner (System.in) ;
		System.out.print("비번입력 >>>");
		pwd = Integer.parseInt(sc.nextLine());	
		
		System.out.print("메일입력 >>>");
		email = sc.nextLine();
		
		
		User ob = new User(pwd,email); //마지막에 작성 위에있는것과 User와연결
		
		ob.check();



		
	    
	}//main end
}//class End 
