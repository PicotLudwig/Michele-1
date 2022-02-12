package groceries;

import java.util.ArrayList;
import java.util.Objects;

public class Customer implements Buy {
    String name;
    ArrayList<Products> listOfProductsOfCustomer = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }


    @Override
    public void buyProducts(Products products, Store store, int quantity) {
        if (store.isAvailable(products) && store.removeItemFromStoreList(products, quantity)) {
//            Products productsClone = products.clone();
//            productsClone.quantity = quantity;
            this.listOfProductsOfCustomer.add(products);
        }
    }
}
