package org.example.persistence.entity;

import lombok.Data;

import static org.example.persistence.entity.BoardColumnKindEnum.INITIAL;

@Data
public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();

}
