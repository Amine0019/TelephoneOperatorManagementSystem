public class Main {
    public static void main(String[] args) {

        //création de l'instance de la classe Abonne
        Abonne abonne1 = new Abonne("Larbi","Amine",50917433,5700);
        Abonne abonne2 = new Abonne("Cherif ","Skander",53689072,2000);

        //tester la methode saisir Abonne
        System.out.println("Veuillez saisir les informations de l'abonne :\n");
        abonne1.saisirAbonne();

        //tester la methode afficher Abonne
        System.out.println("Les informations de l'abonne sont : \n");
        abonne1.afficherAbonne();

        //tester la methode qui recharge Un Abonne
        System.out.println("Le solde de l'abonne aprés recharge est : \n");
        abonne1.rehchargerAbonne(5000);
        abonne1.afficherSolde();

        //tester la methode consommation d'un abonne
        System.out.println("La consomation de l'abonne est : \n");
        boolean resultat1 = abonne1.connsommationAbonne(120,500);
        System.out.println("La consomation de l'abonne est résussite : \n"+resultat1);
        abonne1.afficherSolde();

        //création d'une instance de la classe Abonne
        Operateur operateur = new Operateur();
        operateur.setAbonnes(new Abonne[50]);

        //Ajout des abonnes a l'operateur
        operateur.getAbonnes()[0] = abonne1;
        operateur.getAbonnes()[1] = abonne2;

        //tester la méthode searchAbonne
        int index = operateur.searchAbonne(abonne1);

        if(index != -1){
            System.out.println("L'abonne a été trouvé a l'index : " + index);
        }else{
            System.out.println("L'abonne n'a pas été touvé :");
        }

        //tester la méthode afficher Operateur :
        operateur.displayOperateur();






    }
}