/*
 * Hacer un programa que calcule si un número introducido
 * por teclado es primo o no. Para ello debe tenerse en cuenta que:
*
En matemáticas, un número primo es un número natural mayor que 1 que
* tiene únicamente dos divisores distintos: él mismo y el 1
*
La cuestión acerca de si el número 1 debe o no considerarseprimo está basada
* en la convención. Ambas posturas tienen sus ventajas y sus inconvenientes.
* De hecho, hasta el siglo XIX, los matemáticos en su mayoría lo consideraban
* primo.Actualmente, la comunidad matemática se inclina por no considerar al
* 1 en la lista de los números primos.
*
El método para decidir sobre la primalidad del número consistirá en principio
* en ir probando si es divisible por cada número natural mayor que 2 y menor
* que él mismo. Si se encuentra un divisor, no es primo. Si llegamos probando 
* hasta el propio número sin encontrar un divisor, es que sí es primo
*
El método anterior puede mejorar sensiblemente su eficiencia si se tiene en
* cuenta que si un número no es divisible por2, no será tampoco divisible por
* ningún múltiplo de 2, por lo que las pruebas podremos ir efectuándolas 
* “de dos en dos” (probando con 2,3, 5, 7, 9, …). Otra mejora en la eficiencia
* consiste en saber que ningún divisor de un número puede ser mayor que la raiz
* cuadrada de ese número, por lo que no habrá que llegar probando divisores más 
* que hasta Raíz cuadrada de N, siendo n el número para el que queremos 
* determinar su primalidad.
* 
* 
* No he puesto comentarios porque yo creo que con las etiquetas
* que he puesto el código es bastante intuitivo
 */
package Tarea3PROG;
import java.util.Scanner;

public class While4primos {
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
        int numero1=0;//numero que en cuestion pone el cliente
        Scanner multiplo=new Scanner(System.in);
        while (numero1==numero1){
            System.out.println("Ponga a comprobar si es primo: ");
            numero1=multiplo.nextInt();
            int multiplicador=2;//numero que empieza a multiplicar
            int resto=1;
            int cifraAnterior=numero1-1;
            int division;

                while(numero1>multiplicador & resto!=0){
                    resto=numero1%multiplicador;
                    division=numero1/multiplicador;
                    if(resto==0 & numero1!=multiplicador){
                        System.out.println("El numero no es primo (es multiplo de " 
                                +division +")");
                        break;
                    } else if (multiplicador==cifraAnterior){
                        System.out.println("El numero es primo");
                        break;
                }
                    multiplicador++;
                }
        /*System.out.println(resto);
        System.out.println(division);*/
        }
    
   
       
}
}