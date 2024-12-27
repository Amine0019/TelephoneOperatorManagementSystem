public class Abonne {
    //Declaration des attributs de la classe
    private String nom;
    private String prenom;
    private int numero;
    private  double solde;

    //génération du constructeur par défaut
    public Abonne() {
    }

    //génération du constructeur paramétré

    public Abonne(String nom, String prenom, int numero, double solde) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.solde = solde;
    }

    //génération des getters et setters de chaque attribut de la classe

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


}
