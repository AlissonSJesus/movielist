package com.alisson.movielist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alisson.movielist.dto.GameDTO;
import com.alisson.movielist.dto.GameMinDTO;
import com.alisson.movielist.entities.Game;
import com.alisson.movielist.projections.GameMinProjection;
import com.alisson.movielist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> listAll() {
       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(item -> new GameMinDTO(item)).toList();
       return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO getById(Long id) {
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
       List<GameMinProjection> result = gameRepository.searchByList(listId);
       List<GameMinDTO> dto = result.stream().map(item -> new GameMinDTO(item)).toList();
       return dto;
    }
}
