package org.example.service;

import lombok.AllArgsConstructor;
import org.example.persistence.dao.CardDAO;
import org.example.persistence.entity.CardEntity;

import java.sql.Connection;
import java.sql.SQLException;

@AllArgsConstructor
public class CardService {

    private final Connection connection;

    public CardEntity insert(final CardEntity entity) throws SQLException {
        try {
            var dao = new CardDAO(connection);
            dao.insert(entity);
            connection.commit();
            return entity;
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        }
    }

}
