package humanity;

public class MenTeenager extends Men {

    public MenTeenager(int age) {
        super (age);
        this.levelOfSmartness = Smartness.NOT_VERY_SMART;
    }

    public void setTaille(int taille) {
        System.out.println("La fonction de Men");
        this.taille = taille;
    }

    public int getTaille () {
        return taille;
    }
}
