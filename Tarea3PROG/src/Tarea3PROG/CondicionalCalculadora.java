/*
 * Titulo: Calculadora con menú para operaciones básicas.
*
*Enunciado: Puntos: 2
 * Haz una aplicación que muestre un pequeño menú en el que 
 * ofrezca la posibilidad de realizar cinco operaciones 
 * básicas, solicitando los operandos a y b para la 
 * operación elegida:
*
*[1] Suma: a+b
*
*[2] Resta: a-b
*
*[3] Multiplicación: a*b
*
*[4] División: a/b
*
*[5] Resto-módulo: a%b
*
*[6] Potencia: ab
*
*[0] Terminar y salir.
* 
* No he puesto comentarios porque yo creo que con las etiquetas
* que he puesto el código es bastante intuitivo
 */
package Tarea3PROG;
import java.util.Scanner;

public class CondicionalCalculadora {
/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
 
    public static void main(String[] args) {
        int elevacion;
        int a;
        int b;
        int x=11;
        int operacion;
        Scanner a1=new Scanner(System.in);
        Scanner b1=new Scanner(System.in);
        Scanner x1 =new Scanner(System.in);
        while (x!=0){
            System.out.println("Ponga variable a:");
            a=a1.nextInt();
            System.out.println("Ponga variable b:");
            b=b1.nextInt();
                    

            System.out.println("[1] Suma: a+b "
                    + "\n[2] Resta: a-b "
                    + "\n[3]Resta b-a "
                    + "\n[4] Multiplicación: a*b "
                    + "\n[5] División: a/b "
                    + "\n[6] División: b/a "
                    + "\n[7] Resto-módulo: a%b "
                    + "\n[8] Resto-módulo: b%a "
                    + "\n[9] Potencia: a^b "
                    +"\n[10] Potencia: b^a "
                    + "\n[0] Terminar y salir."
                    + "\n[11] Reiniciar programa ");
            System.out.println("Elija la opción: ");        
            x=x1.nextInt();
            if (x==1){
                operacion=a+b;
                System.out.println(operacion);
                
            } else if (x==2){
                operacion=a-b;
                System.out.println("El resultado es " +operacion);
            } else if (x==3){
                operacion=b-a;
                System.out.println("El resultado es " +operacion);
            }else if (x==4){
                operacion=b*a;
                System.out.println("El resultado es " +operacion);
            }else if (x==5){
                operacion=a/b;
                System.out.println("El resultado es " +operacion);
            }else if (x==6){
                operacion=b/a;
                System.out.println("El resultado es " +operacion);
            }else if (x==7){
                operacion=a%b;
                System.out.println("El resultado es " +operacion);
            }else if (x==8){
                operacion=b%a;
                System.out.println("El resultado es " +operacion);
            }else if (x==9){
                elevacion=(int) Math.pow(a, b);
                operacion=elevacion;
                System.out.println("El resultado es " +operacion);
            }else if (x==10){
                elevacion=(int) Math.pow(b, a);
                operacion=elevacion;
                System.out.println("El resultado es " +operacion);
            }
            
        }
        
        
        
        
    }
}
