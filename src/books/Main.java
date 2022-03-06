package books;


import java.io.*;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException, MonException {

       Customers cust1 = new Customers("liu");
        Map<Customers, List<PaperBooks>> clientsAndBooks = new HashMap<>();
clientsAndBooks.put(cust1, List.of());
clientsAndBooks.put(cust1, List.of());



    }
















//        PaperBooks book1 = new PaperBooks("Housekeeping", "Marilyn Robinson", true, 4, 12);
//        PaperBooks book2 = new PaperBooks("Virgin Suicides, The", "Jeffrey Eugenides", true, 2, 1);
//
//        Customers customer1 = new Customers("Ludwig is mean");
//
//        Library pierrefonds = new Library();
//
//        pierrefonds.checkOutBook(customer1, book1, 2);
//        pierrefonds.booksList.add(book1);
//        pierrefonds.booksList.add(book2);
//
//
//        for (Books eachBook : pierrefonds.booksList) {
//            System.out.println(eachBook.title);
//            System.out.println(eachBook.numberOfCopiesAvailable);
//        }
//
//        for (Books eachBook : customer1.listOfBooksBorrowed) {
//            System.out.println(eachBook.title);
//            System.out.println(eachBook.numberOfCopiesAvailable);
//        }


//        for (int i = 0; i < 20; i++) {
//            new Customers("Customer" + i);
//        }
//
//        for (int i = 0; i < 20; i++) {
//            pierrefonds.booksList.add(new PaperBooks("title" + i, "author" + i, true, 4, 4));
//        }
//
//        System.out.println(pierrefonds.libraryLotteryGenerator());
//
//        FileWriter leFichier = new FileWriter("/fichierJava/test.txt", true);
//        BufferedWriter bufferedWriter = new BufferedWriter(leFichier);
//        bufferedWriter.write(OffsetDateTime.now() + ": " + pierrefonds.libraryLotteryGenerator());
//        bufferedWriter.newLine();
//        bufferedWriter.close();
//
//        FileReader fileReader = new FileReader("/fichierJava/test.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        String line = bufferedReader.readLine();
//
//        while (line != null) {
//            System.out.println(line);
//            line = bufferedReader.readLine();
//        }
//
//        int leNombre = 0;
//        double resultat = 0;
//
//        try {
//            System.out.println("1");
//            resultat = 20 / leNombre;
//            System.out.println(resultat);
//        } catch (Exception e) {
//           throw new MonException("ggg");
//        }
//
//    }

//    public static void maFonction(int i) throws NumberFormatException, ArithmeticException {
//        if (i == 1) {
//            throw new NumberFormatException();
//        } else if (i == 2) {
//            throw new ArithmeticException();
//        } else if (i == 3) {
//            System.out.println("gagne");
//        }
//    }
}
