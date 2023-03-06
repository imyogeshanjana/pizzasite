package com.pizzahut.dao.mapper;

import com.pizzahut.entity.Pizza;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PizzaRowMapper implements RowMapper<Pizza> {
    @Override
    public Pizza mapRow(ResultSet resultSet, int i) throws SQLException {
        Pizza pizza = new Pizza();
        pizza.setId(resultSet.getInt("id"));
        pizza.setName(resultSet.getString("name"));
        pizza.setDescription(resultSet.getString("description"));
        pizza.setSize(resultSet.getInt("size"));
        pizza.setPrice(resultSet.getInt("price"));

        return pizza;
    }
}
