package Music;

import java.util.Scanner;

public class Ballad extends MorCal{
	public Ballad (MusicKind kind) {
		super(kind);
	}
	
	public void getURLInput(Scanner input) {
		setUrlID(input);
		setURL(input);
		setUrlTitle(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:"+skind+" title:"+title+" id:"+id+" URL:"+URL);
	}
	
}
