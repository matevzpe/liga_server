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
    @MappedEntity(value = "teams")
    public @Data class Team {

        @Id
        @GeneratedValue(GeneratedValue.Type.AUTO)
        @Column(name="id")
        Long id;

        @NonNull
        String teamName;

        String coachName;

        Integer foundedYear;

        String address;

        String city;

        String country;

    }
