package maccess;
import test.*;
import java.util.Scanner;
public class Store {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Cart ca= new Cart();
		CosmaticStore cs = new CosmaticStore();
		FruitsStore fs = new FruitsStore();
		List li= new List();
		MasalaStore ms=new MasalaStore();
		VegitableStore vs=new VegitableStore();
		Exit e=new Exit();
		System.out.println("\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950");
		System.out.println("           WELCOME TO SUPER MARKET");
		System.out.println("\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950");
	    System.out.println("If u want to see our list\n    presh '1' else presh 'any key'...");
	 whi: while(true) {  System.out.println("______________________________________________");
	    System.out.print("Enter your choice: ");
	    int x=li.showlist( sc.nextLine());
	    if(x==1) {
	    System.out.println("______________________________________________");
	  xyz: while(true) {  System.out.print("Please choose your option: ");
	    	switch(sc.nextLine()){
	    	case "1" : fs.fruits();break xyz;
	    	case "2" : vs.veg();break xyz;
	    	case "3" : cs.cosmatic();break xyz;
	    	case "4" : ms.masala();break xyz;
	    	case "5" : {e.exit();break whi;}
	    	default : System.out.println("INVALID INPUT !!!");
	    	}
	    	}//end of switch
	    }//end of if
	    else {break whi;}
	  System.out.println("Do you want to purchase more item?\n if yes then press '1' else press 'ANY KEY'");
	                }
	}
}
