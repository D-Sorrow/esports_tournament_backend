package com.esports_tournament.app.domain.exception;

public class FieldEmptyException extends RuntimeException {
    public FieldEmptyException(String message) {
        super(message);
    }
}
