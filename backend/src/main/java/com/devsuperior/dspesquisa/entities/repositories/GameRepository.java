package com.devsuperior.dspesquisa.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Genre;

public interface GameRepository extends JpaRepository<Genre, Long> {

}
