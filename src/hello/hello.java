package hello;

import java.util.Scanner;

public class hello {
	public static void main(String[]args) {
		Scanner input =new Scanner(System.in);
		int num =5;
		while(num != 6) {
			System.out.println("1. Add Url");
			System.out.println("2. Delete Url");
			System.out.println("3. Edit Url");
			System.out.println("4. View Url");
			System.out.println("5.Show a menu");
			System.out.println("6.Exit");
			num = input.nextInt();
			if(num==1) {
				addUrl();
			}else if(num==2) {
				deleteUrl();
			}else if(num ==3) {
				editUrl();
			}else if(num ==4) {
				viewUrl();
			}else {
				continue;
			}
		
		}
	}
	public static void addUrl(){
		Scanner input = new Scanner(System.in);
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
		System.out.println("URL : ");
		String url = input.next();
		System.out.println("Add Id is "+urlId);
		System.out.println("Add url is "+url);	
	}
	public static void deleteUrl() {
		Scanner input = new Scanner(System.in);
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
	}
	public static void editUrl() {
		Scanner input = new Scanner(System.in);
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
	}
	public static void viewUrl() {
		Scanner input = new Scanner(System.in);
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
	}
	
}