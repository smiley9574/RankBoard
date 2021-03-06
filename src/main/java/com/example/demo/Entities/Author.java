package com.example.demo.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String authorname;
    private String authorsurname;
    @Lob
    private String shortbio;

    @ManyToMany
    @JoinTable(
            name = "boardgames_authors",
            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "boardgame_id", referencedColumnName = "id")
    )
    private List<BoardGame> boardgames;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorname='" + authorname + '\'' +
                ", authorsurname='" + authorsurname + '\'' +
                ", shortbio='" + shortbio + '\'' +
                '}';
    }
}
