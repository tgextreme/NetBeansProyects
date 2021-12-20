/*
 *Titulo: Ordenar tres valores leídos de teclado.
*
*Enunciado: Puntos: 1
*Haz un programa que lea tres números enteros por
* teclado, que normalmente se suministrarán desor
* denados, aunque no lo sabemos, y los muestre or
* denados, primero de mayor a menor, y luego de 
* menor a mayor.
* No he puesto comentarios porque yo creo que con las etiquetas
* que he puesto el código es bastantwe intuitivo
 */

package Tarea3PROG;
import java.util.Scanner;

public class SecuencialOrdenar {
/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
    
    public static void main(String[] args) {
        Scanner a1 =new Scanner(System.in);
        Scanner b2 =new Scanner(System.in);
        Scanner c3 =new Scanner(System.in);
        System.out.println("Ponga la variable A:");
        int a=a1.nextInt();
        System.out.println("Ponga la variable B:");
        int b=b2.nextInt();
        System.out.println("Ponga la variable C:");
        int c=c3.nextInt();
                if(a>=b){
                    
                    if (c>=b){
                        System.out.println(c +" " +b+" "+a);   
                        System.out.println("primer bucle");
                    }else if(c<b){
                        System.out.println(a +" " +b+" "+c);
                        System.out.println("Segundo Bucle");
                    }
                } else if (b>a){
                        if (a>=c){
                            System.out.println(b+ " " +a+" "  +c);
                            System.out.println("Tercer Bucle");
                        }else if(a<c){
                            System.out.println(b +" "+c+" "+a);
                            System.out.println("Cuarto Bucle");
                        }                    
                } 
    }
}
