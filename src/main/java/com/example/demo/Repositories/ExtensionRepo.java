package com.example.demo.Repositories;

import com.example.demo.Entities.Extension;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExtensionRepo extends CrudRepository<Extension, Integer> {

    @Query("SELECT e FROM Extension e WHERE e.boardgame.id=:gameId")
    List<Extension> findByGameId(@Param("gameId")int gameId);
}
