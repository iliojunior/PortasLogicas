package com.github.main.iliojunior;

public class PortaNAND extends PortaAND {
    public PortaNAND() {
        super();
    }

    public PortaNAND(int quantidadePortas) {
        super(quantidadePortas);
    }

    @Override
    public boolean saida() {
        return !super.saida();
    }
}
