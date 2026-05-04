package sempadrao.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartidaFutebolTest {

    @Test
    void deveBloquearGolAntesDoInicio() {
        PartidaFutebol partida = new PartidaFutebol(); // Nasce como "Agendada"

        // Tentar marcar gol antes de iniciar esbarra no IF
        assertEquals("Não é possível marcar gol antes do jogo começar.", partida.marcarGol());

        partida.iniciar();
        assertEquals("Gooooool! Placar: 1", partida.marcarGol()); // Agora funciona
    }
}