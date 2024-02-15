package com.liga.controller;

import com.liga.entity.Goal;
import com.liga.repository.GoalRepository;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/goal")
public class GoalController {
    @Inject
    GoalRepository goalRepository;

    /*@Post("/")
    Goal save(@Body Goal goal) {
        try{
            Goal existingGoal = goalRepository.findById(goal.getId()).get();
            return goalRepository.update(goal);
        } catch (Exception e){
            return goalRepository.save(goal);
        }
    }*/

    @Get("/{id}")
    Goal get(@PathVariable Long id){
        return goalRepository.findById(id).get();
    }

    @Get("/list")
    public List<Goal> list(Pageable pageable) {
        return goalRepository.findAll(pageable).getContent();
    }

    @Delete("/{id}")
    @Status(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        goalRepository.deleteById(id);
    }
}