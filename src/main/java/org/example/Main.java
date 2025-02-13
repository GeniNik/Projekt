package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
            final String URL = "jdbc:postgresql://aws-0-eu-central-1.pooler.supabase.com:5432/postgres?user=postgres.rrfvgqtelejieqjcvaiq&password=1Schueler";

                try (Connection conn = DriverManager.getConnection(URL);
                     Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT title FROM books ORDER BY title ASC")) {

                    System.out.println("Bücher in alphabetischer Reihenfolge:");
                    while (rs.next()) {
                        System.out.println(rs.getString("title"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
