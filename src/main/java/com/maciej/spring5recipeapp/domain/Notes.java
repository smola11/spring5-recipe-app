package com.maciej.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // we allow the Recipe to own this;
    // if we delete Notes object we don't want to delete Recipe object; Inverse we want;
    @OneToOne
    private Recipe recipe;

    @Lob // It will be created as CLOB in database to allow user more input;
    private String recipeNotes;
}
