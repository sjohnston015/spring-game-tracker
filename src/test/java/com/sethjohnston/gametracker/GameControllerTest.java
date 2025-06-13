package com.sethjohnston.gametracker;

import com.sethjohnston.gametracker.controller.GameController;
import com.sethjohnston.gametracker.service.GameService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GameController.class)
public class GameControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    GameService gameService;

    // testing the "GET /games" route exists
    @Test
    void verifyAllGamesPath() throws Exception {
        mockMvc.perform(get("/games"))
                .andExpect(status().isOk());
    }

    // testing the "GET /games/${id}" routes exist
    @Test
    void verifySingleGamePath() throws Exception {
        mockMvc.perform(get("/games/{id}"))
                .andExpect(status().isOk());
    }
}
