package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "boardgames")
public class BoardGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String boardgamename;

    public BoardGame(String boardgamename) {
        this.boardgamename = boardgamename;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "id=" + id +
                ", boardgamename='" + boardgamename + '\'' +
                '}';
    }
}
