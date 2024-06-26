package  AssocParent;


import java.util.*;


public class Parent {
    private String nom;
    private String prenom;
    private String cin;
    private TypeParent type;
    private Set<Eleve> enfants;


    public Parent(String nom, String prenom, String cin, TypeParent type) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.type = type;
        this.enfants = new HashSet<>();
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getprenom() {
        return prenom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public String getcin() {
        return cin;
    }

    public void setcin(String prenom) {
        this.cin = cin;
    }

    public TypeParent gettype() {
        return type;
    }

    public void settype(TypeParent type) {
        this.type = type;
    }

    public Set<Eleve> getEnfants() {
        return enfants;
    }

    public void setenfants(Set<Eleve> enfants) {
        this.enfants = enfants;
    }

    //Ajouter des enfants
    public void ajouterEnfant(Eleve eleve) {
        enfants.add(eleve);
    }

    public void ajouterEnfant(String id, String nom, String prenom) {
        enfants.add(new Eleve(id, nom, prenom));
    }

    public void ajouterEnfants(Set<Eleve> enfants) {
        this.enfants.addAll(enfants);
    }

    public Eleve ChercherEnfant(String id) {
        Eleve e = null;
        Iterator it = this.enfants.iterator();
        boolean trouve = false;
        while (!trouve && it.hasNext()) {
            Eleve elv=(Eleve) it.next();
            if(elv.getid().equals(id)){
                e=elv;
                trouve=true;
            }

        }

        return e;
    }
    public boolean supprimerEnfant(String id) {
        Eleve e = ChercherEnfant(id);
        boolean fait = false;
        if (e != null) {
            enfants.remove(e);
            fait = true;


        }
        return fait;
    }


    public String toString(){
        String eleves="mes enfants sont :";
        for(Eleve e :enfants){
            eleves+="\n\t\t"+e.toString();
        }

        return "Parent [cin="+cin+",nom="+nom+",prenom="+prenom+",type="+type+",\n\t enfants="+eleves+"]";
    }
}

