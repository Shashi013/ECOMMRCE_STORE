package test;

import java.util.Scanner;

public class MasalaStore {

	public static int itu = 0, igi = 0, ichi = 0, iga = 0;
	public static float qtu = 0, qgi = 0, qchi = 0, qga = 0;
	public static float ttu = 0, tgi = 0, tchi = 0, tga = 0;

	public void masala() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHere is the available Spices...\n");
		System.out.println("_ID_   __ITEMS__    _QTY_   _PRICE_");
		System.out.println(" 401   Turmeric      1KG     100\u20B9");
		System.out.println(" 402   Ginger        1KG     90\u20B9");
		System.out.println(" 403   chilli        1KG     80\u20B9");
		System.out.println(" 404   Garlic        1KG     100\u20B9");
		System.out.println(" 405    <go to main menu>          ");
		System.out.println("______________________________________________");
		abc: while (true) {
			System.out.print("\nEnter the 'ID' of selected item: ");
			switch (sc.nextLine()) {
			case "401": {
				itu++;
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
								float fl=qa*90;if(fl==0){itu--;}
								qtu=qtu+qa;
								ttu = ttu+(100 * qa);
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

			case "402": {
				igi++;
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
								float fl=qa*90;if(fl==0){igi--;}
								qgi=qgi+qa;
								tgi = tgi+(90 * qa);
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
			case "403":{
				ichi++;
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
								float fl=qa*90;if(fl==0){ichi--;}
								qchi=qchi+qa;
								tchi =tchi+( 80 *qa);
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
			case "404": {
				iga++;
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
								float fl=qa*90;if(fl==0){iga--;}
								qga=qga+qa;
								tga = tga+(100 *qa);
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
			case "405":{break abc;}
			default:
				System.out.print("\nINVALID INPUT !!! \n");
			}
		}
}
}
