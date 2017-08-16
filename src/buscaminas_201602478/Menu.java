package buscaminas_201602478;
import java.util.Scanner;

        /**
 *
 * @author Eduardo
 */
public class Menu {
    public void menuprincipal(){
        int opcion;
        Scanner in = new Scanner(System.in);
        
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
                    System.out.println("hola");
                    break;
                case 2:  
                    break;
                case 3:  
                    break;    
                
                 case 4:
                     break;
                  
                /*default:
                   System.out.println("Elije una opcion de 1 al 5");     */          
            }
        
    
    }  
    
    
}
