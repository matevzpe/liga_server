package com.liga.repository;

import com.liga.entity.Goal;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.PageableRepository;


@JdbcRepository(dialect = Dialect.POSTGRES)
public interface GoalRepository extends PageableRepository<Goal, Long> {
}