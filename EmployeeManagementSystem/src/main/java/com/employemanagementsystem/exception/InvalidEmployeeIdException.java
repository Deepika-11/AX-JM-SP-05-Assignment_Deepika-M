package com.employemanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class InvalidEmployeeIdException extends RuntimeException {

    public InvalidEmployeeIdException(String msg)
    {
        super(msg);
    }

    public ResponseEntity<ErrorResponse> handleEmployeeException(){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorCode("404");
        errorResponse.setErrorResponse(super.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
