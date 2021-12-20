/*Titulo: Convertir número en nombre 
 * del mes. 
*
*Enunciado: Puntos: 1
*Haz un programa que tras la lectura 
* de un número entre 1 y 12 indique 
* el mes del año al que corresponde.
 * 
 * No he puesto comentarios porque yo creo que con las etiquetas
* que he puesto el código es bastante intuitivo
 */
package Tarea3PROG;
import java.util.Scanner;

public class SwitchMesNumero {

/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
    public static void main(String[] args) {
        Scanner mes1=new Scanner(System.in);
        int mes=0;
        
        while (mes==mes){
        System.out.println("Pon un "
                + "número del mes: ");
        mes=mes1.nextInt();
        switch(mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
                
        }
        }
    }
}
