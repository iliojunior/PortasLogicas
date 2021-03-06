package com.github.main.iliojunior;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PortaANDTest {

    @Test
    public void validateDuasPortas() {

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

        final PortaAND porta = new PortaAND(3);

        assertFalse(porta.saida());

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