package AssocParent;

import java.util.Comparator;

public class Nbenfants implements Comparator <Parent>{
    @Override
    public int compare(Parent p1,Parent p2){
        System.out.println("Inside Comparator -p1"+p1.getnom()+":"+p1.getEnfants().size()+"- p2 = "+p2.getnom()+":"+p2.getEnfants().size());
        if (p1.getEnfants().size() == p2.getEnfants().size()){
            return p1.getcin().compareTo(p2.getcin());
        }


    return (p1.getEnfants().size() - p2.getEnfants().size());
    }
}
