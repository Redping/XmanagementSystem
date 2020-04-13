package hello;
import java.util.ArrayList;
import java.util.Scanner;

public class Url_manager {
	ArrayList<MorCal> MCs = new ArrayList<MorCal>();
	//MorCal MC;
	Scanner input;
	
	public Url_manager(Scanner input) {
		this.input=input;
	}
	public void addUrl(){
		MorCal MC= new MorCal();
		
		System.out.println("URL ID: ");
		MC.id = this.input.nextInt();
		
		System.out.println("URL : ");
		MC.URL = this.input.next();
		
		System.out.println("Title: ");
		MC.title = this.input.next();
		
		MCs.add(MC);

		System.out.println("Add Id is "+MC.id);
		System.out.println("Add url is "+MC.URL);
		System.out.println("Add Title is "+MC.title);
		
	}
	public void deleteUrl() {
		System.out.println("URL ID: ");
		int urlId = input.nextInt();
		int index = - 1;
		for (int i=0;i<MCs.size();i++)
		{
			if(MCs.get(i).id == urlId) 
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
			if(MC.id == urlId) {
				int num =-1;
				while(num != 4) {
					System.out.println("1. Edit Url");
					System.out.println("2. Edit Title");
					System.out.println("3. Edit Id");
					System.out.println("4.Exit");
					num = input.nextInt();
					if(num==1) {
						System.out.println("URL : ");
						MC.URL = input.next();
					}else if(num==2) {
						System.out.println("URL Title : ");
						MC.title = input.next();
					}else if(num ==3) {
						System.out.println("URL ID : ");
						MC.id = input.nextInt();
					}else {
						continue;
					}
				}
				break;
			}
		}
		
	}
	public void viewUrls() {
		
//		System.out.println("URL ID: ");
//		int urlId = input.nextInt();
		for(int i =0;i<MCs.size();i++) {
			MCs.get(i).printInfo();
		}
	}
}
