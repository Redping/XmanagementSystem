package hello;
import java.util.ArrayList;
import java.util.Scanner;

import Music.MorCal;
import Music.Popsong;
public class Url_manager {
	ArrayList<MorCal> MCs = new ArrayList<MorCal>();
	//MorCal MC;
	Scanner input;
	
	public Url_manager(Scanner input) {
		this.input=input;
	}
	public void addUrl(){
		int kind = 0;
		MorCal MC;
		while(kind!=1&&kind !=2) {
			System.out.println("1 for Rock");
			System.out.println("2 for Pop");
			System.out.println("Select num for Student Kind between 1 and 2:");
			kind = input.nextInt();
			if(kind ==1) {
				MC= new MorCal();
				MC.getURLInput(input);
				MCs.add(MC);
				break;
			}
			else if(kind ==2) {
				MC= new Popsong();
				MC.getURLInput(input);
				MCs.add(MC);
				break;
			} 
			else {
				System.out.println("Select num for Student Kind between 1 and 2:");
			}
		}	
	}
	public void deleteUrl() {
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
		int index = - 1;
		for (int i=0;i<MCs.size();i++)
		{
			if(MCs.get(i).getId() == urlId) 
			{
				index=i;
				break;
			}
		}
		if(index>=0) 
		{
			MCs.remove(index);
			System.out.println("The URL" + urlId+"is deleted !");
		}else {
			System.out.println("The URL has not been registered");
			return;
		}					
	}
	
	public void editUrl() {
		
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
		for(int i =0;i<MCs.size();i++) {
			MorCal MC = MCs.get(i);
			if(MC.getId() == urlId) {
				int num =-1;
				while(num != 4) {
					System.out.println("1. Edit Url");
					System.out.println("2. Edit Title");
					System.out.println("3. Edit Id");
					System.out.println("4.Exit");
					num = input.nextInt();
					if(num==1) {
						System.out.println("URL : ");
						String URL = input.next();
						MC.setURL(URL);
					}else if(num==2) {
						System.out.println("URL Title : ");
						String title = input.next();
						MC.setTitle(title);
					}else if(num ==3) {
						System.out.println("URL ID : ");
						int id = input.nextInt();
						MC.setId(id);
					}else {
						continue;
					}
				}
				break;
			}
		}
		
	}
	public void viewUrls() {

			System.out.println("# of registered Url:"+MCs.size());
		for(int i =0;i<MCs.size();i++) {
			MCs.get(i).printInfo();
		}
	}
}
