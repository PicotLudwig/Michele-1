package groceries;

public class Cheese extends Products {


    public Cheese (String name, String reference, double price, int quantity) {
        super(name, reference, price, quantity);
    }

    @Override
    public double rebateProducts() {
        return 0;
    }
}
