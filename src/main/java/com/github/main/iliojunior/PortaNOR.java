package com.github.main.iliojunior;

public class PortaNOR extends PortaOR {
    public PortaNOR() {
        super();
    }

    public PortaNOR(int quantidadePortas) {
        super(quantidadePortas);
    }

    @Override
    public boolean saida() {
        return !super.saida();
    }
}
