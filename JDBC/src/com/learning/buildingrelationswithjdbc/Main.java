package com.learning.buildingrelationswithjdbc;

import com.learning.buildingrelationswithjdbc.DBConnection;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {
            DBConnection.getConnection();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

    }
}
