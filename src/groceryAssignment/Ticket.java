package groceryAssignment;

public class Ticket implements Payable {
    String reference;
    long price;

    public Ticket (String reference, long price) {
        this.reference = reference;
        this.price = price;
    }

    @Override
    public String label() {
        return reference;
    }

    @Override
    public long cost() {
        return price;
    }

    @Override
    public long taxRatePerTenThousand() {
        return price * 25000;
    }
}
