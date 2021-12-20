/*Titulo: Leer números no negativos, hasta completar 10.
*
* Enunciado: Puntos: 1
 * Haz un programa para leer números enteros no negativos, 
 * (descartando los negativos, pero contando cuántos se 
 * han leído, hasta que se introduzcan 10 positivos, e 
 * indicar cuántos se han leído, y de ellos cuántos eran
 * negativos, cuántos eran ceros y cuántos acaban en 2.
 * */
package Tarea3PROG;
import java.util.Scanner;
public class ForLeerNoNegativos {

/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/
    public static void main(String[] args) {
        
        //Creo un array
        int[] numero;
        numero=new int[10];
        
        
        //Declaracion de array
        //creo otro array
        int [] division;
        division = new int[10];
        
        int contadorDeDivision=0;
        
        int contador=0; //para crear el array
                        //donde empezará el array
        int contador2=1;//para sber
                        //cuantos numeros lleva
                        //marcados
        int restoDeDivision=0;
        int multiplo=2;
        float moduloDos;
        int cuantosCeros=0;//Saber cuantos numeros eran cero
        Scanner medio =new Scanner(System.in);
                                                 //durante esta parte empezará a preguntar los diferentes números,
                                                 //si son negativos o no
        
        int NumeroNegativo=0;
        
            for(int a=1;a<=10;a++){

                System.out.println("Introduzca "
                        + "el numero positivo :"
                        + "(" +contador2 +")");
                a--;
                numero[contador]=medio.nextInt();//A aqui el cliente pone
                                                //El primer numero (y los siguientes)


                    if (numero[contador]>0){    //Comprobar si es multiplo de dos    
                        moduloDos=numero[contador]%multiplo;

                            if(numero[contador]<1000){
                                        if(numero[contador]<1000&numero[contador]>100){
                                            System.out.println("aqui llero");
                                       restoDeDivision= numero[contador]%10;
                                            System.out.println(restoDeDivision);
                                            if (restoDeDivision==2){
                                                contadorDeDivision++;

                                       }
                                       }
                                       if(numero[contador]<100){
                                       restoDeDivision= numero[contador]%10;
                                            if (restoDeDivision==2){
                                                contadorDeDivision++;
                                       }
                                       }

                                       }



                    contador++;
                    contador2++;

                            //Para contar si el numero es negativo
                    }else if (numero[contador]<0){
                        System.out.println("Debes"
                                + " poner un numero "
                                + "positivo");
                        NumeroNegativo++;
                            //para contar si el numero es igual a cero
                    } else if (numero[contador]==0){
                        cuantosCeros++;
                        contador++;
                        contador2++;
                    }
                    //Cuando termine el array (que acaba con contador=10)
                    //
                        
                    
                    //cuando el array llega a los 10 terminos
                    //aparece esta linea de codigo

                    if(contador==10)
                    {
                        System.out.println("Se terminó el programa");
                        System.out.println("Hay " +cuantosCeros + " Ceros");
                        System.out.print("Se han introducido: " +NumeroNegativo
                                + " Numeros negativos");
                        System.out.print("\nSe han introducido: ");
                        for (int i=0;i<=9;i++){
                            System.out.print(" " +numero[i]);
                        }
                        System.out.println("\nLa cantidad de numeros acabados"
                                + " en dos es " +contadorDeDivision);
                        break;
                    }
            }
            
            }
    }




