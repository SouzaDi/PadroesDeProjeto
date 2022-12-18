package state;

public class EstadoInicial implements EstadoIF {

    @Override
    public void fazerAcao(Contexto context) {
        System.out.println("Filme está no estado incial ...");

        context.setEstado(this);
    }
    
}
