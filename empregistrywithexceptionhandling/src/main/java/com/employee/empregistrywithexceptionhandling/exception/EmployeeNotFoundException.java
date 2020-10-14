package com.employee.empregistrywithexceptionhandling.exception;

public class EmployeeNotFoundException extends Exception{

    private String errorCode;
    private String errorMessage;

    public EmployeeNotFoundException() {
    }

    public EmployeeNotFoundException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
