package io.github.Ital023.DsList_backend.services;

import io.github.Ital023.DsList_backend.dto.GameMinDTO;
import io.github.Ital023.DsList_backend.entities.Game;
import io.github.Ital023.DsList_backend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }


}
