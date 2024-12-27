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



    public int searchAbonne(Abonne abonne) {
        for (int i = 0; i < abonnes.length; i++) {
            if (abonnes[i] != null && abonnes[i].equals(abonne)) {
                return i; // Retourne l'index si l'abonné est trouvé
            }
        }
        return -1; // Retourne -1 si l'abonné n'est pas trouvé
    }




    // méthode qui permet d'ajouter un Abonne a un operteur



}
