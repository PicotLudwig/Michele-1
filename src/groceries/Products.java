package groceries;

public abstract class Products implements Rebate, Cloneable {
    String name;
    String reference;
    double price;
    int quantity;

    public Products (String name, String reference, double price, int quantity) {
        this.name = name;
        this.reference = reference;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice () {
        return this.price;
    }

    @Override
    public Products clone() {
        try {
            Products clone = (Products) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
