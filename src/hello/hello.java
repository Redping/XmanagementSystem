package hello;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hello {
	public static void main(String[]args) {
		Scanner input =new Scanner(System.in);
		Url_manager UM= new Url_manager(input);
		
		selectMenu(input,UM);
	}
	public static void selectMenu(Scanner input, Url_manager UM) {
		int num =-1;
		
			while(num != 5) {
				try {
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
				catch(InputMismatchException e) {
					System.out.println("Please put an integer between 1 and 4!");
					if(input.hasNext()){
						input.next();
					}
					num =-1;
					System.out.println(num);
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