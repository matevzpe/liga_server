package com.liga.entity;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Serdeable
@Introspected
@MappedEntity(value = "matches")
public @Data class Match {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    @Column(name="team_id")
    Long id;

    @NonNull
    LocalDate Date;
    @NonNull
    LocalTime Time;
    @NonNull
    String Venue;
    @NonNull
    Integer HomeTeamID;
    @NonNull
    Integer AwayTeamID;
    @NonNull
    Integer HomeTeamScore;
    @NonNull
    Integer AwayTeamScore;
    @NonNull
    String Result;
}
