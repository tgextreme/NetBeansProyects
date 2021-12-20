/*Titulo: Cálculo término n-ésimo para Fibonacci
 * , iterativamente.
*(While)
*
* Enunciado: Puntos: 2
* 
*
* Haz un programa que calcule, con una solución i
* terativa (no es válido usar la fórmula explí
* cita de cálculo, ni una solución recursiva)
* el término n-ésimo de la sucesión de Fibona
* cci, que se define como:
*
*La sucesión comienza con los número
* s 0 y 1, y a partir de éstos, cada 
* nuevo término es la suma de los dos
* inmediatamente anteriores.
*
La solución iterativa, 
* significa que para calcular el 
* término n-ésimo, se vayan calculando 
* sucesivamente todos los términos 
* anteriores de la sucesión, de forma
* que una vez que se disponga de los
* términos (n-2)-ésimo y (n-1)-ésimo, se
* sumen para obtener el término n-ésimo.
* 
* 
* No he puesto muchos comentarios porque yo creo que con las etiquetas
* que he puesto el código es bastante intuitivo
* */
 package Tarea3PROG;
import java.util.Scanner;

public class WhileFibonacci {

/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/

    public static void main(String[] args) {
        int contador=0;
        int elevadoA;
        Scanner metodo =new Scanner(System.in);
        while(contador==contador){
            System.out.println("Ponga a acá el "
                    + "término a calcular");
            elevadoA=metodo.nextInt();
            // los nombres de las variables deberian de permutar
            int primerTermino=0;
            int anteriorTermino=1;

            int operacion;
            while(contador<elevadoA){
                operacion=anteriorTermino+primerTermino;
                anteriorTermino=primerTermino;
                primerTermino=operacion;
                contador++;
                if (contador==elevadoA){
                    System.out.println("fibonacci"
                            + " elevado a "
                            +contador +" es igual a"
                            + " " +primerTermino);
                }

            }
                
        }  

            
        }
    
        
        
    }

