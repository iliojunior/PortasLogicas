package com.github.main.iliojunior;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PortaNANDTest {
    @Test
    public void validateDuasPortas() {

        PortaNAND porta = new PortaNAND();

        assertTrue(porta.saida());

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

        final PortaNAND porta = new PortaNAND(3);

        assertTrue(porta.saida());

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
