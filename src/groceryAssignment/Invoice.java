package groceryAssignment;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Item> invoiceList = new ArrayList<>();

    public Invoice() {

    }

    public void add(Item item) {
        invoiceList.add(item);
    }

    public long totalAmount() {
        long cost = 0;
        for (Item eachItem : invoiceList) {
            cost += eachItem.getPrice();
        }
        return cost;
    }

    public long totalTax() {
        return this.totalAmount();
    }


}
