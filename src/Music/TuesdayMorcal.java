package Music;

import java.util.Scanner;

public abstract class TuesdayMorcal extends MorCal {
	public TuesdayMorcal(MusicKind kind) {
		super(kind);
	}
	@Override
	public abstract void getURLInput(Scanner input) ;

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:"+skind+" title:"+title+" id:"+id+" URL:"+URL);
	}
	
	public void seturlTitleYN(Scanner input) {
		char answer ='x';
		while(answer !='y'&& answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.println("Do you have a Title ?(Y/N)");
			answer = input.next().charAt(0);
			
			if(answer=='y'||answer=='Y') {
				setUrlTitle(input);
				break;
			}
			else if(answer == 'n'||answer =='N') {
				this.setTitle("");
				break;
			}
			else {
			}
		}
	}
}
