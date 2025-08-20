package org.example.dto;

import org.example.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id,
                                 int order,
                                 BoardColumnKindEnum kind) {
}
