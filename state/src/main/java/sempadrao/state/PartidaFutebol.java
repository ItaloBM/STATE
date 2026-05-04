package sempadrao.state;

public class PartidaFutebol {
    private String estado = "Agendada"; // Pode ser: Agendada, EmAndamento, Encerrada
    private int gols = 0;

    public String iniciar() {
        if (estado.equals("Agendada")) {
            estado = "EmAndamento";
            return "Apita o árbitro! Partida iniciada!";
        } else if (estado.equals("EmAndamento")) {
            return "A partida já está rolando.";
        } else {
            return "A partida já terminou.";
        }
    }

    public String marcarGol() {
        if (estado.equals("EmAndamento")) {
            gols++;
            return "Gooooool! Placar: " + gols;
        } else if (estado.equals("Agendada")) {
            return "Não é possível marcar gol antes do jogo começar.";
        } else {
            return "Fim de papo! Não vale mais gol.";
        }
    }

    public int getGols() {
        return gols;
    }
}