package books;

public class Ebooks extends Books implements Numeric{
    public Ebooks (String title, double price, String author, int numberOfPages) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void download() {
        System.out.println("Your book is downloaded !");
    }

    @Override
    public void expiration() {

    }
}
