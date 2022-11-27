package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();
	public Store() {
		super();
	}

	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore.add(dvd);
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		
		Iterator<DigitalVideoDisc> itr = itemsInStore.iterator();
		
		
		while(itr.hasNext()) {
			DigitalVideoDisc tmp = itr.next();
			
			if(tmp.getId() == dvd.getId()) {
				itr.remove();
			}
		}
	}
	
	public void availableDVD() {
		Iterator<DigitalVideoDisc> itr = itemsInStore.iterator();
		
		while(itr.hasNext()) {
			DigitalVideoDisc tmp = itr.next();
			
			System.out.println(tmp.printDetail());
		}
	}
}
