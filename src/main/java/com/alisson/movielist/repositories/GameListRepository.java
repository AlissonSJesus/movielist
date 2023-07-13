package com.alisson.movielist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alisson.movielist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
