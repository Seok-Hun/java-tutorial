package com.example.demo.exception;

public class UsernameException extends RuntimeException {
    public UsernameException() {
        super("ID를 입력하세요.");
    }
}
