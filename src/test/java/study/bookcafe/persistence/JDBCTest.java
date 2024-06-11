package study.bookcafe.persistence;

import org.assertj.core.api.Fail;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCTest {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {

        try(Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/bookcafe?serverTimezone=Asia/Seoul",
                            "root",
                            "1234")){
            System.out.println(con);
        } catch (Exception e) {
            e.getMessage();
        }

    }



}
