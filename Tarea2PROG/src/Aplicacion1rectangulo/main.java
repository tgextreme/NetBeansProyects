package Aplicacion1rectangulo;
import java.util.Scanner;
import java.text.DecimalFormat; 
public class main {

    

    public static void main(String[] args) {
        //Se declaran las variables
        double area;
        double base1;
        double altura2;
        double perimetro;
        Scanner medida = new Scanner(System.in);
        //Se pide al cliente que ponga los datos
        System.out.println("Ponga el valor de la base (en Metros):");
        base1 = medida.nextDouble();
        System.out.println("Ponga el valorde la Altura (en Metros): ");
        altura2 =medida.nextDouble();
        //Se hacen los cálculos del área
        area= (base1*altura2);
        //Se redondea los datos del área y se imprime en pantalla
        DecimalFormat df = new DecimalFormat("0.00"); 
        System.out.println("El Area o superficie de un rectangulo es " +df.format(area)
                +" Metros cuadrados");
        //Calculamos el perímetro y se pone el resultado en pantalla
        perimetro = ((2*base1)+(2*altura2));
        DecimalFormat dp = new DecimalFormat("0.00");
        System.out.println("El perímetro del rectángulo es " +dp.format(perimetro) +" Metros");

    
    }
}
