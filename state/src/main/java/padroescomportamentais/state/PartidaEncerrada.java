package padroescomportamentais.state;

public class PartidaEncerrada implements EstadoPartida {
    public String iniciar(Partida partida) {
        return "A partida já terminou.";
    }

    public String marcarGol(Partida partida) {
        return "Fim de papo! Não vale mais gol.";
    }

    public String encerrar(Partida partida) {
        return "A partida já está encerrada.";
    }
}