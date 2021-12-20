
package mesesanyo;

public class MesesAnyo {

    enum meses{January,February, March,April,May, june, july, agoust,september,october,november,december}

    public static void main(String[] args) {
        meses mes ;
        mes=meses.March;
        System.out.println("El mes elegido es " +mes);
        mes=meses.september;
        System.out.println("El mes elegido esta vez es:" +mes);
    }
}
