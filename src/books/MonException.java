package books;

public class MonException extends Exception{

    String message;

    public MonException(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
       return this.message;
    }
}
