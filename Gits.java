import java.util.ArrayList; 

public class Gits {
    ArrayList<Integer> l; 

    public Gits() {
        this.l = new ArrayList<>();
    }

    public int nroOcorrencias (ArrayList<Integer> l , Integer el){
        int cont=0;
        for(int i = 0 ; i < l.size();i++){
            if (l.get(i).equals(el)){
                cont++;
            }
        }
        return cont++; 
    }

    
}