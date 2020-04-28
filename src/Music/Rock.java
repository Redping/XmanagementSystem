package Music;

import java.util.Scanner;

public class Rock extends MorCal{
	protected String singer;
	
	public Rock (MusicKind kind) {
		super(kind);
		//this.kind=kind;
	}
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer=singer;
	}
	public void getURLInput(Scanner input) {
		System.out.println("URL ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.println("URL : ");
		String URL = input.next();
		this.setURL(URL);
		
		System.out.println("title : ");
		String title = input.next();
		this.setTitle(title);
		
		char answer ='x';
		while(answer !='y'&& answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.println("Do you have a singer ?(Y/N)");
			answer = input.next().charAt(0);
			
			if(answer=='y'||answer=='Y') {
				System.out.println("Singer :");
				String singer =input.next();
				this.setSinger(singer);
				break;
			}
			else if(answer == 'n'||answer =='N') {
				this.setSinger("");
				break;
			}
			else {
			}
		}	
	}
	public void printInfo() {
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
		System.out.println("kind:"+skind+" title:"+title+" id:"+id+" URL:"+URL+" Singer"+singer);
	}
}