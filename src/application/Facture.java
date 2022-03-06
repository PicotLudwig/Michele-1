package application;

import java.util.ArrayList;
import java.util.Date;

public abstract class Facture implements OperationFacture {
    private static int baseNumFact = 1;
    private int numFact;
    private Date date;
    private ArrayList<LigneFacture> ligneFactures = new ArrayList<>();

    public Facture() {
    }

    public Facture( Date date, ArrayList<LigneFacture> ligneFacturesClient) {
        this.numFact = baseNumFact;
        baseNumFact++;
    }

    public int getNumFact() {
        return numFact;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<LigneFacture> getLigneFactures() {
        return ligneFactures;
    }

    @Override
    public void saisirFacture() {

    }


    public void afficheFacture(FactureVente factureVente) {
        System.out.println(this.getNumFact());
        System.out.println(this.getDate());
        System.out.println(this.getLigneFactures());
        System.out.println(factureVente.getClient());
    }

    @Override
    public double totalFacture() {
        double total = 0;
        for (LigneFacture a : ligneFactures){
          total += a.getPrix() * a.getQte();
        }
       return total;
    }
}
