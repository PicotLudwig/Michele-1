package groceryAssignment;

public class FreshItem extends Item {
    String bestBeforeDate;

    public FreshItem(String name, long price, int weight, String bestBeforeDate) {
        super(name, price, weight);
        this.bestBeforeDate = bestBeforeDate;
    }

    public String toString() {

        return "BBD: " + this.bestBeforeDate + " " + this.getName() + ": " + this.getPrice();
    }


    public long taxRatePerTenThousand() {
        if (this.weight > 999 && this.weight < 2001) {
            return 999;
        } else {
            return 1000;
        }
    }

}

