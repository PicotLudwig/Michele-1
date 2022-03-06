package application;

public class LigneFacture {
    private Article article;
    private double prix;
    private int qte;

    public LigneFacture(Article article, double prix, int qte) {
        this.article = article;
        this.prix = prix;
        this.qte = qte;
    }

public void afficherLigneFacture(Article article) {
    System.out.println(article.getLibelle());
    System.out.println(this.prix);
    System.out.println(this.qte);
}

    public Article getArticle() {
        return article;
    }

    public double getPrix() {
        return prix;
    }

    public int getQte() {
        return qte;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}
