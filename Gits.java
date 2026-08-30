import java.util.ArrayList;

public class Gits {

    private ArrayList<Integer> l;

   
    public Gits() {
        this.l = new ArrayList<>();
    }

    
    public int nOcorrencias(Integer el) {
        if (this.l == null || el == null) return 0;
        int cont = 0;
        for (int i = 0; i < this.l.size(); i++) {
            if (this.l.get(i).equals(el)) {
                cont++;
            }
        }
        return cont;
    }

    public boolean hasRepeat() {
        if (this.l == null) return false;
        for (int i = 0; i < this.l.size(); i++) {
            for (int j = i + 1; j < this.l.size(); j++) {
                if (this.l.get(i).equals(this.l.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
// forçando erro. 

  
}
