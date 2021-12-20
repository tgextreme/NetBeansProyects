
package forarreglo;


public class ClaseFor {
    //arreglo
    Integer[] numeros=new Integer[10];
public void datos(){
    numeros[0]=3;
    numeros[1]=4;
    numeros[2]=7;
    numeros[3]=9;
    numeros[4]=5;
    numeros[5]=8;
    numeros[6]=9;
    numeros[7]=2;
    numeros[8]=4;
    numeros[9]=1;




}
    public void ElFor(){
        for(int i=0; i<=0 ; i++){
            numeros[i]=(int)(Math.random()*100+1);
        }
    }
public void ImprimirArreglo(){
    for (int a=0;a<10;a++){
        System.out.println("numeros["+a+"] ="+numeros[a]);
    }
    
}
}
