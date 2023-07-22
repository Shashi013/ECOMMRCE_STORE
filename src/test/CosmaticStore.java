package test;

import java.util.Scanner;

public class CosmaticStore {
	
		public static int ika = 0, ili = 0, ina = 0, ifa = 0;
		public static float qka = 0, qli = 0, qna = 0, qfa = 0;
		public static float tka = 0, tli = 0, tna = 0, tfa = 0;

		public void cosmatic() {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nHere is the available Comatics...\n");
			System.out.println("_ID_   __ITEMS__    _QTY_   _PRICE_");
			System.out.println(" 301   Kajal         1pc     100\u20B9");
			System.out.println(" 302   Lipstick      1pc     90\u20B9");
			System.out.println(" 303   Nail paint    1pc     80\u20B9");
			System.out.println(" 304   Face powder   1pc     100\u20B9");
			System.out.println(" 305    <go to main menu>          ");
			System.out.println("______________________________________________");
			abc: while (true) {
				System.out.print("\nEnter the 'ID' of selected item: ");
				switch (sc.nextLine()) {
				case "301": {
					ika++;
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
							else if (ch >= 48 && ch <= 57 ) 
							{
							 if(ch >= 48 && ch <= 57)
								c++;
								if (i == qf.length()-1)
								{
									if(c==0||c>7) {System.out.println("INVALID INPUT !!!");break asdf;}
									float qa = Float.parseFloat(qf);
									float fl=qa*90;if(fl==0){ika--;}
									qka=qka+qa;
									tka = tka+(100 * qa);
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

				case "302": {
					ili++;
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
							else if (ch >= 48 && ch <= 57 ) 
							{
								
							if(ch >= 48 && ch <= 57)
								c++;
								if (i == qf.length()-1)
								{
									if(c==0||c>7) {System.out.println("INVALID INPUT !!!");break asdf;}
									float qa = Float.parseFloat(qf);
									float fl=qa*90;if(fl==0){ili--;}
									qli=qli+qa;
									tli = tli+(90 * qa);
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
				case "303":{
					ina++;
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
							else if (ch >= 48 && ch <= 57) 
							{
								 if(ch >= 48 && ch <= 57)
								c++;
								if (i == qf.length()-1)
								{
									if(c==0||c>7) {System.out.println("INVALID INPUT !!!");break asdf;}
									float qa = Float.parseFloat(qf);
									float fl=qa*90;if(fl==0){ina--;}
									qna=qna+qa;
									tna =tna+( 80 *qa);
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
				case "304": {
					ifa++;
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
							else if (ch >= 48 && ch <= 57) 
							{
								 if(ch >= 48 && ch <= 57)
								c++;
								if (i == qf.length()-1)
								{
									if(c==0||c>7) {System.out.println("INVALID INPUT !!!");break asdf;}
									float qa = Float.parseFloat(qf);
									float fl=qa*90;if(fl==0){ifa--;}
									qfa=qfa+qa;
									tfa = tfa+(100 *qa);
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
				case "305":{break abc;}
				default:
					System.out.print("\nINVALID INPUT !!! \n");
				}
			}
	}

}
