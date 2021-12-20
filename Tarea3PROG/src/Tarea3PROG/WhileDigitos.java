/*Titulo: ¿Cuántos dígitos forman el número?
*
*Enunciado: Puntos: 1
*Haz un programa que lea un número entero y 
* nos diga cuántos dígitos lo forman. El 
* proceso se repetirá hasta que se intro
* duzca un 0, en cuyo caso, nos dirá que 
* el cero tiene 1 dígito, y terminará.
* No he puesto comentarios porque yo creo que con las etiquetas
* que he puesto el código es bastante intuitivo
 * 
 */
package Tarea3PROG;
import java.util.Scanner;
public class WhileDigitos {

/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
    public static void main(String[] args) {
        int numero=0;
        int cifra=0;
        Scanner metodo=new Scanner(System.in);
        while(numero==numero){
            System.out.println("Ponga el numero que quiere"
                    + " que le cuente los dígitos");
            numero=metodo.nextInt();
            while(numero!=0){
                numero=numero/10;
                cifra++;
                    if (numero==0) {
                        System.out.println("El numero "
                                + "de cifras es "
                                + "de " +cifra +" digi"
                                + "tos");

                }

            }
        }
    }
}
