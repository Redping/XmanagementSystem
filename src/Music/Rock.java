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
		setUrlID(input);
		setURL(input);
		setUrlTitle(input);
		setSingerYN(input);
			
	}
	public void setSingerYN(Scanner input) {
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
		String skind = getKindString();
		System.out.println("kind:"+skind+" title:"+title+" id:"+id+" URL:"+URL+" Singer"+singer);
	}
}