package test;

import java.util.Scanner;

public class FruitsStore {
	public static int ima = 0, iap = 0, igr = 0, igu = 0;
	public static float qma = 0, qap = 0, qgr = 0, qgu = 0;
	public static float tma = 0, tap = 0, tgr = 0, tgu = 0;

	public void fruits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHere is the available fruits...\n");
		System.out.println("_ID_   __ITEMS__    _QTY_   _PRICE_");
		System.out.println(" 101   Mango         1KG     100\u20B9");
		System.out.println(" 102   Apples        1KG     90\u20B9");
		System.out.println(" 103   Grapes        1KG     80\u20B9");
		System.out.println(" 104   Guava         1KG     100\u20B9");
		System.out.println(" 105    <go to main menu>          ");
		System.out.println("______________________________________________");
		abc: while (true) {
			System.out.print("\nEnter the 'ID' of selected item: ");
			switch (sc.nextLine()) {
			case "101": {
				ima++;
				qwe: while (true) {
					System.out.print("Enter the quantity of selected item: ");
					String qf = sc.nextLine().trim();
					int c = 0,c1=0;
					asdf: for (int i = 0; i < qf.length(); i++) {
						char ch = qf.charAt(i);
						if (qf.equals(".")) {
							System.out.println("INVALID INPUT !!!");
							break asdf;
						}
						else if (ch >= 48 && ch <= 57 || ch == '.') 
						{
							if(ch=='.') {c1++;if(c1>1) {System.out.println("INVALID INPUT !!!");break asdf;}}
						else if(ch >= 48 && ch <= 57)
							c++;
							if (i == qf.length()-1)
							{
								if(c==0||c>7) {System.out.println("INVALID INPUT !!!");break asdf;}
								float qa = Float.parseFloat(qf);
								float fl=qa*90;if(fl==0){ima--;}
								qma=qma+qa;
								tma = tma+(100 * qa);
								break qwe;
							}
					    } 
					     	else {
							System.out.println("INVALID INPUT !!!");
							break asdf;
						         }
					}
				}
				break abc;
			}

			case "102": {
				iap++;
				qwe: while (true) {
					System.out.print("Enter the quantity of selected item: ");
					String qf = sc.nextLine().trim();
					int c = 0,c1=0;
					asdf: for (int i = 0; i < qf.length(); i++) {
						char ch = qf.charAt(i);
						if (qf.equals(".")) {
							System.out.println("INVALID INPUT !!!");
							break asdf;
						}
						else if (ch >= 48 && ch <= 57 || ch == '.') 
						{
							if(ch=='.') {c1++;if(c1>1) {System.out.println("INVALID INPUT !!!");break asdf;}}
						else if(ch >= 48 && ch <= 57)
							c++;
							if (i == qf.length()-1)
							{
								if(c==0||c>7) {System.out.println("INVALID INPUT !!!");break asdf;}
								float qa = Float.parseFloat(qf);
								float fl=qa*90;if(fl==0){iap--;}
								qap=qap+qa;
								tap = tap+(90 * qa);
								break qwe;
							}
					    } 
					     	else {
							System.out.println("INVALID INPUT !!!");
							break asdf;
						         }
					}
				}
				break abc;
			}
			case "103":{
				igr++;
				qwe: while (true) {
					System.out.print("Enter the quantity of selected item: ");
					String qf = sc.nextLine().trim();
					int c = 0,c1=0;
					asdf: for (int i = 0; i < qf.length(); i++) {
						char ch = qf.charAt(i);
						if (qf.equals(".")) {
							System.out.println("INVALID INPUT !!!");
							break asdf;
						}
						else if (ch >= 48 && ch <= 57 || ch == '.') 
						{
							if(ch=='.') {c1++;if(c1>1) {System.out.println("INVALID INPUT !!!");break asdf;}}
						else if(ch >= 48 && ch <= 57)
							c++;
							if (i == qf.length()-1)
							{
								if(c==0||c>7) {System.out.println("INVALID INPUT !!!");break asdf;}
								float qa = Float.parseFloat(qf);
								float fl=qa*90;if(fl==0){igr--;}
								qgr=qgr+qa;
								tgr =tgr+( 80 *qa);
								break qwe;
							}
					    } 
					     	else {
							System.out.println("INVALID INPUT !!!");
							break asdf;
						         }
					}
				}
				break abc;
			}
			case "104": {
				igu++;
				qwe: while (true) {
					System.out.print("Enter the quantity of selected item: ");
					String qf = sc.nextLine().trim();
					int c = 0,c1=0;
					asdf: for (int i = 0; i < qf.length(); i++) {
						char ch = qf.charAt(i);
						if (qf.equals(".")) {
							System.out.println("INVALID INPUT !!!");
							break asdf;
						}
						else if (ch >= 48 && ch <= 57 || ch == '.') 
						{
							if(ch=='.') {c1++;if(c1>1) {System.out.println("INVALID INPUT !!!");break asdf;}}
						else if(ch >= 48 && ch <= 57)
							c++;
							if (i == qf.length()-1)
							{
								if(c==0||c>7) {System.out.println("INVALID INPUT !!!");break asdf;}
								float qa = Float.parseFloat(qf);
								float fl=qa*90;if(fl==0){igu--;}
								qgu=qgu+qa;
								tgu = tgu+(100 *qa);
								break qwe;
							}
					    } 
					     	else {
							System.out.println("INVALID INPUT !!!");
							break asdf;
						         }
					}
				}
				break abc;
			}
			case "105":{break abc;}
			default:
				System.out.print("\nINVALID INPUT !!! \n");
			}
		}
/*
		System.out.println("mango");
		System.out.println(qma);
		System.out.println(ima);
		System.out.println(tma);
		System.out.println("apple");
		System.out.println(qap);
		System.out.println(iap);
		System.out.println(tap);
		System.out.println("grapes");
		System.out.println(qgr);
		System.out.println(igr);
		System.out.println(tgr);
		System.out.println("guava");
		System.out.println(qgu);
		System.out.println(igu);
		System.out.println(tgu);*/
	}

}
