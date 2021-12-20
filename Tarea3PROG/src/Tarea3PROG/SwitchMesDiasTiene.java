/*
 * Titulo: Dado un número de mes, ¿cuántos
 * días tiene?
*
* Enunciado: Puntos: 1
* Ha un programa que lea una variable ente
* ra mes y compruebe si el valor correspon
* de a un mes de 30 días, o a un mes de 31
* o a un mes de 28 o 29 días.
* No he puesto comentarios porque yo creo que con las etiquetas
* que he puesto el código es bastante intuitivo
 */
package Tarea3PROG;

import java.util.Scanner;


public class SwitchMesDiasTiene {
/**
 * 
 *
 * @author Tomás González Domínguez
*@version 29.11.2013
*/

    public static void main(String[] args) {
        Scanner mes1=new Scanner(System.in);
        int mes=0;
        while(mes==mes){
        System.out.println("Dame el numero de un mes"
                + " para decirte cuantos días tiene:");
        mes=mes1.nextInt();
        switch(mes){
            case 1:
                System.out.println("Tiene 31 días");
                break;
            case 2:
                System.out.println("Tiene 28 días");
                break;
            case 3:
                System.out.println("Tiene 31 días");
                break;
            case 4:
                System.out.println("Tiene 30 días");
                break;
            case 5:
                System.out.println("Tiene 31 días");
                break;
            case 6:
                System.out.println("Tiene 30 días");
                break;
            case 7:
                System.out.println("Tiene 31 días");
                break;
            case 8:
                System.out.println("Tiene 31 días");
                break;
            case 9:
                System.out.println("Tiene 31 días");
                break;
            case 10:
                System.out.println("Tiene 31 días");
                break;
            case 11:
                System.out.println("Tiene 30 días");
                break;
            case 12:
                System.out.println("Tiene 31 días");
                break;
            default:
                System.out.println("Pon un día válido");
                break;
                
        }
        }
    }
}
