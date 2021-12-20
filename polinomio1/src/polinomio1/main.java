
package polinomio1;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int equis5;
        int equis4;
        int equis3;
        int equis2;
        int equis;
        int dos=2;
        int tres=3;
        int cuatro = 4;
        int cinco=5;
        int resultado;
        System.out.println("Introduzca la variable (numero entero): ");
        Scanner EquisReal = new  Scanner(System.in);
        equis=EquisReal.nextInt();
        equis2=(int) Math.pow(equis,dos);
        equis3=(int) Math.pow(equis,tres);
        equis4=(int) Math.pow(equis, cuatro);
        equis5=(int) Math.pow(equis, cinco);
        resultado=(equis5)+(7*equis4)-(4*equis3)+(2*equis2)-(equis)+(10);
        System.out.println("El resultado de la operación es " +resultado );
        
    }
}
