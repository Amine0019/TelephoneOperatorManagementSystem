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

    //une methode qui permet de chercher un abonne dans un tableau d'operateur
    public int searchAbonne(Abonne abonne ){
        int index = -1;
        for (int i = 0; i < abonnes.length; i++) {
            if(abonnes[i]==abonne){
                return index;
            }
        }
        return index;
    }

    // méthode qui permet d'ajouter un Abonne a un operteur



}
