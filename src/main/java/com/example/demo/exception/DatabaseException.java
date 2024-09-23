package com.example.demo.exception;

public class DatabaseException extends RuntimeException {
    public DatabaseException() {
        // String message = "데이터베이스 접속 실패";
        // throw new RuntimeException(message);
        super("데이터베이스 접속 실패");
    }
}
