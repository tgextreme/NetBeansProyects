/*
 * Titulo: Mostrar números de 3 
 * en 3, contando múltiplos de 2.
*
*Enunciado: Puntos: 1
*Mostrar los números del 500 al 1, 
* saltando de 3 en 3, e indicar cuán
* tos son múltiplos de 2, y cuál es
* la media aritmética de estos últimos.
 */
package Tarea3PROG;


public class ForNumeros3En3 {
/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
    public static void main(String[] args) {
        //int empieza=500;
        int termina =1;
        int saltarDe=3;
        int multiplo=2;
        int modulo;
        int segundoNumero;
        int[] array;
        array =new int [2];
        int calculo1;
        int contadorMultiplo=0;
        int moduloContadorMultiplo;
        int totalArray;
        int mediaAritmetica;
        for(int empieza=500; empieza>=termina;empieza=empieza-saltarDe){
            System.out.println(empieza);
            modulo=empieza%multiplo;
            
            calculo1=empieza-termina;
            //Esto es para saber cuantos multiplos de 2 hay
            if (modulo==0){
                contadorMultiplo++;
                moduloContadorMultiplo=contadorMultiplo%2;
                    //Esto es para calcular la media aritmetica de los dos ultimos numeros
                    if(moduloContadorMultiplo==0){
                        array[0]=empieza;
                        //System.out.println("este es el array 0  "+array[0]);
                    }else if (moduloContadorMultiplo==1){
                        array[1]=empieza;
                        //System.out.println("Este es el array 1 "+array[1]);
                    }
                //Esto es para decirle al programa cuándo debe de mostrar los
                    //mensajes
            } if (calculo1<saltarDe+termina){
               System.out.println("La ca"
                        + "ntidad de numeros"
                        + " multiplos de "
                        + "2 es " +contadorMultiplo);
               System.out.println("");
               //Calculamos la media aritmetica de los dos ultimos numeros
               totalArray=array[0]+array[1];
               mediaAritmetica=totalArray/2;
               System.out.println("La media aritmetica entre"
                       + " los dos últimos numeros multiplos "
                       + "de dos es " +mediaAritmetica );
               
            }
                
        }
    }
}
