/*
 * Titulo: Soluciones de ecuación de segundo grado.
*
*Enunciado: Puntos: 2
 * Haz un programa que calcule las soluciones reales
 * de una ecuación de segundo grado (de la forma 
 * ax2+bx+c=0) dados sus coeficientes (a, b y c),
 * usando la fórmula:
 * Y diferenciando en la salida las siguientes posibilidades:

Si el discriminante es positivo (b2-4ac>0), tiene dos soluciones
* reales, que se calcularán y mostrarán.

Si el discriminante es cero (b2-4ac=0), tiene una sola solución 
* real, que vale por dos, que se calculará y mostrará.

Si el discriminante es negativo (b2-4ac<0), no tiene solución 
* real, sino en los números complejos. Se indicará esta 
* circunstancia con un mensaje de salida.
 * */
package Tarea3PROG;
import java.util.Scanner;
public class CondicionalEcuacion2grado {

/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
    public static void main(String[] args) {
        //Suponemos que el cliente nos va a dar números que pueden ser tanto
        // enteros como con coma
    float a;
    float b;
    float c;
    float bCuadrado;
    float dos=2;
    float discriminante;
    float operacion;
    float operacion2;
    //Se pone las variables a escanear
    Scanner a1=new Scanner(System.in); 
    Scanner b1=new Scanner(System.in);
    Scanner c1=new Scanner(System.in);
    
    
    //Se pone el mensaje con las variables y el cliente
    //pone las variables
        System.out.println("Ponga la variable a:");
        a=a1.nextFloat();//se pone variable a
        System.out.println("Ponga la variable b:");
        b=b1.nextFloat();//se pone variable b
        System.out.println("Ponga la variable c:");
        c=c1.nextFloat();//se pone variable c
   //Se calcula el discriminante (la operación "encerrada"
        //en la raíz cuadrada)
    bCuadrado=(int) Math.pow(b, dos);
    discriminante =bCuadrado+(-4*a*c);

    //A partir del discriminante se sabe
    // cuantas soluciones va a tener la ecuación
    if (discriminante==0){
            //En caso de ser igual a cero
        discriminante=(int) Math.sqrt(discriminante);
        operacion=(((-1*b)+(discriminante))/(2*a));
        System.out.println("Tiene una única "
                + "Solución "+operacion);
        
    } else if (discriminante<0){        
        //En caso de ser menor a cero
        System.out.println("No tiene solución");
    }else if(discriminante>0){
        //En el caso del discriminante sea mayor a cero
        discriminante=(int) Math.sqrt(discriminante);
        operacion=(((-1*b)+(discriminante))/(2*a));
        operacion2=(((-1*b)-(discriminante))/(2*a));
        System.out.println("Tiene Dos soluciones;"
                + " la primera es " +operacion +" y"
                + " la segunda es " +operacion2);
        
    }
    
    }
}
