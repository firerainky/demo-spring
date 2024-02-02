package com.zky.demojava.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

// Data annotation from Lombok library gives the free getter/setters, toString, equals, and hashCode methods
// Slf4j annotation from Lombok library gives the free logger object, then we could use log.info, log.error, etc.
// We could see these methods and objects if we decompile the class file
@Data
@Slf4j
public final class LombokPOJO {
    private String farm;
    private Integer expiration;

    public void test() {
        log.info("This is a test method");
    }
}
