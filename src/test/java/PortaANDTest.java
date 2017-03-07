import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PortaANDTest {

    @Test
    public void validate() {

        PortaAND porta = new PortaAND();

        assertFalse(porta.saida());

        porta.ligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.desligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.ligarEntrada(1);
        assertTrue(porta.saida());
    }

    @Test
    public void validateTresPortas() {

        final PortaAND porta = new PortaAND();

        assertFalse(porta.saida());

        porta.ligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.desligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.ligarEntrada(1);
        porta.ligarEntrada(2);
        assertTrue(porta.saida());

    }

    @Test
    public void validateQuatroPortas() {

        final PortaAND porta = new PortaAND();

        assertFalse(porta.saida());

        porta.ligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.desligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.ligarEntrada(1);
        porta.ligarEntrada(2);
        porta.desligarEntrada(3);
        assertFalse(porta.saida());

        porta.ligarEntrada(3);
        assertTrue(porta.saida());

    }

}