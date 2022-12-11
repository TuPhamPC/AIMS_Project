package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playables {
	
	
	
	

	public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
		super(title, category, cost, director, length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());  	
		System.out.println("DVD length: " + this.getLength()); 
	}
	
	
	
}
