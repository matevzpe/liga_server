package com.liga.repository;

import com.liga.entity.Match;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.PageableRepository;


@JdbcRepository(dialect = Dialect.POSTGRES)
public interface MatchRepository extends PageableRepository<Match, Long> {
}