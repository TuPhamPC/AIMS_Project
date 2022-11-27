import java.util.ArrayList;
import java.util.List;

public class Aims {
    private static List<DigitalVideoDisc> store;
    public static void main(String[] args) {
        Cart cart = new Cart();
        store = new ArrayList<>();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        store.add(new DigitalVideoDisc("Star Wars", "Science Fiction", "87", 87, 24.95f));
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "87", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        store.add(new DigitalVideoDisc("Aladin", "Animation",18.99f));
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",18.99f);
        cart.addDigitalVideoDisc(dvd3);
        System.out.println("Total cost: "+cart.totalCost());
        cart.removeDigitalVideoDisc(store.get(1));

    }
}