package net.hb.day0615;

import java.text.DecimalFormat;

public class Restaurant {
	public static void main(String[] args) {
		Menu pizza = new Menu("피자", 7500);
		Menu steak = new Menu("T본", 9000);
		Menu cola = new Menu("콜라", 1000);
		Menu[] menuArray = { pizza, steak, cola };
		Order cal = new Order(1200, menuArray);
	    
		DecimalFormat df = new DecimalFormat("##,###");
		//df.format(tax)
		System.out.println();
		System.out.println("주문합계 " + df.format(cal.totalPrice()) + "원 입니다");
	}//main end
		
}//Restaurant class END

 class Order{
	int tot=0;
	int orderNum;
	Menu[] menus; 
	
	public Order() { }
	public Order(String kind){ }
	public Order(int num, Menu[] marr) {
		this.orderNum = num ;
		this.menus = marr;
	}
	
	public int  totalPrice() {
		//Menu pizza = new Menu("피자",7500);
		//Menu[] menuArray = {pizza, steak, cola};
		//Order cal = new Order(1200, menuArray);
	  for(int i=0; i<menus.length ; i++) {
		  tot =tot + menus[i].price;
	  }
	  return tot;
	}//end
 }//Order class END

 class Menu{
	String name; //접근 지정자 생략하면 public
	int price;//접근 지정자 생략하면 public
	DecimalFormat df = new DecimalFormat("##,###");
	
	public Menu() { }
	public Menu(String ss, int cc) {
	    this.name=ss;
	    this.price=cc;
		System.out.println(this.name+ " " + df.format(this.price)+"원 주문성공");
	}
 }//Menu class END


 class  MyExit{
	
 }// MyExit class END
