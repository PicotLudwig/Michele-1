import books.Library;
import books.PaperBooks;
import history.AncientHistorian;
import history.MedievalHistorian;
import humanity.Human;

import java.util.ArrayList;
import java.util.List;

public class main {
    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {
        PaperBooks paperBooks1 = new PaperBooks("dsfdf", 26.99, "Rpbert Frost", 565);
        paperBooks1.burn();
        Library pierrefonds = new Library();
        pierrefonds.booksList.add(paperBooks1);
        System.out.println(pierrefonds.booksList.get(0).author);
    }
}
