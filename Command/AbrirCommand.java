package Command;

public class AbrirCommand implements Command{
    private Portao portao;

    public AbrirCommand(Portao portao){
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.abrir();
        
    }

    @Override
    public void undo() {
        portao.fechar();
        
    }
    
}
