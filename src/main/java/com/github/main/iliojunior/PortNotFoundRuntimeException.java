package com.github.main.iliojunior;

public class PortNotFoundRuntimeException extends RuntimeException {

    public PortNotFoundRuntimeException() {
        super("Porta não foi encontrada.");
    }

    public PortNotFoundRuntimeException(int port) {
        super("Porta " + port + " não foi encontrada.");
    }
}
