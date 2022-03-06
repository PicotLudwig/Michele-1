package groceryAssignment;

import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<Item> shoppingCartList = new ArrayList<>();
    long totalPrice;
    int totalWeight;
    private static int baseId = 1;
    final private int id;

    public ShoppingCart() {
        this.id = baseId;
        baseId++;
    }

    public void addItem(Item item) throws IllegalStateException {
        for (Item item1 : shoppingCartList) {
             totalWeight += item1.weight;
        }
        if (item.weight + totalWeight <= 10000) {
            shoppingCartList.add(item);
    } else {
        throw new IllegalStateException("error message");
    }
}

    public boolean removeItem(Item item) {
        for (Item eachItem : this.shoppingCartList) {
            if (eachItem.getName().equals(item.getName())) {
                this.shoppingCartList.remove(eachItem);
                return true;
            }
        }
        return false;
    }

    public int itemCount() {
        return shoppingCartList.size();
    }

    public long totalPrice() {
        for (Item eachItem : shoppingCartList) {
            totalPrice += eachItem.getPrice();
        }
        return totalPrice;
    }

    public int getId() {
        return id;
    }

@Override
    public String toString() {
        String results = "";
            for (int i = 0; i < this.shoppingCartList.size(); i++) {
                results += this.shoppingCartList.get(i).getName() + " " + this.shoppingCartList.get(i).getPrice() + "\n";
            }
            return "panier " + this.getId() + ": [article(s) "+ this.shoppingCartList.size()+ "]\n" + results;
        }

    }


