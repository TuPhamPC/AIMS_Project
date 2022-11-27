package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String tmp = dvd1.getTiltle(); 
		dvd1.setTiltle(dvd2.getTiltle());
		dvd2.setTiltle(tmp);
	}
	
	public static void main(String[] arg) {
	
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
		
		
		System.out.println("Before: ");
		System.out.println("Titledvd1: " + dvd1.getTiltle());
		System.out.println("Titledvd2: " + dvd2.getTiltle());
		
		
		swap(dvd1, dvd2);
		
		
		System.out.println("After: ");
		System.out.println("Titledvd1: " + dvd1.getTiltle());
		System.out.println("Titledvd2: " + dvd2.getTiltle());

	}
}
