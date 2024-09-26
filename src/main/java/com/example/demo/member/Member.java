package com.example.demo.member;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class Member {
    private final Integer id;
    private final String name;
    public static String school = "한국대";

    public static void print() {
        log.info(school);
        // 불가
        log.info(id);
    }

    public class Item {

    }

    public static class Item_Static {

    }
}
