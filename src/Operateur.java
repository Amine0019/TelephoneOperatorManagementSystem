public class Operateur {

    //Déclaration des attributs de la classe
    private String nom;
    private Abonne[] abonnes;

    //generation du constructeur par defaut
    public Operateur() {
    }

    //generation du constructeur parametre
    public Operateur(String nom, Abonne[] abonnes) {
        this.nom = nom;
        this.abonnes = abonnes;
    }

    // generation des getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Abonne[] getAbonnes() {
        return abonnes;
    }

    public void setAbonnes(Abonne[] abonnes) {
        this.abonnes = abonnes;
    }


}
