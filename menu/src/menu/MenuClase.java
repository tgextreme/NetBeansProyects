/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author usuario
 */
public class MenuClase {
    
    public MenuClase(){
        opciones();
    }
    Integer opcion=0;
 public void setMenu (int open){
     opcion=open;
     switch(opcion){
         case 1:
             System.out.println("Es 1");
         break;
         case 2:
             System.out.println("Es dos");
         break;
         default:
             System.out.println("No es ni uno "
                     + "ni dos");
         
     }
 }
 public void opciones (){
     System.out.println("opcion 1");
     System.out.println("opcion 2");
     System.out.println("opcion 3");
     System.out.println("opcion 4");
 }
    
    
}
