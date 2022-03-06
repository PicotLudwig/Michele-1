package groceries;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i < 9; i++) {
                System.out.println(n*i);
            }


        Store store1 = new Store("Maxi");
        Store store2 = new Store("Provigo");
        for (Store individualStores : Store.listOfStores) {
            System.out.println(individualStores.mainName);
        }
        ArrayList<Products> listOfAvailableProducts = new ArrayList<>();
        Cheese cheese1 = new Cheese("Swiss", "abc123", 4.99, 20);
        Bread bread1 = new Bread("White bread", "abc123", 2.99, 25);
        Meat meat1 = new Meat("Red meat", "abc123", 9.99, 15);
        listOfAvailableProducts.add(cheese1);
        listOfAvailableProducts.add(bread1);
        listOfAvailableProducts.add(meat1);

        for (Store individualStores : Store.listOfStores) {
            individualStores.listOfProducts.addAll(listOfAvailableProducts);
        }

        for (Products individualProducts : store1.listOfProducts) {
            System.out.println(individualProducts.name + " " + individualProducts.reference + " " + individualProducts.price  + " " + individualProducts.quantity);
        }

        Customer customer1 = new Customer("Ludwig");
        customer1.buyProducts(cheese1, store1, 2);
        System.out.println("changes below");
        for (Products individualProducts : store1.listOfProducts) {
            System.out.println(individualProducts.name + " " + individualProducts.reference + " " + individualProducts.price  + " " + individualProducts.quantity);
        }

        store1.returnItem(customer1, cheese1, 1);

        System.out.println("changes below");
        for (Products individualProducts : store1.listOfProducts) {
            System.out.println(individualProducts.name + " " + individualProducts.reference + " " + individualProducts.price  + " " + individualProducts.quantity);
        }
    }



}
