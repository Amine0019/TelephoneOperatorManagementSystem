import java.util.Arrays;

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
    void addAbonne(Abonne abonne) {
        for (int i = 0; i < abonnes.length; i++) {
            if(abonnes[i] == null){
                abonnes[i] = abonne;
                System.out.println("L'abonne a été ajouté avec succées a l'operateur ");
                return;
            }
        }
        System.out.println("L'operateur est plein impossibile d'ajouter un abonne");
    }

    //méthode qui permet de supprimer un Abonne d'un tableau d'operateur
    public void removeAbonne(Abonne abonne) {
        boolean trouve = false;
        for (int i = 0; i < abonnes.length; i++) {
            if (abonnes[i] != null && abonnes[i].equals(abonne)) {
                abonnes[i] = null; // Supprime l'abonné
                trouve = true;
                // Réorganiser le tableau pour éviter des trous
                for (int j = i; j < abonnes.length - 1; j++) {
                    abonnes[j] = abonnes[j + 1];
                }
                abonnes[abonnes.length - 1] = null; // Dernière case mise à null
                System.out.println("L'abonné a été supprimé avec succès.");
                return; // Sortir de la méthode après suppression
            }
        }
        if (!trouve) {
            System.out.println("Abonné introuvable.");
        }
    }


    //méthode pour afficher tous les Abonnes d'un operateur
    void displayOperateur() {
        for (int i = 0; i < abonnes.length; i++) {
            if(abonnes[i] != null){
                System.out.println("Nom Abonnes :"+abonnes[i].getNom()+"Prenom Aonnes: "+abonnes[i].getPrenom()+"Numero Abonnes :"+abonnes[i].getNumero()+"Solde Abonnee :"+abonnes[i].getSolde());
            }
        }
    }

    //methode to String
    @Override
    public String toString() {
        return "nom : " + nom + "\nabonnes: " + Arrays.toString(abonnes);
    }



}
