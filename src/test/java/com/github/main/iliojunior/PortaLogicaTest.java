package com.github.main.iliojunior;

import org.junit.Test;

import static com.github.main.iliojunior.PortaLogica.DESLIGADA;
import static com.github.main.iliojunior.PortaLogica.LIGADA;
import static org.junit.Assert.*;

public class PortaLogicaTest {

    final PortaLogica portaLogica = new PortaLogica(2) {
        public boolean saida() {
            return false;
        }
    };

    @Test
    public void testarConstrutorComPoucaPorta() throws Exception {
        try {

            final PortaLogica portaLogica = new PortaLogica(1) {
                public boolean saida() {
                    return false;
                }
            };
            fail("Nao podia chegar aqui");

        } catch (Exception e) {
            assertEquals(e.getMessage(), "É necessário pelo menos 2 portas");
        }
    }

    @Test
    public void ligarEntradaComErro() throws Exception {
        try {
            portaLogica.ligarEntrada(5);
            fail("Nao podia chegar aqui");
        } catch (PortNotFoundRuntimeException e) {
            assertEquals(e.getMessage(), "Porta 5 não foi encontrada.");
        }
    }

    @Test
    public void ligarEntrada() throws Exception {
        portaLogica.ligarEntrada(1);
        assertEquals(portaLogica.getPortas().get(1), LIGADA);
    }

    @Test
    public void desligarEntradaComErro() throws Exception {
        try {
            portaLogica.desligarEntrada(5);
            fail("Nao podia chegar aqui");
        } catch (PortNotFoundRuntimeException e) {
            assertEquals(e.getMessage(), "Porta 5 não foi encontrada.");
        }
    }

    @Test
    public void desligarEntrada() throws Exception {
        portaLogica.desligarEntrada(1);
        assertEquals(portaLogica.getPortas().get(1), DESLIGADA);
    }

}