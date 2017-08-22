package buscaminas_201602478;
import java.util.Scanner;
import java.util.Random;
/**
 * @author Eduardo
 */
public class Matriz_201602478 {
    boolean salir = false;
    
    String matrices [][];
    int vuelta [][];
    int nivel;
    int minas;
    int min;
    int fila;
    int columna;
    int FFila, CColumna;
    
    //int intermedio [][]= new int [6][6];
    //int avanzado [][]= new int [8][8];
    String matrizb [][]= new String [4][4];
    private Random random;
     
    String op;
 
    public void principiantem(){
       
        fila =4;
        columna=4;
        minas = 4;
        matrices = new String [fila][columna];
        vuelta = new int [fila][columna];

        for ( int i = 0; i<fila; i++) {
            //System.out.println();
            for (int j = 0; j<matrices.length; j++) {
               matrices[i][j]= " ";
            }     
        }
        for ( int i = 0; i<columna; i++) {
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
            FFila= random.nextInt(fila);
            CColumna= random.nextInt(columna);
            if(matrices[FFila][CColumna] == "*" ){
            } else {    
                matrices[FFila][CColumna] = "*";
                min ++;
            }
           
        }while(min < minas);
        
    }
    
    public void imprimir(){
        System.out.print(" ");
        for(int a = 1; a <= fila; a++){
           if (a < 10){
               System.out.print("  ");
               System.out.print(a);
           }
        }
        System.out.println();
        for(int c = 1; c <= columna; c++){
            if (c < 10){
                System.out.print(c + " ");
            }
            for(int d=0; d<fila; d++){
                System.out.print("[" + matrices[c-1][d] + "]");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
    public void impMatriX(){
   
        for(int i=1;i<fila-1;i++){
            System.out.println();
            for(int j=1;j<columna-1;j++){
                System.out.printf("  [%s]  ",matrices[i][j]); //matriz string para pruebas.
                
            }
        }
        //voltear();
    }
    
    public void menup(){
        System.out.println("-----------------------------------");
        System.out.println("NIVEL PRINCIPIANTE");
        principiantem();
        System.out.println("");
        System.out.println("---------------------------------  ");
        System.out.println("Voltear: v");
        System.out.println("Reiniciar: r");
        System.out.println("Salir: s");
        System.out.println("----------------------------------");
        
        Scanner sc = new Scanner(System.in);
        op = sc.nextLine();
        
        switch(op){

                case "v":  
                    
                    voltear();
                    //imprimir();
                    break;
                case "r": 
                    System.out.println("Desea Reiniciar el Juego presione y o n");
                    String reiniciar = sc.nextLine();
                    if(reiniciar.equals("y")){
                       menup();
                    }else if(reiniciar.equals("n")){
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
    
    
      public void voltear(){
          Scanner sc = new Scanner(System.in);
          Scanner scl = new Scanner(System.in);
           
            System.out.println("Ingrese fila");
            int f = sc.nextInt();
            if(f>fila || f<=0){
            System.out.printf("%n%s%n","Fila no valida, intente de nuevo");
            voltear();
        }            
            System.out.println("Ingrese columna");
            int c = sc.nextInt();
            if(c>columna || c<=0){
            System.out.printf("%n%s%n","Columna no valida, intente de nuevo");
            voltear();
        } 
            System.out.println("Esta Seguro presione y o n");
            String YN = scl.nextLine();
            if(YN.equalsIgnoreCase("y")){
            //impMatrizusuario(vfila,vcolumna);
            verificador(f,c);
        }else if(YN.equalsIgnoreCase("n")){
         menup(); 
        }else {System.out.println("Comando no valido, intente de nuevo");
        System.out.println();    
        menup();
        }       
            
   }
      public void verificador(int ff,int cc){
        int t;
        t=vuelta[ff][cc];
        if(matrices[ff][cc].equals(Integer.toString(t))){
                System.out.printf("%n%s%n","La casilla ya se muestra en pantalla,ingrese otra.");
                Matrizusuario(ff,cc,true);
            }else{
                    
        Matrizusuario(ff,cc,false);
        }
    }
     
    
    public void Matrizusuario(int ff,int cc,boolean a){
        if(a==false){
            

        
        /*if(vuelta[ff][cc]>=0){
            t=vuelta[ff][cc];
            matrices[ff][cc]=Integer.toString(t);
        }else{
            matrices[ff][cc]="*";
        }    
       
        
        if(vuelta[ff-1][cc]>=0 && vuelta[ff][cc]>=0){
           t=vuelta[ff-1][cc];
             matrices[ff-1][cc]=Integer.toString(t);
            
        }
        
        
        if(vuelta[ff+1][cc]>=0 && vuelta[ff][cc]>=0){
        t=vuelta[ff+1][cc];
        matrices[ff+1][cc]=Integer.toString(t);
       }
       
        if(vuelta[ff][cc-1]>=0 && vuelta[ff][cc]>=0){
        t=vuelta[ff][cc-1];
        matrices[ff][cc-1]=Integer.toString(t);
            
        }
        
        if(vuelta[ff][cc+1]>=0 && vuelta[ff][cc]>=0){
        t=vuelta[ff][cc+1];
        matrices[ff][cc+1]=Integer.toString(t);
            
        }
        
        */
        }
            for(int i=1;i<fila-1;i++){
                   System.out.println();
                   for(int j=1;j<columna-1;j++){
                       System.out.printf("  [%s]  ",matrices[i][j]); //matriz string para pruebas.
                       //System.out.printf("  [%d]  ",matrizcontrol[i][j]);
                   }//forj
               }//fori
            
            if(vuelta[ff][cc]<0){
                System.out.printf("%n%s%n%s%n","           Perdiste","          GAME OVER");
                System.out.println("    Solucion:\n");
                //solucion();
                //Aca metodo para imprimir solucion
            }else{
                System.out.println();
            voltear();
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
