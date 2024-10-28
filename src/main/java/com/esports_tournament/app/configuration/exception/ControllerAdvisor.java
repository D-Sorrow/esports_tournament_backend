package com.esports_tournament.app.configuration.exception;

import com.esports_tournament.app.configuration.constants.ConstantsExceptions;
import com.esports_tournament.app.domain.exception.FieldEmptyException;
import com.esports_tournament.app.domain.exception.NumberInvalid;
import com.esports_tournament.app.domain.exception.StartDateException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvisor {

    @ExceptionHandler(FieldEmptyException.class)
    public ResponseEntity<ExceptionResponse> handleFieldEmptyException(FieldEmptyException e) {
        return ResponseEntity.badRequest().body( new ExceptionResponse(
                String.format(ConstantsExceptions.INVALID_FILE_EMPTY, e.getMessage()),
                HttpStatus.BAD_REQUEST.toString(), LocalDateTime.now()
        ));
    }

    @ExceptionHandler(NumberInvalid.class)
    public ResponseEntity<ExceptionResponse> handleNumberInvalid(NumberInvalid e) {
        return ResponseEntity.badRequest().body( new ExceptionResponse(
                String.format(ConstantsExceptions.NUMBER_INVALID, e.getMessage()),
                HttpStatus.BAD_REQUEST.toString(), LocalDateTime.now()
        ));
    }

    @ExceptionHandler(StartDateException.class)
    public ResponseEntity<ExceptionResponse> handleStartDateException(StartDateException e) {
        return ResponseEntity.badRequest().body( new ExceptionResponse(
                String.format(ConstantsExceptions.START_DATE_INVALID, e.getMessage()),
                HttpStatus.BAD_REQUEST.toString(), LocalDateTime.now()
        ));
    }
}
