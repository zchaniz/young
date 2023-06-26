package net.hb.day0615;

public class Emp{
	
	public static void main(String[] args) {
		String jumin="970624-1981647";
		String message ="안내문";		
		//문제1 7번째 숫자 1/3남자 2/4여자 charAt()
		char gender = jumin.charAt(7);
		System.out.println(gender);
		
		if (gender=='1' || gender=='3') {
			message = "당신은 남성입니다.";
		}else if(gender=='2' || gender=='4'){
			message = "당신은 여성입니다.";
		}else {message = "주민번호가 정확하지 않습니다.";}
		
		System.out.println(message);
		
		//문제2 생일 당신의 생일은 06월 24일 입니다 substring()
		//String jumin="970624-1981647";
		String month = jumin.substring(2,4);
		String day = jumin.substring(4,6);
		System.out.println("당신의 생일은 "+ month +"월 "+day+ "일 입니다");
		
		//문제3 *******-213689* (문의전화 1599-8888)
		String star = "";
		for(int i=0;i<6;i++) {
			star=star+"*"; 
		}
		System.out.println(star +(jumin.substring(6)));
		
		

	}//main end

	
}//class End 
