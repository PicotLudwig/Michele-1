package groceryAssignment;

public class Item {
    private final String name;
    private final long price;
    int weight;

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public long taxRatePerTenThousand() {return 1000; }

    public Item(String name, long price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }


}

