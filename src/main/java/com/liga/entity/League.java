package com.liga.entity;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NonNull;

@Serdeable
@Introspected
@MappedEntity(value = "LeagueTable")
public @Data class League {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    @Column(name="league_table_id")
    Long id;

    @NonNull
    private Integer TeamID;

    @NonNull
    private Integer Played;

    private Integer Won;

    private Integer Drawn;

    private Integer Lost;

    @NonNull
    private Integer GoalsFor;

    @NonNull
    private Integer GoalsAgainst;

    @NonNull
    private Integer Points;
}
