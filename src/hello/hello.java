package hello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Log.EventLogger;

public class hello {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[]args) {
		Scanner input =new Scanner(System.in);
		//Url_manager UM= new Url_manager(input);
		Url_manager UM= getObject("UrlManager.ser");
		if(UM==null) {
			UM=new Url_manager(input);
		}else {
			UM.setScanner(input);
		}
		selectMenu(input,UM);
		putObject(UM,"urlManager.");
		
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
					logger.log("Add a url");	
					break;
				case 2:
					UM.deleteUrl();
					logger.log("Delete a url");
					break;
				case 3:
					UM.editUrl();
					logger.log("Edit a url");
					break;
				case 4:
					UM.viewUrls();
					logger.log("View a url");
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
	
	public static Url_manager getObject(String filename) {
		Url_manager url_manager=null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in= new ObjectInputStream(file);
			
			url_manager=(Url_manager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return url_manager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return url_manager;
	}
	public static void putObject(Url_manager url_manager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out= new ObjectOutputStream(file);
			
			out.writeObject(url_manager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}