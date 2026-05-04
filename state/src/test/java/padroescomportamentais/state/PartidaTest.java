package padroescomportamentais.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartidaTest {

    @Test
    void deveTransitarPelosEstadosCorretamente() {
        Partida partida = new Partida(); // Começa Agendada

        // 1. Tentar marcar gol agendada (Falha)
        assertEquals("Não é possível marcar gol antes do jogo começar.", partida.marcarGol());
        assertEquals(0, partida.getGols());

        // 2. Iniciar partida (Muda estado)
        assertEquals("Apita o árbitro! Partida iniciada!", partida.iniciar());
        assertTrue(partida.getEstado() instanceof PartidaEmAndamento);

        // 3. Marcar gol em andamento (Sucesso)
        assertEquals("Gooooool!", partida.marcarGol());
        assertEquals(1, partida.getGols());

        // 4. Encerrar partida (Muda estado)
        assertEquals("Fim de jogo!", partida.encerrar());
        assertTrue(partida.getEstado() instanceof PartidaEncerrada);

        // 5. Tentar marcar gol encerrada (Falha)
        assertEquals("Fim de papo! Não vale mais gol.", partida.marcarGol());
        assertEquals(1, partida.getGols()); // O gol não foi computado
    }
}