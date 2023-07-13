package com.alisson.movielist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alisson.movielist.dto.GameListDTO;
import com.alisson.movielist.entities.GameList;
import com.alisson.movielist.repositories.GameListRepository;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> getAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(item -> new GameListDTO(item)).toList();
    }
}
