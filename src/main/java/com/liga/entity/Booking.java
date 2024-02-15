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
@MappedEntity(value = "Bookings")
@Data
public  class Booking {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    @Column(name="booking_id")
    Long id;

    @NonNull
    private Integer matchId;

    private String cardType;

    private LocalTime time;
}
