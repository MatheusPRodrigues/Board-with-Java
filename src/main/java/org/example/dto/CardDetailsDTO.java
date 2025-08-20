package org.example.dto;

import java.time.OffsetDateTime;

public record CardDetailsDTO(Long id,
                             String title,
                             String description,
                             boolean blocked,
                             OffsetDateTime blocked_at,
                             String blockReason,
                             int blockAmount,
                             Long columnId,
                             String columnName) {
}
