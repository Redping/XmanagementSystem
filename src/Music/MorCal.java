package Music;

import java.util.Scanner;

public class MorCal {
	protected MusicKind kind= MusicKind.Pop;
	protected String title;
	protected int id;
	protected String URL;
	
	
	public MusicKind getKind() {
		return kind;
	}

	public void setKind(MusicKind kind) {
		this.kind = kind;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	
	public MorCal() {
		
	}
	
	public MorCal(String title,int id,String URL) {
		this.title=title;
		this.id=id;
		this.URL=URL;
	}
	
	public void printInfo() {
		System.out.println("name:"+title+"id:"+id+"URL:"+URL);
	}
	
	public void getURLInput(Scanner input) {
		System.out.println("URL ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.println("URL : ");
		String URL = input.next();
		this.setURL(URL);
		
		System.out.println("Title: ");
		String title = input.next();
		this.setTitle(title);
				
	}
}
