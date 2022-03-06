package groceries;

import java.util.ArrayList;

public class Customer implements Buy {
    String name;
    ArrayList<Products> listOfProductsToBePaidOfCustomer = new ArrayList<>();
    ArrayList<Products> listOfProductsWhichHaveBeenPaidOfCustomer = new ArrayList<>();
    double bill = 0;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void buyProducts(Products products, Store store, int quantity) {
        if (store.isAvailable(products) && store.removeItemFromStoreList(products, quantity)) {
            Products productsClone = products.clone();
            productsClone.quantity = quantity;
            this.listOfProductsToBePaidOfCustomer.add(productsClone);
        }
    }

    public double customersBill() {
        for (Products productsOfCustomer : listOfProductsToBePaidOfCustomer) {
            bill = productsOfCustomer.price;
        }
        return bill * 1.15;
    }

    public boolean modifyingCustomerListOfProducts(Products product, int quantity) {
        for (Products items : listOfProductsWhichHaveBeenPaidOfCustomer) {
            if (items.name == product.name) {
                if (items.quantity == quantity) {
                    listOfProductsWhichHaveBeenPaidOfCustomer.remove(items);
                    return true;
                }
                if (items.quantity > quantity) {
                    items.quantity -= quantity;
                    return true;
                }
            }
        }
        System.out.println("You are scamming us!!!!!");
        return false;
    }
}
