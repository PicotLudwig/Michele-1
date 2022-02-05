package history;

public class MedievalHistorian extends Historian{

    public MedievalHistorian(String sexe, int age) {
        super(sexe, age);
    }

    @Override
    public void meurt() {
        System.out.println("Je suis un chevalier !");
    }
}
