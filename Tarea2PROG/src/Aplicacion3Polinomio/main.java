package Aplicacion3Polinomio;
import java.util.Scanner;

public class main {
// el polinomio sería
//f(x)=x^5+7*x^4-4*x^3+3*x^2-x+10

    public static void main(String[] args) {
//Se declaran las variables
 
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
//Se pide al usuario introducir las variables
        System.out.println("Introduzca la variable (numero entero): ");
        Scanner EquisReal = new  Scanner(System.in);
        equis=EquisReal.nextInt();
//Se hacen las operaciones de exponer
        equis2=(int) Math.pow(equis,dos);
        equis3=(int) Math.pow(equis,tres);
        equis4=(int) Math.pow(equis, cuatro);
        equis5=(int) Math.pow(equis, cinco);

//Se hace la ecuación
        resultado=(equis5)+(7*equis4)-(4*equis3)+(2*equis2)-(equis)+(10);
        System.out.println("El resultado de la operación es " +resultado );
        
    }
}