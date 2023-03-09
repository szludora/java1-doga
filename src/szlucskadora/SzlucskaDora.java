package szlucskadora;
import java.util.ArrayList;
import java.util.Scanner;

public class SzlucskaDora {
    
    // Szlucska Dóra
    
    public static void main(String[] args) {
    int[] lista = tombLetrehozas(4);
    System.out.println(vanbenne13(lista));
    osszesOsztoja(lista);
    }
    
    
    public static int[] tombLetrehozas(int hossz){
        int[] veletlenek = new int[hossz];
        
        
        int i = 0;
        while (i < hossz) {
        int veletlen = (int)(Math.random()*16) - 5;
        veletlenek[i] = veletlen;
        i++;}
 
        return veletlenek;
    }
    
    public static boolean vanbenne13(int[] lista){
        int i = 0;
        while (i < lista.length && lista[i] != 13) {
        i++;}
        if(i < lista.length){
            return true;
        }
        else {
            return false;
        }
    }
    
    public static int bekerszam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot 0 és a lista hossza-1 között: ");
        int beker = sc.nextInt();
        return beker;
    }
    
    public static void osszesOsztoja(int [] lista){
        int index = bekerszam();
        int abszolut = Math.abs(lista[index]);
        ArrayList osztoi = new ArrayList();
        
        int i = 2;
        while (i < abszolut) {
            if(abszolut%i == 0){
               osztoi.add(i);
            }
        i++;}
        
        if(osztoi.size() < 1) {
            System.out.println("Prím szám");
        }
        else {
            int x = 0;
            while (x < osztoi.size() - 1) {
                System.out.print(osztoi.get(x) + ", ");
            x++;
            }
            System.out.print(osztoi.get(x) + "\n");
        }
 }
}
        
        
