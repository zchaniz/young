package net.hb.day0615;

import java.util.Calendar;

public class EmpjuminCalendar{
	
	public static void main(String[] args) {
		String jumin="910624-1981647";
		System.out.println(jumin);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);//2023-1997
		char gender = jumin.charAt(7);
		String data = jumin.substring(0,2);
		
		System.out.println("현재 "+year+"년");
		
		//문제1 나이계산과 성별구분 if,switch
		
		
		if(Integer.parseInt(data)>=00 && Integer.parseInt(data)<24) {
			int birth2 = 2000 + Integer.parseInt(data);
			int age2 = year - birth2 ;
			System.out.println("나이 "+ age2 +"세" );
		}else {
			int birth1 = 1900 + Integer.parseInt(data);
			int age1 = year - birth1 ;
			System.out.println("나이 "+ age1 +"세" );
		}
		
		

		
		
		
		
	
		
		
		
		
		
		

	}//main end

	
}//class End 
