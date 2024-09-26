package com.example.demo.Listener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KafkaIntegerListener extends KafkaAbstractListener<Integer> {

    @Override
    public void consume(Integer message) {
        log.info(message.toString());
    }
}
