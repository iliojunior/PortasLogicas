package com.github.main.iliojunior;

public abstract class PortaMultipla extends PortaLogica {

    private final static int PORTAS_MINIMAS = 2;

    public PortaMultipla() {
        super(2);
    }

    public PortaMultipla(int quantidadePortas) {
        super(quantidadePortas, PORTAS_MINIMAS);
    }
}
