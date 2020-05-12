package Music;

import java.util.Scanner;

public class Popsong extends TuesdayMorcal{
	public Popsong (MusicKind kind) {
		super(kind);
		//this.kind=kind;
	}
	
	public void getURLInput(Scanner input) {
		
		setUrlID(input);
		setURL(input);
		seturlTitleYN(input);			
	}
	
	
	
}
