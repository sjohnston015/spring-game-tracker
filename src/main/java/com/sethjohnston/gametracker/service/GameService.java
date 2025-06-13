package com.sethjohnston.gametracker.service;

import com.sethjohnston.gametracker.model.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    public List<Game> getAllGames() {
        return List.of(
                new Game(1, "The Legend of Zelda", "Nintendo Switch", 4.5),
                new Game(2, "Super Mario Bros.", "Nintendo Entertainment System", 4.0),
                new Game(3, "Signalis", "PC", 4.1)
        );
    }
}
