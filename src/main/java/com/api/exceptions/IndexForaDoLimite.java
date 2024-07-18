package com.api.exceptions;

public class IndexForaDoLimite extends ArrayIndexOutOfBoundsException{
    
    @Override
    public String getMessage() {
        return "Index digitado fora do Limite do Array";
    }
}
