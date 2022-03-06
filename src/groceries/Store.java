package groceries;

import java.util.ArrayList;

public class Store {
    public static ArrayList<Store> listOfStores = new ArrayList<>();

    public String mainName;
    public ArrayList<Products> listOfProducts = new ArrayList<>();
    double bankAccountOfStore;

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

    public void addItemToStoreList(Products products, Integer quantity) {
        if (quantity == null) {
            for (Products productsOfStore : this.listOfProducts) {
                if (productsOfStore.name == products.name) {
                    productsOfStore.quantity += products.quantity;
                } else {
                    this.listOfProducts.add(products);
                }

            }
        } else {
            for (Products productsOfStore : this.listOfProducts) {
                if (productsOfStore.name == products.name) {
                    productsOfStore.quantity += quantity;
                }
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

    public void addStore(Store store) {
        listOfStores.add(store);
    }

    public double depositIntoStoreBankAccount(Customer customer) {
        this.bankAccountOfStore += customer.customersBill();
        customer.listOfProductsWhichHaveBeenPaidOfCustomer = customer.listOfProductsToBePaidOfCustomer;
        customer.listOfProductsToBePaidOfCustomer.clear();
        return bankAccountOfStore;
    }

    public double returnItem(Customer customer, Products products, int quantity) {
        bankAccountOfStore -= products.price * quantity * 1.15;

        boolean scamming = customer.modifyingCustomerListOfProducts(products, quantity);
        if (scamming) {
            addItemToStoreList(products, quantity);
        }
        return bankAccountOfStore;
    }
}
