package groceries;

public class Meat extends Products {

    public Meat (String name, String reference, double price, int quantity) {
        super(name, reference, price, quantity);
    }

    @Override
    public double rebateProducts() {
        return 0;
    }
}
