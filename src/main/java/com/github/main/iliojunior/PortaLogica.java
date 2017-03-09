package com.github.main.iliojunior;

import java.util.ArrayList;

public abstract class PortaLogica {

    public final static Boolean LIGADA = true;
    public final static Boolean DESLIGADA = false;

    private ArrayList<Boolean> portas = new ArrayList<Boolean>();

    public PortaLogica(final int quantidadePortas) {
        this(quantidadePortas, 1);
    }

    public PortaLogica(final int quantidadePortas, final int portasMinimo) {

        if (quantidadePortas < portasMinimo)
            throw new RuntimeException("É necessário pelo menos " + portasMinimo + " portas");

        inicializarPortas(quantidadePortas);
    }

    /**
     * Initialize ports
     *
     * @param quantidadePortas
     */
    private void inicializarPortas(final int quantidadePortas) {
        for (int i = 0; i < quantidadePortas; i++)
            portas.add(DESLIGADA);
    }

    /**
     * Verify if exists port index
     *
     * @param indexPorta - Port index for validate
     * @return Return true if port exists
     */
    private Boolean existPorta(final int indexPorta) {
        try {
            portas.get(indexPorta);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Validade if exists port index
     * Throws PortNotFoundRuntimeException if port is invalid
     *
     * @param entrada - Port index for validate
     * @return Return true if port is valid
     */
    private void validarEntrada(int entrada) {
        if (!existPorta(entrada))
            throw new PortNotFoundRuntimeException(entrada);
    }

    /**
     * Getter port attribute
     *
     * @return Returns ports array
     */
    public ArrayList<Boolean> getPortas() {
        return portas;
    }

    /**
     * Liga a porta desejada.
     * Set status of the port as true.
     *
     * @param entrada - Index of port to set as true.
     */
    public void ligarEntrada(int entrada) {
        validarEntrada(entrada);
        portas.set(entrada, LIGADA);
    }

    /**
     * Desliga a porta desejada.
     * Set status of the port as false.
     *
     * @param entrada - Index of port to set as false.
     */
    public void desligarEntrada(int entrada) {
        validarEntrada(entrada);
        portas.set(entrada, DESLIGADA);
    }

    /**
     * @return Return the state of logical port.
     */
    public abstract boolean saida();
}
