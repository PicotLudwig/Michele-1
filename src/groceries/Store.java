package groceries;

import java.util.ArrayList;

public class Store {
    public static ArrayList<Store> listOfStores = new ArrayList<>();

    public String mainName;
    public ArrayList<Products> listOfProducts = new ArrayList<>();


    public Store(String mainName) {
        this.mainName = mainName;
        addStore(this);
    }

    public boolean isAvailable(Products products) {
        for (Products productOfTheStore : this.listOfProducts) {
            if (productOfTheStore.name == products.name) {
                if (productOfTheStore.quantity >= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addItemToStoreList(Products products) {
        for (Products productsOfStore : this.listOfProducts) {
            if (productsOfStore.name == products.name) {
                productsOfStore.quantity += products.quantity;
            } else {
                this.listOfProducts.add(products);
            }

        }
    }

    public boolean removeItemFromStoreList(Products products, int quantity) {
        for (Products productsOfStore : this.listOfProducts) {
            if (productsOfStore.name == products.name) {
                if (productsOfStore.quantity >= quantity)
                    productsOfStore.quantity -= quantity;
                return true;
            }
        }
        return false;
    }

    public void addStore (Store store) {
            listOfStores.add(store);
    }

}
