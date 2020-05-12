package hello;

import java.util.Scanner;

public class hello {
	public static void main(String[]args) {
		Scanner input =new Scanner(System.in);
		Url_manager UM= new Url_manager(input);
		
		int num =-1;
		
		while(num != 5) {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				UM.addUrl();
				break;
			case 2:
				UM.deleteUrl();
				break;
			case 3:
				UM.editUrl();
				break;
			case 4:
				UM.viewUrls();
				break;
			default:
				continue;
			}	
		}
	}

	public static void showMenu() {
		System.out.println("1. Add Url");
		System.out.println("2. Delete Url");
		System.out.println("3. Edit Url");
		System.out.println("4. View Url");
		System.out.println("5.Exit");
	}
}