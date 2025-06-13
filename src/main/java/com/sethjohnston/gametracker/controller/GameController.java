package com.sethjohnston.gametracker.controller;

import com.sethjohnston.gametracker.model.Game;
import com.sethjohnston.gametracker.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    // constructor injection
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }
}
