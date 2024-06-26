package AssocParent;
public class Main {
    public static void main(String[] args) {

        Lycee lycee=new Lycee("Annajah");

        //--------parent1-------------------//
        Parent p1=new Parent("Ali","Alaoui","X1001",TypeParent.Pere);
        lycee.ajouterParent(p1);
        p1.ajouterEnfant("2019/1","Alaoui","Adil");

        //-------Parent2-------------------//
        Parent p2=new Parent("Salwa","Omari","B5003",TypeParent.Mere);
        lycee.ajouterParent(p2);
        p2.ajouterEnfant("2019/2","Yousfi","Hassan");

        //-------parent3----------------//
        Parent p3=new Parent("Othman", "Zakani","ZR1003",TypeParent.Tuteur);
        lycee.ajouterParent(p3);
        p3.ajouterEnfant("2019","Tahiri","Samira");

        //-------parent4---------------//
        Parent p4=new Parent("Othman","Othmani","AB1509",TypeParent.Tuteur);
        lycee.ajouterParent(p4);
        p4.ajouterEnfant("2019/5","Nassiri","Youssef");
        p4.ajouterEnfant("2019/6","Nassiri","Sara");
        p4.ajouterEnfant("2019/7","Nassiri","Ayoub");

        //-------Ajouter Delegue-------//
        try{
            lycee.ajouterDelegue(p1);
            lycee.ajouterDelegue(p2);
            lycee.ajouterDelegue(p4);
        }catch (ParentInexistantException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(lycee);
        System.out.println("=========================================");
        System.out.println(lycee.getParent().contains(p1) + " - " + p1.getnom());
        System.out.println(lycee.getParent().contains(p2) + " - " + p2.getnom());
        System.out.println(lycee.getParent().contains(p3) + " - " + p3.getnom());
        System.out.println(lycee.getParent().contains(p4) + " - " + p4.getnom());

        //-------------------Affichage des pourcentages-----------//

        lycee.afficherPourcentageTypes();






    }
    }
