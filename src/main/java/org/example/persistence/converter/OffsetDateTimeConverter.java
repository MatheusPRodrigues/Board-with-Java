package org.example.persistence.converter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.OffsetDateTime;

import static java.time.ZoneOffset.UTC;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OffsetDateTimeConverter {

    public static OffsetDateTime toOffsetDateTime(final Timestamp value) {
        return OffsetDateTime.ofInstant(value.toInstant(), UTC);
    }

}
