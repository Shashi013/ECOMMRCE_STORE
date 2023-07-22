package test;
import java.text.SimpleDateFormat;

import java.util.Date;
public class Cart {
	static int no=1;
	static float tot=0;
	Date dat=new Date();
	
	public void bill() {
	System.out.println("\n\n\n\n\n__________________________________________________________");
	System.out.println("                  WELCOME TO SUPER MARKET             ");
	System.out.println("      Near satyam theatre, Opp Reliance Fresh,ameerpet");
	System.out.println("                     HYDERABAD(700016)");
	System.out.println("                shashistore013@gmail.com");
	System.out.println("                  GSTIN: 36CBJPV2564A1ZS");
	System.out.println("__________________________________________________________");
	System.out.println("\n                      Tax Invoice");
	System.out.println("  On Sale                              Date:"+new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
	System.out.println("                                         Time:"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
	System.out.println("  Telangana                           Invoice No: 7721");
	System.out.println("                                      SALES MAN: FIROZ");
	System.out.println("__________________________________________________________");
	System.out.println("  sr Name            Qty    Price          Amount");
	System.out.println("------------------------------------------------------");
	//fruits section
	if(FruitsStore.ima>0) {tot=tot+FruitsStore.tma;
	System.out.println("  "+no++ +"  Mango           "+FruitsStore.qma+"    100\u20B9           "+FruitsStore.tma+"\u20B9");
	}
	if(FruitsStore.iap>0) {tot=tot+FruitsStore.tap;
		System.out.println("  "+no++ +"  Apple           "+FruitsStore.qap+"    90\u20B9           "+FruitsStore.tap+"\u20B9");
	}
	if(FruitsStore.igr>0) {tot=tot+FruitsStore.tgr;
		System.out.println("  "+no++ +"  Grapes          "+FruitsStore.qgr+"    80\u20B9           "+FruitsStore.tgr+"\u20B9");
	}
	if(FruitsStore.igu>0) {tot=tot+FruitsStore.tgu;
		System.out.println("  "+no++ +"  Guava           "+FruitsStore.qgu+"    100\u20B9           "+FruitsStore.tgu+"\u20B9");
	}
//vegitable section	
	if(VegitableStore.ipo>0) {tot=tot+VegitableStore.tpo;
	System.out.println("  "+no++ +"  Potato          "+VegitableStore.qpo+"    100\u20B9           "+VegitableStore.tpo+"\u20B9");
	}
	if(VegitableStore.ito>0) {tot=tot+VegitableStore.tto;
		System.out.println("  "+no++ +"  Tomato          "+VegitableStore.qto+"    90\u20B9           "+VegitableStore.tto+"\u20B9");
	}
	if(VegitableStore.ibr>0) {tot=tot+VegitableStore.tbr;
		System.out.println("  "+no++ +"  Brinjal         "+VegitableStore.qbr+"    80\u20B9           "+VegitableStore.tbr+"\u20B9");
	}
	if(VegitableStore.ion>0) {tot=tot+VegitableStore.ton;
		System.out.println("  "+no++ +"  Onion           "+VegitableStore.qon+"    100\u20B9           "+VegitableStore.ton+"\u20B9");
	}
	
	//cosmetic section
	if(CosmaticStore.ika>0) {tot=tot+CosmaticStore.tka;
	System.out.println("  "+no++ +"  Kajal           "+CosmaticStore.qka+"    100\u20B9           "+CosmaticStore.tka+"\u20B9");
	}
	if(CosmaticStore.ili>0) {tot=tot+CosmaticStore.tli;
		System.out.println("  "+no++ +"  Lipistick       "+CosmaticStore.qli+"    90\u20B9           "+CosmaticStore.tli+"\u20B9");
	}
	if(CosmaticStore.ina>0) {tot=tot+CosmaticStore.tna;
		System.out.println("  "+no++ +"  Nail Paint      "+CosmaticStore.qna+"    80\u20B9           "+CosmaticStore.tna+"\u20B9");
	}
	if(CosmaticStore.ifa>0) {tot=tot+CosmaticStore.tfa;
		System.out.println("  "+no++ +"  Face Powder     "+CosmaticStore.qfa+"    100\u20B9           "+CosmaticStore.tfa+"\u20B9");
	}
	//vegitable section
	
	if(MasalaStore.itu>0) {tot=tot+MasalaStore.ttu;
	System.out.println("  "+no++ +"  Turmeric        "+MasalaStore.qtu+"    100\u20B9           "+MasalaStore.ttu+"\u20B9");
	}
	if(MasalaStore.igi>0) {tot=tot+MasalaStore.tgi;
		System.out.println("  "+no++ +"  Ginger          "+MasalaStore.qgi+"    90\u20B9           "+MasalaStore.tgi+"\u20B9");
	}
	if(MasalaStore.ichi>0) {tot=tot+MasalaStore.tchi;
		System.out.println("  "+no++ +"  chilli          "+MasalaStore.qchi+"    80\u20B9           "+MasalaStore.tchi+"\u20B9");
	}
	if(MasalaStore.iga>0) {tot=tot+MasalaStore.tga;
		System.out.println("  "+no++ +"  Garlic          "+MasalaStore.qga+"    100\u20B9           "+MasalaStore.tga+"\u20B9");
	}
	
	System.out.println("__________________________________________________________");
	System.out.println("      Total_Quantity "+--no+"         Total_Price: "+tot+"\u20B9");
	System.out.println("    Wow you got 10% discount Discount(10%): "+tot/10+"\u20B9");
	System.out.println("               Finally you have to pay only: "+(tot-(tot/10))+"\u20B9");
	System.out.println("__________________________________________________________");
	System.out.println("                    Thank You \n                         Visit Again");
	}
}
