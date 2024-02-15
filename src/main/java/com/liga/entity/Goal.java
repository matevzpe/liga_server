package com.liga.entity;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalTime;

@Serdeable
@Introspected
@MappedEntity(value = "Goals")
public @Data class Goal {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    @Column(name="goal_id")
    Long id;

    @NonNull
    private Integer MatchID;
    @NonNull
    private Integer PlayerID;
    @NonNull
    private Integer TeamID;

    private LocalTime Time;
}
