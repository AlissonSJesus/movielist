package com.alisson.movielist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alisson.movielist.dto.GameMinDTO;
import com.alisson.movielist.entities.Game;
import com.alisson.movielist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> listAll() {
       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(item -> new GameMinDTO(item)).toList();
       return dto;
    }
}
