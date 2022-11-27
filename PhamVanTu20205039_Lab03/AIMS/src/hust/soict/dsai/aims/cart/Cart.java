package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {


	private int quantity = 0;
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public Cart() {
		super();
	}
	
	
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(quantity < MAX_NUMBERS_ORDERED) {
			itemsOrdered[quantity] = disc;
			quantity ++;
			System.out.println("The disc has been added!");
		}
		else {
			System.out.println("FULL!");
		}
		
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist) {
		for(int i = 0; i < dvdlist.length; ++i) {
			addDigitalVideoDisc(dvdlist[i]);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < quantity; ++i) {
			
			if(itemsOrdered[i] == disc) {
				
				for(int j = i; j < quantity; ++j) {
					itemsOrdered[j] = itemsOrdered[j+1];
					
					if(j == quantity-1) {
						itemsOrdered[j] = null;
					}
				}
				quantity --;
			break;
			}
		}
	}
	
	public double totalCost() {
		double sum = 0.0;
		
		for(int i = 0; i < quantity; ++i) {
			sum += itemsOrdered[i].getCost();
		}
		
		return sum;
	}
	
	
	public void displayCart() {
		System.out.println("*******************************************CART*********************************************************");
		
		if(quantity != 0) {
			for(int i = 0; i < quantity; ++i) {
				System.out.println((i+1)+". DVD "+itemsOrdered[i].printDetail());
			}
		}
		else {
			System.out.println("Cart is empty! Please add DVD to Cart!");
		}
		
		System.out.println("Total cost: " + totalCost());
		System.out.println("********************************************************************************************************");
	}
	
	public void search(String title) {
		int check = 0;
		for(int i = 0; i < quantity; ++i) {
			if(itemsOrdered[i].isMatch(title)) {
				check = 1;
				System.out.println(itemsOrdered[i].printDetail());
			}
		}
		
		if(check == 0) {
			System.out.println("Not found!");
		}
	}
	
	public void search(int id) {
		int check = 0;
		for(int i = 0; i < quantity; ++i) {
			if(itemsOrdered[i].isMatch(id)) {
				check = 1;
				System.out.println(itemsOrdered[i].printDetail());
				break;
			}
		}
		
		if(check == 0) {
			System.out.println("Not found!");
		}
		
	}
}