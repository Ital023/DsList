package io.github.Ital023.DsList_backend.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class GameRepositoryTests {

    @Autowired
    private GameRepository repository;

    private Long existingId;
    private Long nonExistingId;
    private Long countTotalGames;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalGames = 10L;
    }
}
