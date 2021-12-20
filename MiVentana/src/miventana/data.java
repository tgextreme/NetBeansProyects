
package miventana;

import javax.swing.JOptionPane;


public class data {
    public data(){
        
        
    }
    Integer age=0;
    String nombre="";
    public void capturaDatos(){
       nombre=Ventana.Nombre.getText();
       age=Integer.parseInt(Ventana.Edad.getText());
       //captura en age, el valor de el texto
       //y lo convierte en entero
       //TipoDato.parseInt(tipo de dato a 
       //convertir en cadena)
          
       
    }
    public void imprimirDatos(){
        JOptionPane.showMessageDialog(null, "El nombre captu"
                + "rado es "+nombre+" la edad de esta persona "
                + "es " +age +" Años", "Mensaj", JOptionPane.PLAIN_MESSAGE);
        
    }
}
