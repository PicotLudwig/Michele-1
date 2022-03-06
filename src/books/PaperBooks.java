package books;

public class PaperBooks extends Books {

    public PaperBooks(String title, String author, boolean availability, int numberOfCopies, int numberOfCopiesAvailable) {
        super(title, author, availability, numberOfCopies, numberOfCopiesAvailable);
    }

    public PaperBooks (double price) {
        super(price);
    }

    public boolean checkAvailability(int quantity) {
        if (numberOfCopiesAvailable > 0
                && quantity <= numberOfCopiesAvailable) {
            return true;
        }
        return false;
    }
}

