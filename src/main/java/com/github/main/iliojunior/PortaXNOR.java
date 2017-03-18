package com.github.main.iliojunior;

public class PortaXNOR extends PortaNOR {
    public PortaXNOR() {
        super();
    }

    public PortaXNOR(int quantidadePortas) {
        super(quantidadePortas);
    }

    @Override
    public boolean saida() {
        int quantidadeLigada = 0;

        for (boolean porta :
                getPortas()) {
            if (porta)
                quantidadeLigada++;
        }

        return (quantidadeLigada == 0 || quantidadeLigada == getPortas().size());
    }
}
