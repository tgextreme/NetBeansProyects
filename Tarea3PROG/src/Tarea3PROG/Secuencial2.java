/*Enunciado: Puntos: 1
*Haz un programa que tome como dato 
* de entrada un número que correspo
* nda a la longitud del radio de un
* a esfera y nos calcule y escriba el 
* volumen de la esfera que se corres
* ponden con dicho radio. La fórmula para
* calcular el volumen de la esfera es:*/


package Tarea3PROG;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Secuencial2 {

/**
 * 
 *
 * @author Tomás González Domínguez
* @since 29.11.2013
* @version 1.0
* 
*/

    public static void main(String[] args) {
        //para que no haya problemas de aproximación lo pongo con
        //double
        double volumen;
        double radio;
        double Pi=(float) Math.PI;
        double tres =3;
        double radioCubo;
        //Se hacen las operaciones
        Scanner medida = new Scanner(System.in);
        while(tres==tres){
            System.out.println("Por favor ponga el valor del " //se pone un aviso
                    + "radio para calcular el volumen(cm):");//sobre el valor del radio

            radio=medida.nextDouble();//El cliente pone el nivel del radio
            radioCubo=Math.pow(radio,tres);//Se hace el cubo del radio
            volumen=(4/3)*Pi*radioCubo;// Se realizan las operaciones
            DecimalFormat vol = new DecimalFormat("0.00"); //Para redondear cifras
                                                        //a dos decimales
            System.out.println("El volumen es igual a " +vol.format(volumen)
                    +" centimetros cúbicos");
            //^se imprime resultado en pantalla
        }
    }

}