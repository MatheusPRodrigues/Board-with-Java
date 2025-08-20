package org.example.persistence.dao;

import lombok.AllArgsConstructor;
import org.example.dto.CardDetails;

import java.sql.Connection;

@AllArgsConstructor
public class CardDAO {

    private final Connection connection;

    public CardDetails findById(final Long id) {
        return null;
    }

}
