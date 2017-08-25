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
    private boolean champ;
    private Random random;
    String op;
    
 
    public void principiantem(){
        min=4;
        fila=4;
        columna=4;
        matrices = new String [fila][columna];
        vuelta = new int [fila][columna];

        for ( int i = 0; i<fila; i++) { 
             System.out.println();
            for (int j = 0; j<columna; j++) {
               matrices[i][j]= "x";
               System.out.printf("[" + matrices[i][j] + "]");
            }     
        }   
    }
        
    public void minasale(){
        min= 0;
        
        do{
            random = new Random();
            FFila= random.nextInt(fila);
            CColumna= random.nextInt(columna);
            if(vuelta[FFila][CColumna]==0){
            vuelta[FFila][CColumna]=-50;
            minas=minas-1;
        } 
                min ++;  
        }while(min < minas);
        imprimir();   
    }
     
    public void imprimir(){
        for(int i = 0; i <= fila; i++){
            for(int j=0; j<columna; j++){
               if(vuelta[i][j]<0){
                   matrices[i][j] = "*";
               }
            }
            camino();
    }
    }  
    public void imprimirxxx(){
        
           fila =4;
        columna=4;
        minas = 4;
        matrices = new String [fila][columna];
        vuelta = new int [fila][columna];

        for ( int i = 0; i<fila; i++) {            
            for (int j = 0; j<columna; j++) {
               matrices[i][j]= "0";
            }     
        }
        for ( int i = 0; i<fila; i++) {
            //System.out.println();
            for (int j = 0; j<columna; j++) {
               //vuelta[i][j]= 'x';
               //System.out.printf("[ x ]",vuelta[i][j]);
            }     
        }
        
        System.out.println("");
        
        min= 0;
        
        do{
            random = new Random();
            FFila= random.nextInt(fila);
            CColumna= random.nextInt(columna);
            if(" * ".equals(matrices[FFila][CColumna]) ){
            } else {    
                matrices[FFila][CColumna] = "*";
                min ++;
            }
           
        }while(min < minas);
        
  
        for(int i = 1; i <= fila; i++){
            if (i < 10){
                System.out.print(i + " ");
            }
            for(int j=0; j<columna; j++){
                System.out.print("[" + matrices[i-1][j] + "]");
            }
            System.out.print("\n");
            } 
    }
    public void xusuariox(){
        
         for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                matrices[i][j]="x";
            }
        }
        for(int i=0;i<fila;i++){
            System.out.println();
            for(int j=0;j<columna;j++){
                System.out.printf("[ " +  matrices[i][j] + " ]" );
            }
        }
        voltear();
    }
    public void matrizmuestra(){
   
        for(int i=0;i<fila;i++){
            System.out.println();
            for(int j=0;j<columna;j++){
                System.out.printf("[ " + matrices[i][j] + "]"); 
            }
        }
       voltear();
    }
    
    public void camino(){
    
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                if(vuelta[i][j]<0){
                    vuelta[i-1][j]+=1;
                    vuelta[i+1][j]+=1;
                    vuelta[i][j-1]+=1;
                    vuelta[i][j+1]+=1;
                    vuelta[i-1][j-1]+=1;
                    vuelta[i-1][j+1]+=1;
                    vuelta[i+1][j-1]+=1;
                    vuelta[i+1][j+1]+=1;    
                }
            }
        }
        xusuariox(); 
    }
    public void menuP(){
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
                    minasale();
                    
                    break;
                case "r": 
                    System.out.println("Desea Reiniciar el Juego presione y o n");
                    String reiniciar = sc.nextLine();
                    if(reiniciar.equals("y")){
                       menuP();
                    }else if(reiniciar.equals("n")){
                       return; 
                    }else{
                        
                        System.out.println("opcion invalida");
                        return;
                    }
        
                    break;
                    
                case "s":  
                     return;
                case "solucion":  
                     imprimirxxx(); 
                     System.out.println("Esta es la solucion");
                default:
                   System.out.println("Elije una opcion v,r,s"); 
                             
            }
        }
    
    
      public void voltear(){
          Scanner st = new Scanner(System.in);
          Scanner sc = new Scanner(System.in);
          int f,c;
          System.out.println("");
          System.out.println("Ingrese  fila , columna");
          System.out.println("Ejemplo 1,1");
        
          String lector=st.nextLine();
          String posicion[]=lector.split(",");
       
          if (posicion.length != 2) {
            System.out.println("Ingrese coordenadas validas");
            menuP();
        } 
         f=Integer.parseInt(posicion[0]);
         if(f>fila || f<=0){
            System.out.println("Ingrese coordenadas validas");
            menuP();
        }
         c=Integer.parseInt(posicion[1]);
             if(c>columna || c<=0){
             System.out.println("Ingrese coordenadas validas");
            menuP();   
        }
        System.out.println("¿Esta seguro de sus coordenadas?");
        System.out.println("Si: y     No:  n");
        String seguro =sc.nextLine();
        
        if(seguro.equalsIgnoreCase("y")){
           
            verificador(f,c);
        }else if(seguro.equalsIgnoreCase("n")){
         menuP();  
        }else {System.out.println("Opcion no valida");
        System.out.println();    
        voltear();
        }    
              
    }
       
    
      public void mostrarusuario(boolean a, int bfila,int bcolumna){
        if(a==false){
            
        int k;
        if(vuelta[bfila][bcolumna]>=0){
            k=vuelta[bfila][bcolumna];
            matrices[bfila][bcolumna]=Integer.toString(k);
        }else{
            matrices[bfila][bcolumna]="*";
        }    
        
        if(vuelta[bfila-1][bcolumna]>=0 && vuelta[bfila][bcolumna]>=0){
            k=vuelta[bfila-1][bcolumna];
             matrices[bfila-1][bcolumna]=Integer.toString(k);
            
        }
        
        if(vuelta[bfila+1][bcolumna]>=0 && vuelta[bfila][bcolumna]>=0){
        k=vuelta[bfila+1][bcolumna];
        matrices[bfila+1][bcolumna]=Integer.toString(k);
       }
       
        if(vuelta[bfila][bcolumna-1]>=0 && vuelta[bfila][bcolumna]>=0){
        k=vuelta[bfila][bcolumna-1];
        matrices[bfila][bcolumna-1]=Integer.toString(k);
            
        }
        
        if(vuelta[bfila][bcolumna+1]>=0 && vuelta[bfila][bcolumna]>=0){
        k=vuelta[bfila][bcolumna+1];
        matrices[bfila][bcolumna+1]=Integer.toString(k);
            
        }       
        }
            for(int i=0;i<fila;i++){
                   System.out.println();
                   for(int j=0;j<columna;j++){
                       System.out.printf("[" + matrices[i][j] + "]");                  
                   }
               }
            
            if(vuelta[bfila][bcolumna]<0){
                System.out.println(" ");
                System.out.printf("    :V Perdiste  :V","   :V GAME OVER :V ");
                System.out.println(" Solucion:");
                //solucion();
                //Aca metodo para imprimir solucion
            }else{
                System.out.println();
                
            ganar();
            }
            
    }
      public void verificador(int bfila,int bcolumna){
        int k;
        
        k=vuelta[bfila][bcolumna];
        
        if(matrices[bfila][bcolumna].equals(Integer.toString(k))){
                System.out.printf("%n%s%n","La casilla ya fue ingresada");
                mostrarusuario(true, bfila,bcolumna);
            }else{
                    
        mostrarusuario(false, bfila,bcolumna);
        }
    }
      public void ganar(){
        champ=false;
        
          for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                
                if(vuelta[i][j]>=0){
                  if(!(matrices[i][j].equalsIgnoreCase(Integer.toString(vuelta[i][j])))){
                      champ=true;
                  }
              }  
            }
        }
          
        if(champ==false){
            System.out.println("    FELICIDADES  GANASTE");
            imprimirxxx();//debe estar reiniciar juego 
        }else{
            
        voltear();
        
        }
    }
 
public void intermediom(){
        
        fila=6;
        columna=6;
        min=8;
        matrices = new String [fila][columna];
        vuelta = new int [fila][columna];

        for ( int i = 0; i<fila; i++) { 
             System.out.println();
            for (int j = 0; j<columna; j++) {
               matrices[i][j]= "x";
               System.out.printf("[" + matrices[i][j] + "]");
            }     
        }   
    }
    public void menuI(){
        System.out.println("-----------------------------------");
        System.out.println("NIVEL PRINCIPIANTE");
        intermediom();
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
                    minasale();
                    
                    break;
                case "r": 
                    System.out.println("Desea Reiniciar el Juego presione y o n");
                    String reiniciar = sc.nextLine();
                    if(reiniciar.equals("y")){
                       menuI();
                    }else if(reiniciar.equals("n")){
                       return; 
                    }else{
                        
                        System.out.println("opcion invalida");
                        return;
                    }
        
                    break;
                    
                case "s":  
                     return;
                case "solucion":  
                     imprimirxXX(); 
                     System.out.println("Esta es la solucion");
                default:
                   System.out.println("Elije una opcion v,r,s"); 
                             
            }
        }
     public void imprimirxXX(){
        fila =6;
        columna=6;
        minas = 8;
        matrices = new String [fila][columna];
        vuelta = new int [fila][columna];

        for ( int i = 0; i<fila; i++) {            
            for (int j = 0; j<columna; j++) {
               matrices[i][j]= "0";
            }     
        }
        for ( int i = 0; i<fila; i++) {
            //System.out.println();
            for (int j = 0; j<columna; j++) {
               //vuelta[i][j]= 'x';
               //System.out.printf("[ x ]",vuelta[i][j]);
            }     
        }
        
        System.out.println("");
        
        min= 0;
        
        do{
            random = new Random();
            FFila= random.nextInt(fila);
            CColumna= random.nextInt(columna);
            if(" * ".equals(matrices[FFila][CColumna]) ){
            } else {    
                matrices[FFila][CColumna] = "*";
                min ++;
            }
           
        }while(min < minas);
        
  
        for(int i = 1; i <= fila; i++){
            if (i < 10){
                System.out.print(i + " ");
            }
            for(int j=0; j<columna; j++){
                System.out.print("[" + matrices[i-1][j] + "]");
            }
            System.out.print("\n");
            }
            
    }
    
    public void avanzadom(){
        
        fila=8;
        columna=8;
        min=12;
        matrices = new String [fila][columna];
        vuelta = new int [fila][columna];

        for ( int i = 0; i<fila; i++) { 
             System.out.println();
            for (int j = 0; j<columna; j++) {
               matrices[i][j]= "x";
               System.out.printf("[" + matrices[i][j] + "]");
            }     
        }   
    }
    
    public void imprimirXXX(){
        fila =8;
        columna=8;
        minas = 12;
        matrices = new String [fila][columna];
        vuelta = new int [fila][columna];

        for ( int i = 0; i<fila; i++) {            
            for (int j = 0; j<columna; j++) {
               matrices[i][j]= "0";
            }     
        }
        for ( int i = 0; i<fila; i++) {
            //System.out.println();
            for (int j = 0; j<columna; j++) {
               //vuelta[i][j]= 'x';
               //System.out.printf("[ x ]",vuelta[i][j]);
            }     
        }
        
        System.out.println("");
        
        min= 0;
        
        do{
            random = new Random();
            FFila= random.nextInt(fila);
            CColumna= random.nextInt(columna);
            if(" * ".equals(matrices[FFila][CColumna]) ){
            } else {    
                matrices[FFila][CColumna] = "*";
                min ++;
            }
           
        }while(min < minas);
        
  
        for(int i = 1; i <= fila; i++){
            if (i < 10){
                System.out.print(i + " ");
            }
            for(int j=0; j<columna; j++){
                System.out.print("[" + matrices[i-1][j] + "]");
            }
            System.out.print("\n");
            }
    }

    
    
    public void menuA(){
        System.out.println("-----------------------------------");
        System.out.println("NIVEL PRINCIPIANTE");
        avanzadom();
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
                    minasale();
                    
                    break;
                case "r": 
                    System.out.println("Desea Reiniciar el Juego presione y o n");
                    String reiniciar = sc.nextLine();
                    if(reiniciar.equals("y")){
                       menuA();
                    }else if(reiniciar.equals("n")){
                       return; 
                    }else{
                        
                        System.out.println("opcion invalida");
                        return;
                    }
        
                    break;
                    
                case "s":  
                     return;
                case "solucion":  
                     imprimirXXX(); 
                     System.out.println("Esta es la solucion");
                default:
                   System.out.println("Elije una opcion v,r,s"); 
                             
            }
        }







}

