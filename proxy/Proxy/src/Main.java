package proxy;

public class Main {
    public static void main(String args){
        ListaContato lista = new ProxyListaContato("Ituiutaba-MG");
        lista.imprimirListaCompleta();
        System.out.println("----------");
        lista.mostrar();

    }
}
