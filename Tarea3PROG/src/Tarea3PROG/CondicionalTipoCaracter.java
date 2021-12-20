/*
 * Titulo: Identificar tipo de carácter leído. 
 * 
* Enunciado: Puntos: 1
* Haz un programa que lea un carácter por te
* clado y nos diga si el carácter leído es
* una letra mayúscula, una letra minúscula,
* un dígito, o ninguno de los anteriores 
* (otro tipo de carácter).
*
*Si se desea, se puede leer un String de una
* letra, o incluso leer un String cualquiera,
* y fijarse  sólo en el primer carácter del 
* mismo.
 
 */
package Tarea3PROG;

import java.util.Scanner;


public class CondicionalTipoCaracter {
/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/

    public static void main(String[] args) {
        Scanner cadena1=new Scanner(System.in);
        String cadena;
        System.out.println("Ponga el número o letra a comprobar");
        cadena=cadena1.next();
        
        char tipo;
        
        tipo=cadena.charAt(0);
        if (Character.isDigit(tipo)){
            System.out.println("Es"
                    + "un dígito");
            //a aqui comprueba si es una letra
        }else if(Character.isLetter(tipo)) {
            System.out.println("No"
                    + " es un digito, es "
                    + "una letra");
            //A aquí si es una letra si es mayúscula o minuscula
                    if (Character.isLowerCase(tipo)){
                        System.out.println("Además es"
                                + " minuscula");
                    } else if (Character.isUpperCase(tipo)){
                        System.out.println("Además es "
                                + "mayúscula");
                    }
            //Esto pasa si da fallo lo anterior
        }else {
            System.out.println("Es otro tipo de carácter");
        }
        
    }
}
