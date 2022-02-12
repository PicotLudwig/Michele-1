package space;

import java.util.ArrayList;

public class SolarSystem {


    public ArrayList<Astre> listeAstre = new ArrayList<>();

    public SolarSystem(String name) {


    }

    public void setAstre(Astre astre) {

        if (astre instanceof Stars) {
            for (Astre astreDeLaListe : listeAstre) {
                if (astreDeLaListe instanceof Stars) {
                    System.out.println("Error: you already have a star!!");
                }
            }
        } else {
            listeAstre.add(astre);
        }
    }

}
