package padroescomportamentais.state;

public class PartidaAgendada implements EstadoPartida {
    public String iniciar(Partida partida) {
        partida.setEstado(new PartidaEmAndamento()); // Transição de estado!
        return "Apita o árbitro! Partida iniciada!";
    }

    public String marcarGol(Partida partida) {
        return "Não é possível marcar gol antes do jogo começar.";
    }

    public String encerrar(Partida partida) {
        return "Não pode encerrar um jogo que não começou.";
    }
}