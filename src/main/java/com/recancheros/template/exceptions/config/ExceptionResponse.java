package com.recancheros.template.exceptions.config;

public enum ExceptionResponse {
    EXCEPTION_MESSAGE("Exception message");
    private final String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
