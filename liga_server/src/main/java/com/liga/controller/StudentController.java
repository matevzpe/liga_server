package com.liga.controller;

import com.liga.entity.Team;
import com.liga.repository.TeamRepository;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/team")
public class StudentController {
    @Inject
    TeamRepository teamRepository;

    @Post("/")
    Team save(@Body Team team) {
        try{
            Team existingTeam = teamRepository.findById(team.TeamID()).get();
            return teamRepository.update(team);
        } catch (Exception e){
            return teamRepository.save(team);
        }
    }

    @Get("/{id}")
    Team get(@PathVariable Long id){
        return teamRepository.findById(id).get();
    }

    @Get("/list")
    public List<Team> list(Pageable pageable) {
        return teamRepository.findAll(pageable).getContent();
    }

    @Delete("/{id}")
    @Status(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        teamRepository.deleteById(id);
    }
}


