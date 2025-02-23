package com.idevalot.department_service.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

    public ErrorDetails() {
    }

    public ErrorDetails(LocalDateTime timestamp, String message, String path, String errorCode) {
        this.timestamp = timestamp;
        this.message = message;
        this.path = path;
        this.errorCode = errorCode;
    }

    private LocalDateTime timestamp;
    private String message;
    private String path;
    private String errorCode;


    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getPath() {
        return path;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
