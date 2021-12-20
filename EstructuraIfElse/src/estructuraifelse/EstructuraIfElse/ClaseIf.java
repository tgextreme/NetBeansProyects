
package estructuraifelse.EstructuraIfElse;

public class ClaseIf {

    
    public ClaseIf(){

    }
    Integer num1=0, num2=5;    
    public void setMayor(int x, int y){
        this.num1=x;
        this.num2=y;
        if (x>y){
            System.out.println("El primero es mayor");
        }else{
            System.out.println("El primero no es mayor");
    }
    }
    public void setMenor(int x, int y){
        this.num1=x;
        this.num2=y;
        if (x<y){
            System.out.println("El primero es menor");
        }else{
            System.out.println("El primero es menor");
    }
    }
        public void setIgual(int x, int y){
        this.num1=x;
        this.num2=y;
        if (x==y){
            System.out.println("El primero es igual");
        }else{
            System.out.println("El primero no es igual");
    }
        }
}

  
