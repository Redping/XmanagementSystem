package Music;

import java.util.Scanner;

public class Popsong extends MorCal {
	
	public void getURLInput(Scanner input) {
		System.out.println("URL ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.println("URL : ");
		String URL = input.next();
		this.setURL(URL);
		
		
		char answer ='x';
		while(answer !='y'&& answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.println("Do you have a Title ?(Y/N)");
			answer = input.next().charAt(0);
			
			if(answer=='y'||answer=='Y') {
				System.out.println("Title :");
				String title =input.next();
				this.setTitle(title);
				break;
			}
			else if(answer == 'n'||answer =='N') {
				this.setTitle("");
				break;
			}
			else {
			}
		}	
	}
	
}
