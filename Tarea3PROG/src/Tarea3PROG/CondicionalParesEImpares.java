/*
 * Titulo: Leer números y cálculos con pares/impares.
*
*Enunciado: Puntos: 1
*Titulo: Leer números y cálculos con pares/impares.
*
*Enunciado: Puntos: 1
*Haz un programa que lea 100 números positivos 
* de teclado y al finalizar la lectura indique:
*
*Cuántos números pares se han introducido.
*
*Cuántos números impares se han introducido.
*
*Cuántos suman los pares.
*
*Cuánto suman los impares.
*
*Cuánto suman en total.
*
*La media de los pares, la media de los impares,
* y la media total.
 */
package Tarea3PROG;

import java.util.Scanner;


public class CondicionalParesEImpares {

 /**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
    public static void main(String[] args) {
        Scanner numero1=new Scanner(System.in);
        int numeros=1;
        int modulo;
        
        int contablePar=0;
        int totalPar=0;
        
        int contableImpar=0;
        int totalImpar=0;
        int numeroIntroducido;
        int totalPeI;
        while(numeros<=100){
            System.out.println("Ponme a acá el numero(" +numeros
                    +")");
            numeroIntroducido=numero1.nextInt();
            modulo=numeroIntroducido%2;
            //para comprobar si un numero es par
                if (modulo==0){
                    contablePar++;
                    totalPar=totalPar+numeroIntroducido;
                }else if(modulo==1){
                    contableImpar++;
                    totalImpar=totalImpar+numeroIntroducido;
                }
            /*para intoducir el texto final, el que dice
             * cuantos numeros pares impares,etc
             */
            if (numeros==100){
                totalPeI=totalPar+totalImpar;
                System.out.println("El número de números pares "
                        + "introducido es " +contablePar);
                System.out.println("Sumando todos los numeros pares "
                        + "hacen un total de " +totalPar);
                
                
                System.out.println("El número de números impares "
                        + "introducido es " +contableImpar);
                System.out.println("Sumando todos los numeros impares "
                        + "hacen un total de " +totalImpar);
                
                System.out.println("Sumando todos los numeros "
                        + "hacen un total de " +totalPeI);
            }
            numeros++;
        }
        
    }
}
