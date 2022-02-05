package history;

public class AncientHistorian extends Historian {

    public AncientHistorian(String sexe, int age) {
        super(sexe, age);
    }

    @Override
    public void meurt() {
        System.out.println("Je meurs tragiquement !");
    }

    public void meurt(int age) {
        System.out.println("Je meurs tragiquement a " + age);
    }
}
