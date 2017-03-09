package com.github.main.iliojunior;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class PortaNOTTest {

    @Test
    public void validate() throws Exception {

        final PortaNOT portaNOT = new PortaNOT();

        assertTrue(portaNOT.saida());

        portaNOT.ligarEntrada(0);
        assertFalse(portaNOT.saida());
    }
}