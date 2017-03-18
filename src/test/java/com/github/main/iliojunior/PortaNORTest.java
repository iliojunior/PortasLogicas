package com.github.main.iliojunior;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PortaNORTest {
    @Test
    public void validateDuasPortas() {

        final PortaNOR porta = new PortaNOR();

        assertTrue(porta.saida());

        porta.ligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.desligarEntrada(1);
        assertFalse(porta.saida());

        porta.ligarEntrada(0);
        porta.ligarEntrada(1);
        assertFalse(porta.saida());
    }

    @Test
    public void validateTresPortas() {

        final PortaNOR porta = new PortaNOR(3);

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
        assertFalse(porta.saida());

    }
}
