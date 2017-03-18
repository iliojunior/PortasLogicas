package com.github.main.iliojunior;

public class PortaXOR extends PortaMultipla {
    public PortaXOR() {
        super();
    }

    public PortaXOR(int quantidadePortas) {
        super(quantidadePortas);
    }

    public boolean saida() {
        int quantidadeLigadas = 0;
        for (boolean porta :
                getPortas()) {
            if (porta)
                quantidadeLigadas++;
        }

        return quantidadeLigadas == 1;
    }
}
