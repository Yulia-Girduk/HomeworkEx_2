package org.example.TaskFour;

public class InsufficientFundsException extends Exception{
    private String name;
    private String errorMessage;
    public InsufficientFundsException(String name) {
        this.name = name;
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
