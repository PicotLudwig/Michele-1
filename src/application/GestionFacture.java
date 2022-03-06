package application;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionFacture {

    public GestionFacture() {
    }



    public static void main(String[] args) {
        ArrayList<Facture> factures = new ArrayList<>();

        System.out.println(factures.size());
    }

    public static void creatingFacture (ArrayList<Facture> factures) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Select facture type: achat or vente");
        String userInput = myScanner.nextLine();
        System.out.println("Whats the dtaee");
        String dateInput = myScanner.nextLine();
        System.out.println("Select facture type: achat or vente");
        String userInput = myScanner.nextLine();
        myScanner.close();
        if (userInput.equals("vente")) {
        factures.add(new FactureVente(Date.valueOf(dateInput), new ArrayList<>(), ));
    }
        if (userInput.equals("vente")) {
        factures.add(new FactureAchat());
        }
    }
}
