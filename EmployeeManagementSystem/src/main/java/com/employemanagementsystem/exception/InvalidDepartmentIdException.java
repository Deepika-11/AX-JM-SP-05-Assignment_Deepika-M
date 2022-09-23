package com.employemanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class InvalidDepartmentIdException extends RuntimeException {

    public InvalidDepartmentIdException(String msg) {
        super(msg);
    }

    public ResponseEntity<ErrorResponse> handleDepartmentException() {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorCode("404");
        errorResponse.setErrorResponse(super.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}