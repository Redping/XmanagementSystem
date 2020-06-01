package Music;

import java.io.Serializable;
import java.util.Scanner;

import Exceptions.Urlexception;

public abstract class MorCal implements UserInput,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2427637948384726791L;
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
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getURL() {
		return this.URL;
	}

	public void setURL(String uRL) throws Urlexception {
		if(!uRL.contains(".")&& !uRL.equals("")) {
			throw new Urlexception();
		}
		this.URL = uRL;
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
		String URL ="";
		while(!URL.contains(".")) {
			System.out.println("URL : ");
			URL = input.next();
			try {
				this.setURL(URL);
			} catch (Urlexception e) {
				System.out.println("Incorrect URL Format. put the URL that contains .(dot) ");
			}
		}		
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
