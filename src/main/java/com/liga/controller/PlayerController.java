package com.liga.controller;

import com.liga.entity.Player;
import com.liga.repository.PlayerRepository;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/player")
public class PlayerController {
    @Inject
    PlayerRepository playerRepository;

    @Post("/")
    Player save(@Body Player player) {
        try{
            Player existingPlayer = playerRepository.findById(player.getId()).get();
            return playerRepository.update(player);
        } catch (Exception e){
            return playerRepository.save(player);
        }
    }

    @Get("/{id}")
    Player get(@PathVariable Long id){
        return playerRepository.findById(id).get();
    }

    @Get("/list")
    public List<Player> list(Pageable pageable) {
        return playerRepository.findAll(pageable).getContent();
    }

    @Delete("/{id}")
    @Status(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        playerRepository.deleteById(id);
    }
}
