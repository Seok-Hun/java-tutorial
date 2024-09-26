package com.example.demo.Listener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KafkaStringListener extends KafkaAbstractListener<String> {
    @Override
    public void consume(String message) {
        log.info(message);
    }
}
