package hust.soict.ictglobal.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book  extends Media{

	private List<String> authors = new ArrayList<String>();	
	public Book() {
		
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	Book(String title, String category,float cost){
		super(title, category,cost);		
	}
	Book(String title, String category,float cost, List<String> authors){
		super(title, category,cost);
		this.authors = authors;
	}	
	
}
