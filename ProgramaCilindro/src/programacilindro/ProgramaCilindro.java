
package programacilindro;
import java.util.Scanner;

public class ProgramaCilindro {


    public static void main(String[] args) {
        // Se declaran todas las variables
        double diametro;
        double altura;
        double AreaBase;
        double Pi=Math.PI;
        double radio;
        double dos=2;
        double radiocuadrado;
        double volumen; //lo pongo todo con double
                        //para que no dé pegas con
                        //las cuentas
        
        Scanner alturatip = new Scanner(System.in);
        Scanner diametrotip = new Scanner(System.in);
                            //variables de escribir
        System.out.println("Ponga a acá la altura(en m):");
        altura = alturatip.nextDouble();
        System.out.println("Ponga a acá el diametro (en m) :");
        diametro= diametrotip.nextDouble();
        radio=diametro/2;
        
        // Se calcula el area de la base
        AreaBase = 2*Pi*radio*altura;
        System.out.println("El area de la base  "
                + " es " +AreaBase +""
                + "M²");
        
        //Se calcula el volumen
        radiocuadrado=Math.pow(radio, dos);
        volumen=Pi*radiocuadrado*altura;
        System.out.println("El volumen en litros es"
                + " " +volumen +" Litros ");
      
        
    }
}
