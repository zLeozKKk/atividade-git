import java.util.ArrayList; 

public class Gits {
    ArrayList<Integer> l; 

    public Gits() {
        this.l = new ArrayList<>();
    }

    public int nroOcorrencias(Integer el) {
        int cont = 0;
        for (int i = 0; i < this.l.size(); i++) {
            if (this.l.get(i).equals(el)) {
                cont++;
            }
        }
        return cont; 
    }
    
    
}