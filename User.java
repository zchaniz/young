package net.hb.day0615;

public class User{

		int pwd;
		String email;
		int count=0;
		
		public User() {}
		public User(int pwd, String email) {
			this.pwd= pwd;
			this.email = email;
		}//매개변수 생성자 end usertest와 연결하고 
		
		
		public void check() {
		
			String length;
			length = Integer.toString(pwd);
			
			
			if(length.length()>3 && length.length()<9) {
				System.out.println("비밀번호 입력성공");
			}else {System.out.println("4~8자리 사이로 설정하세요");}
		
		
			
			if(!(email.contains("@"))) {
				System.out.println("@를 포함하여 다시 입력하세요");
			}else {System.out.println("이메일 입력성공");}

		}
		
		

	
}//class End 
