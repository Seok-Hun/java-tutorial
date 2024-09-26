package com.example.demo.Listener;

public interface KafkaListener<T> {
    void consume(T message);
}
