package hello;

import java.util.Scanner;

public class Url_manager {
	MorCal MC;
	Scanner input;
	
	public Url_manager(Scanner input) {
		this.input=input;
	}
	public void addUrl(){
		MC= new MorCal();
		
		System.out.println("URL ID: ");
		MC.id = this.input.nextInt();
		
		System.out.println("URL : ");
		MC.URL = input.next();
		
		System.out.println("Title: ");
		MC.title = input.next();
		
		//추후에 description 을 넣어줘도 될거 같음.
		System.out.println("Add Id is "+MC.id);
		System.out.println("Add url is "+MC.URL);
		System.out.println("Add Title is "+MC.title);
	}
	public void deleteUrl() {
		
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
		if(MC == null) {
			System.out.println("The url has not  been registered");
			return ;
		}
		if(MC.id == urlId) {
			MC = null;
			System.out.println("The url is deleted");
		}
	}
	public void editUrl() {
		
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
		if(MC.id == urlId) {
			System.out.println("The url to be editied is"+urlId);
		}
	}
	public void viewUrl() {
		
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
		if(MC.id == urlId) {
			MC.printInfo();
		}
	}
}
