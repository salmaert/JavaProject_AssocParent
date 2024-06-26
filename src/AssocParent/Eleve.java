package AssocParent;


public class Eleve implements Comparable {

    private String id;
    private String nom;
    private String prenom;
    private Parent parent;
    public Eleve(String id,String prenom,Parent parent){
        this.id=id;
        this.prenom=prenom;
        this.parent=parent;
    }
    public Eleve(String id,String nom,String prenom){
        this.id=id;
        this.prenom=prenom;
        this.nom=nom;
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    public String getnom(){
        return nom;
    }
    public void setprenom(String prenom){
        this.prenom=prenom;
    }
    public String getprenom(){
        return prenom;
    }

    public void setid(String id){
        this.id=id;
    }
    public String getid(){
        return id;
    }
    public Parent getparent(){
        return parent;
    }
    public void setparent(Parent parent){
        this.parent=parent;
    }

    @Override
    public int compareTo(Object o){
        Eleve e = (Eleve) o;
        int comp=this.nom.compareTo(e.nom);
          if (comp==0) {
              return this.prenom.compareTo(e.prenom);
          }
          return comp;
    }
    @Override
    public String toString() {
        return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }
}
