package hello;

public class MorCal {
	String title;
	int id;
	String URL;
	
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
}
