package padroescomportamentais.state;

public class PartidaEmAndamento implements EstadoPartida {
    public String iniciar(Partida partida) {
        return "A partida já está rolando.";
    }

    public String marcarGol(Partida partida) {
        partida.registrarGol();
        return "Gooooool!";
    }

    public String encerrar(Partida partida) {
        partida.setEstado(new PartidaEncerrada()); // Transição de estado!
        return "Fim de jogo!";
    }
}