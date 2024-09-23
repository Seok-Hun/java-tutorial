package com.example.demo.exception;

public class PasswordException extends RuntimeException {
    public PasswordException() {
        super("비밀번호를 입력하세요.");
    }
}
