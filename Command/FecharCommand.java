package Command;

public class FecharCommand implements Command{
    private Portao portao;

    public FecharCommand(Portao portao){
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.fechar();
    }

    @Override
    public void undo() {
        portao.abrir();
    }
    
}
