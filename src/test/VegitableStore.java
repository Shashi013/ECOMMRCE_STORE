package test;

import java.util.Scanner;
public class VegitableStore {

	public static int ipo = 0, ito = 0, ibr = 0, ion = 0;
	public static float qpo = 0, qto = 0, qbr = 0, qon = 0;
	public static float tpo = 0, tto = 0, tbr = 0, ton = 0;

	public void veg() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHere is the available vegitables...\n");
		System.out.println("_ID_   __ITEMS__    _QTY_   _PRICE_");
		System.out.println(" 201   Potato         1KG     100\u20B9");
		System.out.println(" 202   Tomato         1KG     90\u20B9");
		System.out.println(" 203   Brinjal        1KG     80\u20B9");
		System.out.println(" 204   Onion          1KG     100\u20B9");
		System.out.println(" 205    <go to main menu>          ");
		System.out.println("______________________________________________");
		abc: while (true) {
			System.out.print("\nEnter the 'ID' of selected item: ");
			switch (sc.nextLine()) {
			case "201": {
				ipo++;
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
								float fl=qa*90;if(fl==0){ipo--;}
								qpo=qpo+qa;
								tpo = tpo+(100 * qa);
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

			case "202": {
				ito++;
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
								float fl=qa*90;if(fl==0){ito--;}
								qto=qto+qa;
								tto = tto+(90 * qa);
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
			case "203":{
				ibr++;
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
								float fl=qa*90;if(fl==0){ibr--;}
								qbr=qbr+qa;
								tbr =tbr+( 80 *qa);
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
			case "204": {
				ion++;
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
								float fl=qa*90;if(fl==0){ion--;}
								qon=qon+qa;
								ton = ton+(100 *qa);
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
			case "205":{break abc;}
			default:
				System.out.print("\nINVALID INPUT !!! \n");
			}
		}
		/*System.out.println("potato");
		System.out.println(qpo);
		System.out.println(ipo);
		System.out.println(tpo);
		System.out.println("tomato");
		System.out.println(qto);
		System.out.println(ito);
		System.out.println(tto);
		System.out.println("brinjal");
		System.out.println(qbr);
		System.out.println(ibr);
		System.out.println(tbr);
		System.out.println("onion");
		System.out.println(qon);
		System.out.println(ion);
		System.out.println(ton);*/
}
}