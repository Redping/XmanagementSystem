package Music;

import java.util.Scanner;

public abstract class MorCal implements UserInput {
	protected MusicKind kind= MusicKind.MorCal;
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
	public MorCal(MusicKind kind) {
		this.kind=kind;
	}
	public MorCal(int id,String URL) {
		this.id=id;
		this.URL=URL;
	}
	
	public MorCal(String title,int id,String URL) {
		this.title=title;
		this.id=id;
		this.URL=URL;
	}
	
	public MorCal(MusicKind kind,String title,int id,String URL) {
		this.kind=kind;
		this.title=title;
		this.id=id;
		this.URL=URL;
	}
	public abstract void printInfo();
	
	public void setURL(Scanner input) {
		System.out.println("URL : ");
		String URL = input.next();
		this.setURL(URL);
	}
	public void setUrlID(Scanner input) {
		System.out.println("URL ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setUrlTitle(Scanner input) {
		System.out.println("URL Title : ");
		String title = input.next();
		this.setTitle(title);
	}
	public String getKindString() {
		String skind ="none";
		switch(this.kind) {
		case Rock:
			skind="Rock";
			break;
		case Pop:
			skind="Pop";
			break;
		case Ballad:
			skind="Ballad";
			break;
		case Jazz:
			skind="Jazz";
			break;
		default:
		}
		return skind;
	}
}
