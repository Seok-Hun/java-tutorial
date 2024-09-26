package com.example.demo.member;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Setter
@Slf4j
public class Member {
    private final Integer id;
    private String name;

    public final void print() {
        log.info(name);
    }
}
