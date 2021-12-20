/*
 * Haz un programa que calcule la letra del NIF, suministrado el DNI, 
 * o la letra final del NIE, suministrada su letra inicial y los 7 dígitos que le siguen.
 * 
*
*La letra del NIF se obtiene a partir de un algoritmo conocido como módulo 23
* . El algoritmo consiste en aplicar la operación aritmética de módulo 23 
* al número del DNI. El módulo 23 es el número entero obtenido como resto
* de la división entera del número del DNI entre 23. El resultado es un 
* número comprendido entre el 0 y el 22. En base a una tabla conocida 
* se asigna una letra. La combinación del DNI con esa letra es el NIF.
* 
*
Este mismo algoritmo también puede utilizarse para el cálculo del NIE.
* En el caso que el NIE empiece por X, se calcula despreciando la X y 
* utilizando los 7 dígitos, si el NIE empieza por Y, se sustituye la 
* letra Y por el número 1, si el NIE empieza por Z, se sustituye la 
* letra Z por el número 2 y se realiza el mismo cálculo.
 */
package Tarea3PROG;

import java.util.Scanner;

public class Swith3DNI {
/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/

    public static void main(String[] args) {
                                //Se declaran las variables
        int dni=0;
        int operacion;
                                        //Se crean las variables scanner
        Scanner dni1 = new Scanner(System.in);
        while (dni==dni){                                
        System.out.println("Ponga a acá su DNI o NIF: ");
        dni = dni1.nextInt();
                                //se obtiene con la siguiente operación el resto de
                                    //dividir el numero entre 23
        operacion=dni%23;
        
        
              /*Segun el número que haya conseguido en el modulo se 
              * obtiene el resultado y se elige el caso correspondiente*/
            switch(operacion){
                case 0:System.out.println("Su letra"
                        + " es T");
                    break;
                case 1:
                    System.out.println("Su letra es R");
                    break;
                case 2:
                    System.out.println("Su letra es W");
                    break;
                case 3:
                    System.out.println("Su letra es A");
                    break;
                case 4:
                    System.out.println("Su letra es la G");
                    break;
                case 5:
                    System.out.println("Su letra es la M");
                    break;
                case 6:
                    System.out.println("Su letra es la Y");
                    break;
                case 7:
                    System.out.println("Su letra es la F");
                    break;
                case 8:
                    System.out.println("Su letra es la P");
                    break;
                case 9:
                    System.out.println("Su letra es la D");
                    break;
                case 10:
                    System.out.println("Su letra es la X");
                    break;
                case 11:
                    System.out.println("Su letra es la B");
                    break;
                case 12:
                    System.out.println("Su letra es la N");
                    break;
                case 13:
                    System.out.println("Su letra es la J");
                    break;
                case 14:
                    System.out.println("Su letra es la Z");
                    break;
                case 15:
                    System.out.println("Su letra es la S");
                    break;
                case 16:
                    System.out.println("Su letra es la Q");
                    break;
                case 17:
                    System.out.println("Su letra es la V");
                    break;
                case 18:
                    System.out.println("Su letra es la H");
                    break;
                case 19:
                    System.out.println("Su letra es la L");
                    break;
                case 20:
                    System.out.println("Su letra es la C");
                    break;
                case 21:
                    System.out.println("Su letra es la K");
                    break;
                case 22:
                    System.out.println("Su letra es la E");
                    break;
                default:
                    System.out.println("Pon un número válido");
                    break;



                }
        }
        
    }
}
