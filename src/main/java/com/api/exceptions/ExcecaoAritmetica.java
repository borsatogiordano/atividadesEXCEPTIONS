package com.api.exceptions;

public class ExcecaoAritmetica extends ArithmeticException {
@Override
public String getMessage() {
    return "Não é possivel dividir esse dividendo pelo divisor 0";
}
}