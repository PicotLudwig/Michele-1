package application;

import java.util.Locale;
import java.util.Scanner;

public class Article {
    private static double initialNumArt = 1;
    private double numArt;
    private String libelle;

    public Article(String libelle) {
        this.libelle = libelle;
        this.numArt = initialNumArt;
        initialNumArt++;
    }


    public void saisirArticle () {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter article name");
        String inputLibelleName = myScanner.nextLine();
        setLibelle(inputLibelleName);
        myScanner.close();
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
