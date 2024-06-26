package AssocParent;
import java.util.*;

public class Lycee {

    private String nom;
    private Set<Parent> parents;
    private Map<String,Parent> delegues;
    public Lycee(String nom){
        this.nom=nom;
        this.parents=new HashSet<>();
        this.delegues=new HashMap<String, Parent>();
    }

    public String getnom(){
        return this.nom;
    }
    public Set<Parent> getParent(){
        return this.parents;
    }
    public Map<String,Parent> getdelegue(){
        return this.delegues;
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    public void setparents(Set<Parent> parents){
        this.parents=parents;
    }
    public void setdelegues(Map<String,Parent> delegues){
        this.delegues=delegues;
    }
    public void ajouterParent(Parent parent){
        parents.add(parent);
    }
    public Parent chercherParent(String CIN){
        Parent p=null;
        Iterator<Parent> it=this.parents.iterator();
        boolean trouvee=false;
        while(!trouvee && it.hasNext()){
            Parent pr=it.next();
            if (pr.getcin().equals(CIN)) {
                p=pr;
                trouvee=true;
            }
        }return p;

    }

public void ajouterDelegue(String CIN) throws ParentInexistantException{
Parent p=this.chercherParent(CIN);
if(p==null) throw  new ParentInexistantException("CIN parent inexistant");

this.delegues.put(CIN,p);
}

public void ajouterDelegue(Parent p) throws ParentInexistantException{
        if(!this.parents.contains(p)) throw new ParentInexistantException("Ce n est pas un parent");
        this.delegues.put(p.getcin(),p);
}

public void ajouterDelegue(String[] tabCin) throws ParentInexistantException{

}
public void afficherPourcentageTypes(){
     int total = this.parents.size();
     int nbrmeres=0 , nbrperes=0, nbrtuters=0;
     for(Parent p :parents){
         if (p.gettype() == TypeParent.Mere){
             nbrmeres++;
         }
         else if (p.gettype() == TypeParent.Pere){
             nbrperes++;
         }
         else if (p.gettype() == TypeParent.Tuteur){
             nbrtuters++;
         }
     }
    System.out.println("Pourcentage Meres"+(nbrmeres/(float) total)*100 + "%" + " Pourcentage Peres " + (nbrperes / (float)total) *
            100 + "%" + " Pourcentage Tuteurs " + (nbrtuters / (float)total) * 100 + "%");
}


public String toString(){
        String parent="\n les parents sont :";
        for (Parent p:parents){
            parent+="\n\t "+p.toString();
        }
        String delegue ="\nles delegues sont :";
        for (Map.Entry<String,Parent>  d:delegues.entrySet()){
            delegue += "\n\t "+d.getValue().toString();
        }
    return "Lycee [nom=" + nom + ", \nparents=" + parent +
            "\n" + ", \ndélégués=" + "\n" + delegue + "]";
}

}









