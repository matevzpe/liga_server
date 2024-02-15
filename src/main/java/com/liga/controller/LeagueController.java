package com.liga.controller;

import com.liga.entity.League;
import com.liga.repository.LeagueRepository;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/league")
public class LeagueController {
    @Inject
    LeagueRepository leagueRepository;

    /*@Post("/")
    League save(@Body League league) {
        try{
            League existingGoal = leagueRepository.findById(league.getId()).get();
            return leagueRepository.update(league);
        } catch (Exception e){
            return leagueRepository.save(league);
        }
    }*/

    @Get("/{id}")
    League get(@PathVariable Long id){
        return leagueRepository.findById(id).get();
    }

    @Get("/list")
    public List<League> list(Pageable pageable) {
        return leagueRepository.findAll(pageable).getContent();
    }

    @Delete("/{id}")
    @Status(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        leagueRepository.deleteById(id);
    }
}