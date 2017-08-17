package buscaminas_201602478;
//import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Eduardo
 */
public class Matriz_201602478 {
    
    int principiante [][]= new int [4][4];
    int intermedio [][]= new int [6][6];
    int avanzado [][]= new int [8][8];
    private Random random;
    
    //random = new Random(); 
    
    public void principiantem(){
        random = new Random(); 
        for (int i = 0; i<principiante.length; i++) {
            System.out.println();
            for (int j = 0; j<principiante.length; j++) {
                principiante [i][j] = random.nextInt(3);
                System.out.printf("  [%s]  ", principiante[i][j]);
            }     
        }
    }
    
    public void intermedio(){
        
        for (int[] intermedio1 : intermedio) {
            System.out.println();
            for (int j = 0; j<intermedio.length; j++) {
                System.out.printf("  [%s]  ", intermedio1[j]);
            }     
        }
    }    
    public void avanzado(){
        
        for (int[] intermedio1 : avanzado) {
            System.out.println();
            for (int j = 0; j<avanzado.length; j++) {
                System.out.printf("  [%s]  ", intermedio1[j]);
            }     
        }
    }     

    
}
