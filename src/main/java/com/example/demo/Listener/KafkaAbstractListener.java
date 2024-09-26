package com.example.demo.Listener;

import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class KafkaAbstractListener<T> implements KafkaListener<T> {
    void logger(T message) {
        log.info("--Start consume");
        consume(message);
        log.info("--End consume");
    }
}
