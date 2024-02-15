    package com.liga.entity;

    import io.micronaut.core.annotation.Introspected;
    import io.micronaut.data.annotation.GeneratedValue;
    import io.micronaut.data.annotation.Id;
    import io.micronaut.data.annotation.MappedEntity;
    import io.micronaut.serde.annotation.Serdeable;
    import lombok.Data;
    import lombok.NonNull;

    @Serdeable
    @Introspected
    @MappedEntity(value = "teams")
    public @Data class Team {

        @Id
        @GeneratedValue(GeneratedValue.Type.AUTO)
        Long TeamID;

        @NonNull
        String TeamName;

        String CoachName;

        Integer FoundedYear;

        String HomeGround;

        String City;

        String Country;

        String LogoURL;
    }
