package com.liga.entity;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Serdeable
@Introspected
@MappedEntity(value = "Matches")
public @Data class Match {

    @Id
    @GeneratedValue
    Integer MatchID;

    LocalDate Date;

    LocalTime Time;

    String Venue;

    Integer HomeTeamID;

    Integer AwayTeamID;

    Integer HomeTeamScore;

    Integer AwayTeamScore;

    String Result;
}
