package com.alisson.movielist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alisson.movielist.dto.GameDTO;
import com.alisson.movielist.dto.GameMinDTO;
import com.alisson.movielist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> listAll() {
        List<GameMinDTO> result = gameService.listAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO getById(@PathVariable Long id) {
        GameDTO result = gameService.getById(id);
        return result;
    }
}
