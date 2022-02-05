package books;

public class PaperBooks extends Books implements Paper{
    public PaperBooks (String title, double price, String author, int numberOfPages) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void damaged() {

    }

    @Override
    public void burn() {
        System.out.println("burning");
    }
}
