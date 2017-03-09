package com.github.main.iliojunior;

public class PortaNOT extends PortaLogica {

    public PortaNOT() {
        super(1);
    }

    public boolean saida() {
        return !getPortas().get(0);
    }
}
