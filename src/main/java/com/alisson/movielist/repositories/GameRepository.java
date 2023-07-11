package com.alisson.movielist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alisson.movielist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
