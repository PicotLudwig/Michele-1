package application;

import java.util.ArrayList;
import java.util.Date;

public class FactureAchat extends Facture {
    Fournisseur fournisseur;

    public FactureAchat( Date date, ArrayList<LigneFacture> ligneFacturesClient, Fournisseur fournisseur) {
        super(date, ligneFacturesClient);
        this.fournisseur = fournisseur;
    }

    @Override
    public void afficheFacture() {

    }
}
