package buscaminas_201602478;
import java.util.Scanner;


/**
 *
 * @author Eduardo
 */
public class Menu_201602478 {
    boolean salir = false;
    
        public void menuprincipal(){
        int opcion;
        String op;
        Matriz_201602478 print = new Matriz_201602478();
        Scanner in = new Scanner(System.in);
        
        //menu de niveles de juego
        do{
        //System.out.println("");    
        System.out.println("...................................................");
        System.out.println("                  ¡BUSCAMINAS!");
        System.out.println("                1.Principiante");
        System.out.println("                2.Intermedio");
        System.out.println("                3.Experto");
        System.out.println("                4.Salir");
        System.out.println("...................................................");
        //System.out.println("");
        System.out.println("Ingrese opcion");
        opcion = in.nextInt();
        
        switch(opcion){

                case 1:  
                    
                    print.menuP();

                    break;
                case 2:  
                   print.menuI();
                    break;
                case 3:  
                    print.menuA();
                    break;    
                
                 case 4:
                     salir = true;
                     System.out.println("salio del Programa");
                     break;
                  
                default:
                   System.out.println("Elije una opcion de 1 al 4");              
            }
        }while(opcion!=4);
        
    
    }
    
    
}
