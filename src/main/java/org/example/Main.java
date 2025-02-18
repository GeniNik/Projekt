package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
            final String password = "1Schueler";
            final String port = "5432";
            final String host = "aws-0-eu-central-1.pooler.supabase.com";
            final String user = "postgres.rrfvgqtelejieqjcvaiq";
            final String URL = "jdbc:postgresql://"+host+":" + port + "/postgres?user="+user+"&password="+password;

                try (Connection conn = DriverManager.getConnection(URL);
                     Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT title FROM books ORDER BY title ASC")) {

                    System.out.println("Books in Alphabetic Order:");
                    while (rs.next()) {
                        System.out.println(rs.getString("title"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

