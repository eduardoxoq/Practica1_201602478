package buscaminas_201602478;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Eduardo
 */
public class Matriz_201602478 {
    boolean salir = false;
    
    char matrices [][];
    char vuelta [][];
    int nivel;
    int minas;
    int min;
    int fila;
    int columna;
    //int intermedio [][]= new int [6][6];
    //int avanzado [][]= new int [8][8];
    String matrizb [][]= new String [4][4];
    private Random random;
     
    String op;
    
    
    
    public void principiantem(){
        nivel = 4;
        minas = 4;
        matrices = new char [nivel][nivel];
        vuelta = new char [nivel][nivel];

        for ( int i = 0; i<nivel; i++) {
            //System.out.println();
            for (int j = 0; j<matrices.length; j++) {
               matrices[i][j]= ' ';
            }     
        }
        for ( int i = 0; i<nivel; i++) {
            System.out.println();
            for (int j = 0; j<vuelta.length; j++) {
               //vuelta[i][j]= 'x';
               System.out.printf("[x]",vuelta[i][j]);
            }     
        }
        minasale();
        //imprimir ();

    }
    public void minasale(){
        min= 0;
        
        do{
            random = new Random();
            fila= random.nextInt(nivel);
            columna= random.nextInt(nivel);
            if(matrices[fila][columna] == '*' ){
            } else {    
                matrices[fila][columna] = '*';
                min ++;
            }
           
        }while(min < minas);
        
    }
    
    public void imprimir(){
        System.out.print(" ");
        for(int a = 1; a <= nivel; a++){
           if (a < 10){
               System.out.print("  ");
               System.out.print(a);
           }
        }
        System.out.println();
        for(int c = 1; c <= nivel; c++){
            if (c < 10){
                System.out.print(c + " ");
            }
            for(int d=0; d<nivel; d++){
                System.out.print("[" + matrices[c-1][d] + "]");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
    public void imprimirX(){
        
    }  
              
    
    public void menup(){
        System.out.println("---------------------------------");
        System.out.println("NIVEL PRINCIPIANTE");
        principiantem();
        System.out.println("");
        System.out.println("  ---------------------  ");
        System.out.println("Voltear: V");
        System.out.println("Reiniciar: R");
        System.out.println("Salir: S");
        System.out.println("----------------------------------");
        
        Scanner sc = new Scanner(System.in);
        op = sc.nextLine();
        
        switch(op){

                case "v":  
                    System.out.println("Ingrese fila");
                    int f = sc.nextInt();
                    System.out.println("Ingrese columna");
                    int c = sc.nextInt();
                    System.out.println("Esta Seguro presione Y o N");
                    //int YN = sc.nextInt();
                    
                    imprimir();
                    

                    break;
                case "r": 
                    System.out.println("Desea Reiniciar el Juego presione Y o N");
                    String reiniciar = sc.nextLine();
                    if(reiniciar.equals("Y")){
                       menup();
                    }else if(reiniciar.equals("N")){
                       return; 
                    }else{
                        
                        System.out.println("opcion invalida");
                        return;
                    }
        
                    break;
                    
                case "s":  
                     return;
                default:
                   System.out.println("Elije una opcion v,r,s"); 
                             
            }
        }
        

   public void matrizb(){    
       for ( int i = 0; i<matrizb.length; i++) {
            System.out.println();
            for (int j = 0; j<matrizb.length; j++) {
                System.out.printf("  [x]  ", matrizb[i][j]);
            }     
        }  
       
   }
        
  
   /* public void intermedio(){
        
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
    }*/       
}
