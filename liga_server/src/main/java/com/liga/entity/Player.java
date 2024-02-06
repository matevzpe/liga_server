package com.liga.entity;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;
import lombok.NonNull;

import javax.naming.Name;
import java.time.LocalDate;
import java.text.DecimalFormat;

@Serdeable
@Introspected
@MappedEntity(value = "Players")
public @Data class Player {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    Long PlayerID;

    @NonNull
    Name FirstName;

    @NonNull
    Name LastName;

    LocalDate DateOfBirth;

    String Nationality;

    String Position;


    DecimalFormat Height;

    DecimalFormat Weight;

    @NonNull
    Long TeamID;
}