
package aplicacion1triangulo;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class main {

    public static void main(String[] args) {
        float area;
        float altura2;
        float base1;
        float base2;
        float hipotenusa;
        float perimetro;
        float preHipotenusa1;
        float preHipotenusa2;
        float preHipotenusa3;
        float preHipotenusa4;
        
        float dos=2;
        Scanner medida = new Scanner(System.in);
        System.out.println("Ponga el valor de la base(en metros):");
        base1 = medida.nextFloat();
        System.out.println("Ponga el valorde la Altura (en metros): ");
        altura2 =medida.nextFloat();
        area= (base1*altura2)/2;
        DecimalFormat df = new DecimalFormat("0.00"); 
        System.out.println("El área de el rectangulo es "+df.format(area)
                +" Metros cuadrados");
        //Calculamos hipotenusa
        
        //se calcula la base de un lado
        base2=base1/2;
        //se elevan altura y base al cuadrado
        preHipotenusa1=(int) Math.pow(altura2,dos);
        preHipotenusa2=(int) Math.pow(base2,dos);
        //Se suman estos dos valores
        preHipotenusa3=preHipotenusa1+preHipotenusa2;
        //Se hace la raiz cuadrada obteniendose hipotenusa
        preHipotenusa4 = (float) Math.sqrt(preHipotenusa3);
        DecimalFormat df4 = new DecimalFormat("0.00");
        System.out.println("La hipotenusa es " +df4.format(preHipotenusa4)
                +" Metros");
        
        
        //Ahora vamos a calcular el perímetro
        
        perimetro=((2*preHipotenusa4)+base1);
        DecimalFormat dp = new DecimalFormat("0.00");
        System.out.println("El perímetro del triangulo es " +dp.format(perimetro)
                +" Metros");
        
        
    
    }
}
