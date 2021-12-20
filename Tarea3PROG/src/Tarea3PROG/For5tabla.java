/*
 * Titulo: Tabla de multiplicar completa. 
*
*Enunciado: Puntos: 1
 * Mostrar la tabla de multiplicar de los números del 1 al 10.*/
package Tarea3PROG;


public class For5tabla {

/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
    public static void main(String[] args) {
        
        
        int z=0;//Este es el numero que va a dar "título a la tabla de mutiplicar
                //(por ejemplo "tabla del 8")
        int y=0;//Este va a ser el segundo numero, por que que se opere
        int x=0; //esta a a ser la variable resultado de multiplicar
                 //la z por y
        for(z=0;z<=10;z++){
            for(y=0;y<=10;y++){
                x=z*y;
                System.out.println(z+" por " +y +" = " +x);   
            }
            System.out.println("\n");
        }
    }
}
