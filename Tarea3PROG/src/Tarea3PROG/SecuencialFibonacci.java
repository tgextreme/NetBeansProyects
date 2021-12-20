/*
 * Titulo: Término n-ésimo para Fibonacci con fórmula.
*
*Enunciado: Puntos: 2
* Titulo: Término n-ésimo para Fibonacci con 
* fórmula.
*
*Enunciado: Puntos: 2
*Hacer un programa que calcule el término 
* n-ésimo de la sucesión de Fibonacci, que se
* define como sigue.
*
*La sucesión comienza con los números 0 y 1, y
* a partir de éstos, cada término es la suma 
* de los dos anteriores.
*
*El cálculo podría hacersepor medio de iteracion
* es
* sucesivas, pero en este caso pedimos hacer el 
* cálculo usando la fórmula que te obtiene el va
* lor para el término n-ésimo directamente:
 *
 * No he puesto comentarios porque las variables
 * en este programa resultan obvio el qué hace
 *
 */
package Tarea3PROG;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SecuencialFibonacci {
/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/

    public static void main(String[] args) {
        int UNO=1;
        int DOS=2;
        int CINCO=5;
        int numeroCliente=0;
        Scanner metodo=new Scanner(System.in);
        while(numeroCliente==numeroCliente){
            System.out.println("Ponga el número n-ésimo");
            numeroCliente =metodo.nextInt();
            float raizCinco=(float) Math.sqrt(CINCO);

            float unoDividoRaizCinco=1/raizCinco;

            float operacionParentesis1=(1+raizCinco)/2;
            float potenciaOperacionParentesis1=
             (float) Math.pow(operacionParentesis1, numeroCliente);
            float primerTermino1=
            unoDividoRaizCinco*potenciaOperacionParentesis1;


            float operacionParentesis2=(1-raizCinco)/2;
            float potenciaOperacionParentesis2=
             (float) Math.pow(operacionParentesis2, numeroCliente);
            float primerTermino2=
            unoDividoRaizCinco*potenciaOperacionParentesis2;

            float resultado=(primerTermino1)-(primerTermino2);
            //resultado=Math.round(resultado);
            DecimalFormat df = new DecimalFormat("0");
            System.out.println("El resultado es " 
                    +df.format(resultado));
        }
        
    }
}
