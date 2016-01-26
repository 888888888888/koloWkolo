package com.example.crejzer.kolkoapp;

import android.content.Intent;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Crejzer on 2016-01-26.
 */
public class DataBase {

    private Connection conn = null;
    private int wynik;

    public DataBase() {
        if (ladujSterownik())
            conn = connectToDatabase("www.db4free.net:3306", "koloapptest", "crejzer", "projekt");
        if (conn == null)
            Log.d("test","bład podczas łączenia");
    }

    public int getWynik() {
        return wynik;
    }

    public boolean ladujSterownik() {
        // LADOWANIE STEROWNIKA
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Connection connectToDatabase(String adress, String dataBaseName, String userName, String password) {

        String baza = "jdbc:mysql://" + adress + "/" + dataBaseName;
        java.sql.Connection connection = null;
        try {
            connection = DriverManager.getConnection(baza, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public boolean toDB(String login){
        PreparedStatement prepStmt;
        try {
            prepStmt = conn.prepareStatement("INSERT INTO user (Nick, Wygrane) VALUES(?, 0)");
            prepStmt.setString(1,login);
            prepStmt.execute();

        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public void odczytZBazyDanych(String nick) {

        try {

            java.sql.PreparedStatement statement = conn.prepareStatement("SELECT wygrane FROM user WHERE Nick = ?");
            statement.setString(1, nick);
            java.sql.ResultSet resultset = null;
            resultset = statement.executeQuery();
            if (resultset.next()) {
                wynik = resultset.getInt("wygrane");
                wynik++;
            }

            statement = conn.prepareStatement("UPDATE user " +
                    "SET Wygrane = ? " +
                    "WHERE Nick = ?; ");
            statement.setInt(1, wynik);
            statement.setString(2, nick);
            statement.execute();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void closeDataBase() throws SQLException{
        if(conn != null){
            conn.close();
        }
    }
}
