package com.example.CourseJava.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.CourseJava.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
	    String error = "Resource not found";
	    HttpStatus status = HttpStatus.NOT_FOUND;
	    StandardError err = new StandardError(
	            Instant.now(),
	            status.value(),
	            error,
	            e.getMessage(),
	            request.getRequestURI());
	    return ResponseEntity.status(status).body(err);
	}

    @ExceptionHandler(Exception.class)
    public ResponseEntity<StandardError> generalError(Exception e, HttpServletRequest request) {
        String error = "Internal server error";
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        StandardError err = new StandardError(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
