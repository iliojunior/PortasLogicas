package com.github.main.iliojunior;

import java.util.ArrayList;

public class PortaAND {

    private static final Boolean LIGADA = true;
    private static final Boolean DESLIGADA = false;

    final ArrayList<Boolean> portas = new ArrayList<Boolean>();

    private Boolean existPorta(final int index) {
        try {
            portas.get(index);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean saida() {
        Boolean saida = (portas.size() > 0);

        for (Boolean porta : portas) {
            saida = (saida && porta);
        }

        return saida;
    }

    public void ligarEntrada(int index) {
        if (!existPorta(index))
            createPorta(index);

        portas.set(index, LIGADA);
    }

    private void createPorta(int index) {
        for (int i = portas.size(); i <= index; i++)
            portas.add(i, DESLIGADA);
    }

    public void desligarEntrada(int index) {
        if (!existPorta(index))
            createPorta(index);

        portas.set(index, DESLIGADA);
    }
}