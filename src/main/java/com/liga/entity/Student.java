package com.liga.entity;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.http.annotation.Get;
import io.micronaut.serde.annotation.Serdeable;
import jdk.jfr.Name;
import lombok.Data;
import lombok.NonNull;

@Serdeable
@Introspected
@MappedEntity(value = "students")
public @Data class Student{

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    Long id;

    @NonNull
    String name;

    String code;



}