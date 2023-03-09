package szlucskadora;
import java.util.Random;

public class SzlucskaDora {
    
    // Szlucska Dóra
    
    public static void main(String[] args) {
       
    tombLetrehozas(4);
    
    static int[] tombLetrehozas(int hossz){
        int[] veletlenek = null;
        
        int i = 0;
        while (i < hossz) {
        int veletlen = (int)(Math.random()*16) - 5;
        veletlenek.add(veletlen);
        i++;}
        return veletlenek;
        
    }
        
                
    
    }
    
}
