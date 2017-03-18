package com.github.main.iliojunior;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PortaXORTest {

    @Test
    public void validateDuasPortas() {

        final PortaXOR porta = new PortaXOR();

        assertFalse(porta.saida());

        porta.ligarEntrada(1);
        assertTrue(porta.saida());

        porta.ligarEntrada(0);
        porta.desligarEntrada(1);
        assertTrue(porta.saida());

        porta.ligarEntrada(0);
        porta.ligarEntrada(1);
        assertFalse(porta.saida());
    }

    @Test
    public void validateTresPortas() {

        final PortaXOR porta = new PortaXOR(3);

        assertFalse(porta.saida());

        porta.ligarEntrada(1);
        assertTrue(porta.saida());

        porta.ligarEntrada(0);
        porta.desligarEntrada(1);
        assertTrue(porta.saida());

        porta.ligarEntrada(2);
        porta.desligarEntrada(0);
        assertTrue(porta.saida());

        porta.ligarEntrada(0);
        porta.ligarEntrada(1);
        porta.ligarEntrada(2);
        assertFalse(porta.saida());

    }

}
