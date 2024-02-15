package com.liga.controller;

import com.liga.entity.Match;
import com.liga.repository.MatchRepository;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/match")
public class MatchController {
    @Inject
    MatchRepository matchRepository;

    /*@Post("/")
    Match save(@Body Match match) {
        try{
            Match existingMatch = matchRepository.findById(match.getId()).get();
            return matchRepository.update(match);
        } catch (Exception e){
            return matchRepository.save(match);
        }
    }*/

    @Get("/{id}")
    Match get(@PathVariable Long id){
        return matchRepository.findById(id).get();
    }

    @Get("/list")
    public List<Match> list(Pageable pageable) {
        return matchRepository.findAll(pageable).getContent();
    }

    @Delete("/{id}")
    @Status(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        matchRepository.deleteById(id);
    }
}
