package books;

import groceries.Products;

import java.util.ArrayList;

public class Customers {
    String name;
    ArrayList <PaperBooks> listOfBooksToBorrow = new ArrayList<>();
    ArrayList <PaperBooks> listOfBooksBorrowed = new ArrayList<>();
static ArrayList <Customers> listOfCustomers = new ArrayList<>();

    public Customers (String name) {

        this.name = name;
        listOfCustomers.add(this);
    }

    }

