package groceries;

public class Bread extends Products {

    public Bread (String name, String reference, double price, int quantity) {
        super(name, reference, price, quantity);
    }

    @Override
    public double rebateProducts() {
        return 0;
    }
}
