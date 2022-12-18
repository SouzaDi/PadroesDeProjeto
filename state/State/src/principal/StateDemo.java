package principal;

import state.Contexto;
import state.EstadoInicial;
import state.EstadoPausado;

public class StateDemo {

    public static void main(String[] args){
        Contexto context = new Contexto();
        EstadoInicial estadoInicial = new EstadoInicial();
        estadoInicial.fazerAcao(context);

        EstadoPausado estadoPausado = new EstadoPausado();
        estadoInicial.fazerAcao(context);

    }
}
