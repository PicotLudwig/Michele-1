package books;

public class Erreur extends Exception {
    String message;

    public Erreur (String message) {
        this.message = message;
    }
}
