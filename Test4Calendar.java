package net.hb.day0615;

import java.util.Calendar;

public class Test4Calendar {
	public static void main(String[] args) {
		//추상클래스 Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal.toString());
		int year = cal.get(Calendar.YEAR);
		int month =  cal.get(Calendar.MONTH)+1;
		int day =  cal.get(Calendar.DAY_OF_MONTH);
		int dd =  cal.get(Calendar.DAY_OF_WEEK); //5
		
		System.out.println(year+"년 "+month+"월 "+day+"일 " );
				
		String msg ="";
		if(dd==1) {msg="일요일";}
		else if(dd==2) {msg="월요일";}
		else if(dd==3) {msg="화요일";}
		else if(dd==4) {msg="수요일";}
		else if(dd==5) {msg="목요일";}
		else if(dd==6) {msg="금요일";}
		else if(dd==7) {msg="토요일";}
		else { }
		
		System.out.println(year+"년 "+month+"월 "+day+"일 " + msg);
		//Calendar클래스해결   get()함수로 접근  
	}
}//class END






