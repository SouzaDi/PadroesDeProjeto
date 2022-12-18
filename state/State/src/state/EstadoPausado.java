package state;

public class EstadoPausado implements EstadoIF{

    @Override
    public void fazerAcao(Contexto context) {
        // TODO Auto-generated method stub
        System.out.println("Filme está Pausado ...");

        context.setEstado(this);
    }
    
}
