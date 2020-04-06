package hello;

import java.util.Scanner;

public class hello {
	public static void main(String[]args) {
		Scanner input =new Scanner(System.in);
		Url_manager UM= new Url_manager(input);
		int num =-1;
		while(num != 5) {
			System.out.println("1. Add Url");
			System.out.println("2. Delete Url");
			System.out.println("3. Edit Url");
			System.out.println("4. View Url");
			System.out.println("5.Exit");
			num = input.nextInt();
			if(num==1) {
				UM.addUrl();
			}else if(num==2) {
				UM.deleteUrl();
			}else if(num ==3) {
				UM.editUrl();
			}else if(num ==4) {
				UM.viewUrl();
			}else {
				continue;
			}
		
		}
	}
	
}