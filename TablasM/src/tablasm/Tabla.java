package tablasm;


public class Tabla {
    Integer numero=0;
    Integer multiplo=0;
    Integer resultado=0;
    Integer contador=0;

    public Tabla() {
    }
    
    public void setTablaDeMultiplicar(int numer, int result ){
        this.numero=numer;
        System.out.println (numer + "*"+1+"="+(result =numer*1));
        System.out.println (numer + "*"+2+"="+(result =numer*2));
        System.out.println (numer + "*"+3+"="+(result =numer*3));
        System.out.println (numer + "*"+4+"="+(result =numer*4));
        System.out.println (numer + "*"+5+"="+(result =numer*5));
        System.out.println (numer + "*"+6+"="+(result =numer*6));
        System.out.println (numer + "*"+7+"="+(result =numer*7));
        System.out.println (numer + "*"+8+"="+(result =numer*8));
        System.out.println (numer + "*"+9+"="+(result =numer*9));
        System.out.println (numer + "*"+10+"="+(result =numer*10));
    }
    
    public void setTablaCiclo(int number){
        //this.contador=number;
        do{
            System.out.println("El numero es " +contador);
            this.contador++;
        }while(contador>=10);
    }
    
}
