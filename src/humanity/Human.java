package humanity;

import java.util.ArrayList;
import java.util.List;

public abstract class Human implements Mortel{
    Smartness levelOfSmartness;
    String sexe;
    int age;
    int taille;
    List<Children> childrenList = new ArrayList<>();

    public Human (String sexe, int age) {
        this.sexe = sexe;
        this.age = age;
    }

    public Human (String sexe) {
        this.sexe = sexe;
    }

    public Human (int age) {
        this.age = age;
    }

    public Human () {}

    public void setTaille (int taille) {
        System.out.println("La fonction de Human");
        this.taille = taille;
    }

    public int getTaille () {
        return taille;
    }

    @Override
    public void meurt() {

    }

    @Override
    public void nait(int age) {

    }

    @Override
    public void mange(int age) {
    }
}
