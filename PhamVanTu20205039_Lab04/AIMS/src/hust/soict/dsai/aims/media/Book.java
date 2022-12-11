package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    
    public Book(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}


	private List<String> authors=new ArrayList<String>();
	//public Book() {
		
	//}
	
	

	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName) {
		if(this.authors.contains(authorName)) {
			System.out.println("Tac gia da ton tai ");
		}else {
			this.authors.add(authorName);
			System.out.println("Da them tac gia vao danh sach ");
		}	
	}
	

	public void removeAuthor(String authorName) {
		if(this.authors.contains(authorName)) {
			this.authors.remove(authorName);
			System.out.println("Da xoa tac gia "+authorName+" khoi danh sach");
		}else System.out.println("Tac gia khong ton tai");
	}
	 public void setAuthor(String authorName){
	        if(!this.authors.contains(authorName)){
	            this.authors.add(authorName);
	        }
	        else{
	            System.out.println("The author is already exits");
	        }
	    }

}
