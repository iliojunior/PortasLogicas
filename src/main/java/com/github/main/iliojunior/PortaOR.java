package com.github.main.iliojunior;

public class PortaOR extends PortaMultipla {

    public PortaOR() {
        super();
    }

    public PortaOR(int quantidadePortas) {
        super(quantidadePortas);
    }

    public boolean saida() {
        boolean saida = false;

        for (boolean porta : getPortas())
            saida = (saida || porta);

        return saida;
    }
}
