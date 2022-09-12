package com.bindord.eureka.resourceserver.advice;

public class NotFoundValidationException extends Exception {

    private String internalCode;

    public NotFoundValidationException(String internalCode) {
        this.internalCode = internalCode;
    }

    public String getInternalCode() {
        return internalCode;
    }
}
