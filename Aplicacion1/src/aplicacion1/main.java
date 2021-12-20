
package aplicacion1;
import java.util.Scanner;

public class main {

    

    public static void main(String[] args) {
        Scanner medida = new Scanner(System.in);
        System.out.println("Ponga el valor de la base:");
        float Base1 = medida.nextFloat();
        System.out.println("Ponga el valorde la Altura: ");
        float Altura2 =medida.nextFloat();
        float Area ;
        Area= (Base1*Altura2);
        System.out.print("El área de el rectangulo es "+Area +" m²");
        
    
    }
}
