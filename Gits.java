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


  
}