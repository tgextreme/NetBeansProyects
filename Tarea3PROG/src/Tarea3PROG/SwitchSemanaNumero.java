/*
* Titulo: Convertir número en día
* de la semana. 
*
* Enunciado: Puntos: 1
* Ha un programa que tras  la lec
* tura de un número entre 1 y 7  
* indique el día de la semana al 
* que corresponde.
* 
* No he puesto comentarios porque yo creo que con las etiquetas
* que he puesto el código es bastante intuitivo
 */
package Tarea3PROG;

import java.util.Scanner;


public class SwitchSemanaNumero {

/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
    public static void main(String[] args) {
        Scanner semana1=new Scanner(System.in);
        int semana=0;
        while(semana==semana){
        System.out.println("Pon un día"
                + " de la semana en "
                + "numero");
        semana=semana1.nextInt();
        switch(semana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Pon un "
                        + "dia"
                        + "de la semana "
                        + "válido");
        }
        }
    }
}
