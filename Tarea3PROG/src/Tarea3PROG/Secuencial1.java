/*Haz un programa que lea una cantidad de grados centígrados
 * y la pase a grados Fahrenheit, mostrando convenientemente 
 * el resultado con un mensaje en pantalla.
*La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
*Titulo: Conversión ºC a ºF
*
*Enunciado: Puntos: 1
*/

package Tarea3PROG;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Secuencial1 {
    
/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
public static void main(String[] args) {
    //Se declaran las variables ºC y el Fº que es con quienes hay que trabajar
    float farenheint=0;
    float gradosCentigrados;
    //Se declara la variable Scanner
    Scanner medida = new Scanner(System.in);
    //sale un cartel al cliente pidiendo que ponga los ºC
    while (farenheint==farenheint){
        System.out.println("Ponga a acá el grado centigrado: ");

        gradosCentigrados =medida.nextFloat();//El ciente pone los ºC
        farenheint = 32+(9*(gradosCentigrados/5));//Se hace la operación
        DecimalFormat fh = new DecimalFormat("0.00");//Se usa esta variable para
                                                    //redondear resultados a 2 
                                                    //decimales
        System.out.println(fh.format(gradosCentigrados) +"Cº son " +fh.format(farenheint)+"Fº");
    }
}

}