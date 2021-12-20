
package Aplicacion4Polinomio7grado;
import java.util.Scanner;
//El polinomio de 7º grado sería algo así:
//f(x)=a*x^7+b*x^6+c*x^5+d*x^4+e*x^3*f*x^2+g*x^1+h
public class main {

    public static void main(String[] args) {
        //Declaro las variables
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int x;
        int resultado;
        int dos =2;
        int tres=3;
        int cuatro=4;
        int cinco = 5;
        int seis=6;
        int siete=7;
        //Digo al usuario que ponga todas las incognitas
        System.out.println("Ponga a acá el valor de 'a'");
        Scanner a1 = new Scanner(System.in);
        a=a1.nextInt();
        System.out.println("Ponga a acá el valor de 'b'");
        Scanner b1 = new Scanner(System.in);
        b=b1.nextInt();
        System.out.println("Ponga a acá el valor de 'c'");
        Scanner c1 = new Scanner(System.in);
        c=c1.nextInt();
        System.out.println("Ponga a acá el valor de 'd'");
        Scanner d1 = new Scanner(System.in);
        d=d1.nextInt();
        System.out.println("Ponga a acá el valor de 'e'");
        Scanner e1 = new Scanner(System.in);
        e=e1.nextInt();
        System.out.println("Ponga a acá el valor de 'f'");
        Scanner f1 = new Scanner(System.in);
        f=f1.nextInt();
        System.out.println("Ponga a acá el valor de 'g'");
        Scanner g1 = new Scanner(System.in);
        g=g1.nextInt();
        System.out.println("Ponga a acá el valor de 'h'");
        Scanner h1 = new Scanner(System.in);
        h=h1.nextInt();
        System.out.println("Ponga a acá el valor de 'x'");
        Scanner x1 = new Scanner(System.in);
        x=x1.nextInt();
        //Lo elevo todo a su respectiva potencia
        a=a* ((int) Math.pow(x,siete));
        b=b* ((int) Math.pow(x,seis));
        c=c* ((int) Math.pow(x,cinco));
        d=d* ((int) Math.pow(x,cuatro));
        e=e* ((int) Math.pow(x,tres));
        f=f* ((int) Math.pow(x,dos));
        g=g*x;
        h=h;
        //Operamos con las variables e incógnitas dadas antes
        resultado =a+b+c+d+e+f+g+h;
        System.out.println("El resultado de este polinomio es igual"
                + " a " +resultado);

        
    }
}