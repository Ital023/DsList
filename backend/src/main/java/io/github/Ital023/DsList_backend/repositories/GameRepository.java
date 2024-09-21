package io.github.Ital023.DsList_backend.repositories;

import io.github.Ital023.DsList_backend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
