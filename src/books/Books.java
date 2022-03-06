package books;

public abstract class Books {
    public String title;
    public String author;
    public boolean availability;
    public String dueDate;
    public int numberOfCopies;
    public int numberOfCopiesAvailable;
    public double price;
public LangueEnum langueEnum;

    public Books (String title, String author, boolean availability, int numberOfCopies, int numberOfCopiesAvailable) {
        this.title = title;
        this.author = author;
        this.availability = availability;
        this.numberOfCopies = numberOfCopies;
        this.numberOfCopiesAvailable = numberOfCopiesAvailable;
    }

    public Books(double price) {
        this.price=price;
    }
}
