package com.github.main.iliojunior;

public class PortaAND extends PortaMultipla {

    public PortaAND() {
        super();
    }

    public PortaAND(int quantidadePortas) {
        super(quantidadePortas);
    }

    public boolean saida() {
        boolean saida = this.getPortas().size() > 0;

        for (boolean porta : getPortas()) {
            saida = (saida && porta);
        }

        return saida;
    }
}