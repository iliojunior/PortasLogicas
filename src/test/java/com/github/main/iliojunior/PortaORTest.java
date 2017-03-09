package com.github.main.iliojunior;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PortaORTest {

    @Test
    public void validateDuasPortas() {

        PortaOR porta = new PortaOR();

        assertFalse(porta.saida());

        porta.ligarEntrada(1);
        assertTrue(porta.saida());

        porta.ligarEntrada(0);
        porta.desligarEntrada(1);
        assertTrue(porta.saida());

        porta.ligarEntrada(0);
        porta.ligarEntrada(1);
        assertTrue(porta.saida());
    }

    @Test
    public void validateTresPortas() {

        final PortaOR porta = new PortaOR(3);

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
        assertTrue(porta.saida());

    }

}