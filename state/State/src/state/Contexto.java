package state;

public class Contexto {
    private EstadoIF estado;

    public Contexto() {
        estado = null;
    }

    public EstadoIF getEstado() {
        return estado;
    }

    public void setEstado(EstadoIF estado) {
        this.estado = estado;
    }
    
}
