/*
 * Titulo: Mostrar números de 7 en 7, con 
 * cálculos.
*
* Enunciado: Puntos: 1
* Haz un programa para mostrar los números 
* del 1 al 500, saltando de 7 en 7, e indi
* car cuántos acaban en 5, y cuánto suman 
* éstos últimos.

 */
package Tarea3PROG;


public class ForNumeros7En7 {
/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/

    public static void main(String[] args) {
        int inicio;
        int acabar=1;
        int saltarDe=7;
        int moduloCinco;
        int calculo1;
        int contadorNumerosTerminadosCinco=0;
        int sumaTodosNumCinco=0;
        for(inicio=500;inicio>=acabar;inicio=inicio-saltarDe){
            System.out.println(inicio);
            moduloCinco=inicio%10;
            calculo1=inicio-acabar;
            //Para calcular cuantos numeros
            //terminan en cinco
            if (moduloCinco==5){
                contadorNumerosTerminadosCinco++;
                sumaTodosNumCinco=sumaTodosNumCinco+inicio; //a aqui ponen cuan
                                                            //to suman todos los
                                                            // numeros acabados 
                                                            //en cinco
                
            } if(calculo1<saltarDe+acabar){
                System.out.println("La"
                        + " cantidad de"
                        + " numeros acabad"
                        + "os en cinco es"
                        + " " 
                        +contadorNumerosTerminadosCinco);
                System.out.println("La suma de todos"
                        + " los numeros acabados "
                        + "en cinco es " 
                        +sumaTodosNumCinco);
            }
        }
    }
}
