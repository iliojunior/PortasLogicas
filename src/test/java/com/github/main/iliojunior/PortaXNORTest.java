package com.github.main.iliojunior;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PortaXNORTest {
    @Test
    public void validateDuasPortas() {

        final PortaXNOR porta = new PortaXNOR();

        assertTrue(porta.saida());

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

        final PortaXNOR porta = new PortaXNOR(3);

        assertTrue(porta.saida());

        porta.ligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.desligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(2);
        porta.desligarEntrada(0);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.ligarEntrada(1);
        porta.ligarEntrada(2);
        assertTrue(porta.saida());

    }
}
