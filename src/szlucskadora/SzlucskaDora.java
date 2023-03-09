package szlucskadora;
import java.util.Random;

public class SzlucskaDora {
    
    // Szlucska Dóra
    
    public static void main(String[] args) {
       
    tombLetrehozas(4);
    }
    
    
    public static int[] tombLetrehozas(int hossz){
        int[] veletlenek;
        
        int i = 0;
        while (i < hossz) {
        int veletlen = (int)(Math.random()*16) - 5;
        veletlenek.add(veletlen);
        i++;}
        return veletlenek;
    }
    
    public static void vanbenne13(){
        
    }
    
    public static void bekerszam(){
        
    }
    
    public static void osszesOsztoja(){
        
    }
    
}
