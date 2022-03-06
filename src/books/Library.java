package books;

import humanity.Children;

import java.util.ArrayList;
import java.util.List;

public class Library extends Building {
   public List<Books> booksList = new ArrayList<>();

   public Library () {

   }
   public void checkOutBook (Customers customers, PaperBooks books, int quantity) {
      if (books.checkAvailability(quantity)) {
         customers.listOfBooksBorrowed.add(books);
         books.numberOfCopiesAvailable -= quantity;
      }
   }

   public double randomNumberBookListGenerator() {
      return Math.random() * booksList.size();
      }

   public double randomNumberCustomerGenerator() {
      return Math.random() * Customers.listOfCustomers.size();
   }

   public String libraryLotteryGenerator () {
      String bookSelected = booksList.get((int) randomNumberBookListGenerator()).title;
      String customerSelected = Customers.listOfCustomers.get((int) randomNumberBookListGenerator()).name;
      return "This is the selected Book: " +bookSelected + " " + "This is the customer: " + customerSelected;
   }
}
