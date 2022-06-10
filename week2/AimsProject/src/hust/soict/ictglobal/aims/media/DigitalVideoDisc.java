package hust.soict.ictglobal.aims.media;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	public static int max_arstr=10;
	
	public DigitalVideoDisc() {
		
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public DigitalVideoDisc(String title) {
		super(title);		
	}

	public DigitalVideoDisc(String title, String category,float cost, String directory,int length) {
		super(title,category,cost);
		this.director=directory;
		this.length=length;
	}	

	
	public int arr(String[] str) {
		int n;
		for(n=0; n<str.length; n++) {
			if(str[n]==null) {
				break;
			}
		}
		return n;
	}
	
	public boolean search(String title) {
		title = title + " ";
		title = title.toLowerCase();
		String str = new String();
		str = getTitle().toLowerCase();
		char kytu;
		String aString[] = new String[max_arstr]; 
		int a=0, b=0, d=0;
		for(int i=0; i<title.length(); i++) {
	    	kytu = title.charAt(i);
	    	if(kytu == ' ') {
	    		aString[a] = title.substring(b, i);
	    		b=i+1;
	    		a++;
	    	}
	    }
		for(int i=0; i<arr(aString); i++) {
			if(str.contains(aString[i])) {
				d++;
			}
		}
		if(d==arr(aString)) return true;
		else return false;
	}
}
