package com.firstproject.Springboot.tutorial.entity;

import org.springframework.http.HttpStatus;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ErrorMessage {
    @Id
    private HttpStatus status;
    private String message;

    public ErrorMessage() {
    }

    public ErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
