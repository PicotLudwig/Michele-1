package application;

import java.util.ArrayList;
import java.util.Date;

public class FactureVente extends Facture{
    Client client;



    public FactureVente(Date date, ArrayList<LigneFacture> ligneFacturesClient, Client client) {
        super(date,ligneFacturesClient);
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void afficheFacture() {

    }
}
