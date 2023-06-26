package net.hb.day0615;

public class Empjumin{
	
	public static void main(String[] args) {
		String jumin="970624-1981647";
		
		String star="";
		for(int i=0; i<6; i++) {
			star= star +"*";
		}
		int pos = jumin.indexOf("-");
//		System.out.println("-의 위치는? "+pos+"번째");
//		String data = jumin.substring(pos+1); //7번째부터 마지막까지 가져옴
		String data = jumin.substring(jumin.indexOf("-")+1); //7번째부터 마지막까지 가져옴
//		System.out.println(data);
		
		System.out.println(star +(jumin.substring(6)));
		System.out.println(star + "-" + data);
		
		
		
		

	}//main end

	
}//class End 
