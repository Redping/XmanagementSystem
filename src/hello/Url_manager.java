package hello;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Music.Ballad;
import Music.MusicKind;
import Music.Popsong;
import Music.Rock;
import Music.UserInput;


public class Url_manager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6024400563052126132L;
	
	ArrayList<UserInput> users = new ArrayList<UserInput>();
	//MorCal MC;
	transient Scanner input;
	
	public Url_manager(Scanner input) {
		this.input=input;
	}
	public void addUrl(){
		int kind = 0;
		//MorCal MC;
		UserInput userInput;
		while(kind!=1&&kind !=2) {
			try {
				//System.out.println("1 for MorCal");
				System.out.println("1 for Ballad");
				System.out.println("2 for Pop");
				System.out.println("3 for Rock");
				System.out.println("Select num 1, 2, or 3 :");
				kind = input.nextInt();
				if(kind ==1) {
					userInput= new Ballad(MusicKind.MorCal);
					userInput.getURLInput(input);
					users.add(userInput);
					break;
				}
				else if(kind ==2) {
					userInput= (UserInput) new Popsong(MusicKind.Pop);
					userInput.getURLInput(input);
					users.add(userInput);
					break;
				}
				else if(kind ==3) {
					userInput = new Rock(MusicKind.Rock);
					userInput.getURLInput(input);
					users.add(userInput);
					break;
				}
				else {
					System.out.println("Select num for Student Kind between 1 and 2:");
				}	
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()){
					input.next();
				}
				kind =-1;
				System.out.println(kind);
			}
			
		}	
	}
	public void deleteUrl() {
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
		int index =findIndex(urlId);
		removefromStudents(index,urlId);
							
	}
	public int findIndex(int urlId) {
		int index = - 1;
		for (int i=0;i<users.size();i++)
		{
			if(users.get(i).getId() == urlId) 
			{
				index=i;
				break;
			}
		}
		return index;
	}
	public int removefromStudents(int index,int urlId) {
		if(index>=0) 
		{
			users.remove(index);
			System.out.println("The URL" + urlId+"is deleted !");
			return 1;
			
		}else {
			System.out.println("The URL has not been registered");
			return -1;
		}
	}
	public void editUrl() {
		
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
		for(int i =0;i<users.size();i++) {
			UserInput userInput = users.get(i);
			if(userInput.getId() == urlId) {
				int num =-1;
				while(num != 4) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						userInput.setURL(input);
						break;
					case 2:
						userInput.setUrlTitle(input);
						break;
					case 3:
						userInput.setUrlID(input);
						break;
					default:
						continue;
					}
					
				}
			}
		
		}
	}
	public void viewUrls() {

			System.out.println("# of registered Url:"+users.size());
		for(int i =0;i<users.size();i++) {
			users.get(i).printInfo();
		}
	}

	public void showEditMenu() {
		System.out.println("1. Edit Url");
		System.out.println("2. Edit Title");
		System.out.println("3. Edit Id");
		System.out.println("4.Exit");
		
	}
	public void setScanner(Scanner input) {
		this.input = input;
	}
}
