package teste;

import main.Emissora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmissoraTest {
    @Test
    void deveRetornarDadosDigital() {
        Emissora emissor = new Emissora();
        emissor.setConjuntoDadosGerados("Dados aleatrorios");

        assertEquals("Dados convertidos para o padrão digital: \n" +
                "Dados aleatrorios", emissor.getConjuntoDadosGerados());
    }
}