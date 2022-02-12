public class Car {

     static int numberOfCarCreated = 0;

    private int nombreRoues = 4;
    private String color;
    private double costs;
    private int vitesse = 0;

    public void methodeCouleurCout() {
        System.out.println("Ma couleur: " + this.color + "  et mon cout: " + this.costs);
    }



    public Car(String color, double costs) {
        this.color = color;
        this.costs = costs;
        numberOfCarCreated += 1;
    }

    public void freiner(int vitesse) {
        if (verifierVitessePourFreiner(vitesse)){
            this.vitesse -= vitesse;
        }
    }

    private boolean verifierVitessePourFreiner(int vitesse) {
        boolean reponse = false;

        if (this.vitesse >= vitesse) {
            reponse = true;
        }
        return reponse;
    }

    public static int getNumberOfCarCreated() {
        return numberOfCarCreated;
    }

    public static void setNumberOfCarCreated(int numberOfCarCreated) {
        Car.numberOfCarCreated = numberOfCarCreated;
    }

    public int getNombreRoues() {
        return nombreRoues;
    }

    public void setNombreRoues(int nombreRoues) {
        this.nombreRoues = nombreRoues;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
        this.costs = costs;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}
