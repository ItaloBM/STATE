package padroescomportamentais.state;

public class Partida {
    private EstadoPartida estado;
    private int gols;

    public Partida() {
        this.gols = 0;
        this.estado = new PartidaAgendada(); // Nasce sempre como agendada
    }

    // Método vital do padrão State: permite alterar o comportamento em tempo de execução
    public void setEstado(EstadoPartida estado) {
        this.estado = estado;
    }

    public EstadoPartida getEstado() {
        return estado;
    }

    public void registrarGol() {
        this.gols++;
    }

    public int getGols() {
        return this.gols;
    }

    // Delegação: A partida repassa a responsabilidade da ação para o seu estado atual
    public String iniciar() {
        return estado.iniciar(this);
    }

    public String marcarGol() {
        return estado.marcarGol(this);
    }

    public String encerrar() {
        return estado.encerrar(this);
    }
}