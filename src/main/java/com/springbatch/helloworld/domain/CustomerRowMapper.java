//package com.springbatch.helloworld.domain;
//
//
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class CustomerRowMapper implements RowMapper<Customer> {
//
//    @Override
//    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
//
//        return new Customer(resultSet.getString("FIRST_NAME"),
//                resultSet.getString("LAST_NAME"), resultSet.getDate("BIRTH_DATE"));
//    }
//}
