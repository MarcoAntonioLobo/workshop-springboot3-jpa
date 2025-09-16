package com.example.CourseJava.resources.exceptions;

import java.time.Instant;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.CourseJava.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> handleResourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        return buildResponse(HttpStatus.NOT_FOUND, e, request);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<StandardError> handleEmptyResult(EmptyResultDataAccessException e, HttpServletRequest request) {
        return buildResponse(HttpStatus.NOT_FOUND, e, request);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<StandardError> handleEntityNotFound(EntityNotFoundException e, HttpServletRequest request) {
        return buildResponse(HttpStatus.NOT_FOUND, e, request);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> handleDatabase(DataIntegrityViolationException e, HttpServletRequest request) {
        return buildResponse(HttpStatus.BAD_REQUEST, e, request);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<StandardError> handleGeneral(Exception e, HttpServletRequest request) {
        return buildResponse(HttpStatus.INTERNAL_SERVER_ERROR, e, request);
    }

    private ResponseEntity<StandardError> buildResponse(HttpStatus status, Exception e, HttpServletRequest request) {
        StandardError err = new StandardError(
                Instant.now(),
                status.value(),
                e.getClass().getSimpleName(),
                e.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(status).body(err);
    }
}
