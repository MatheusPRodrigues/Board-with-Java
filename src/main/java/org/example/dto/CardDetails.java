package org.example.dto;

import java.time.OffsetDateTime;

public record CardDetails(Long id,
                          boolean blocked,
                          OffsetDateTime blocked_at,
                          String blockReason,
                          int blockAmount,
                          Long columnId,
                          String columnName) {
}
