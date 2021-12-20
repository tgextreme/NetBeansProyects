package Aplicacion2cilindro;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        // Se declaran todas las variables
        double diametro;
        double altura;
        double areaBase;
        double Pi=Math.PI;
        double areaTotal;
        double radio;
        double dos=2;
        double radioCuadrado;
        double volumen; //lo pongo todo con double
                        //para que no dé pegas con
                        //las cuentas
        
        Scanner alturaTip = new Scanner(System.in);
        Scanner diametroTip = new Scanner(System.in);
                            //variables de escribir
        System.out.println("Ponga a acá la altura(en m):");
        altura = alturaTip.nextDouble();
        System.out.println("Ponga a acá el diametro (en m) :");
        diametro= diametroTip.nextDouble();
        radio=diametro/2;
        
        // Se calcula el area de la base
        areaBase = 2*Pi*radio*altura;
        System.out.println("El area de la base  "
                + " es " +areaBase +""
                + " M²");
        //El Area total del cilindro
        areaTotal=2*Pi*radio*(altura+radio);
        System.out.println("El area total es igual a " +areaTotal +" M²");
        //Se calcula el volumen
        radioCuadrado=Math.pow(radio, dos);
        volumen=Pi*radioCuadrado*altura;
        System.out.println("El volumen en litros es"
                + " " +volumen +" Litros ");
        
      
        
    }
}
