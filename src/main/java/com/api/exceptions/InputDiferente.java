package com.api.exceptions;

import java.util.InputMismatchException;

public class InputDiferente extends InputMismatchException {

    @Override
    public String getMessage() {  
        return "Valor digitado diferente dos números pedidos. Tente novamente.";
    }
}
