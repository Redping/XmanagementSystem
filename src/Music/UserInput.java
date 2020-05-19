package Music;

import java.util.Scanner;

import Exceptions.Urlexception;

public interface UserInput {
	public int getId();
	public void setId(int id);
	public void setURL(String uRL) throws Urlexception;
	public void setTitle(String title);
	public void getURLInput(Scanner input);
	public void printInfo(); 
	public void setURL(Scanner input);
	public void setUrlID(Scanner input);
	public void setUrlTitle(Scanner input);
}
