
package arirmeticas1;


public class operations {
    int dato0=0,dato1=0,resultado=0;
    
    public operations(){
        
    }
    public void setSuma(int datito, int datito0){
        dato0=datito;
        dato1=datito0;
        this.resultado=dato0+dato1;
    }
    public void setResta(int datito, int datito0){
        dato0=datito;
        dato1=datito0;
        this.resultado=dato0-dato1;
     
    }
    public void setDivision(int datito, int datito0){
        dato0=datito;
        dato1=datito0;
        this.resultado=dato0/dato1;
    }
    public void setMultiplicacion(int datito, int datito0){
        dato0=datito;
        dato1=datito0;
        this.resultado=dato0*dato1;
    }
    public void setModulo(int datito, int datito0){
        dato0=datito;
        dato1=datito0;
        this.resultado=dato0%dato1;
    }
    public void ImprimirResultados(){
        System.out.println("El resultado de la operacion es igual a " +resultado);
    }
}
