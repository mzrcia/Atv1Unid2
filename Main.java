package Atv1Unid2;

public class Main {
    public static void main(String[] args) {
        Teclado t = new Teclado();
        PlugUSB plugUSB = new PlugUSB();
        PlugPS2 plugPS2 = new PlugPS2();
        Adaptador adaptador = new Adaptador();
        System.out.println(adaptador.conecta(plugUSB));
    }
}
