package padroescomportamentais.state;

public interface EstadoPartida {
    String iniciar(Partida partida);
    String marcarGol(Partida partida);
    String encerrar(Partida partida);
}