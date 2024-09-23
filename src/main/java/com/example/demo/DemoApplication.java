package com.example.demo;

import com.example.demo.exception.DatabaseException;
import com.example.demo.exception.PasswordException;
import com.example.demo.exception.UsernameException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

    public static void connect(String username, String password) {
        if (!StringUtils.hasText(username)) {
            throw new UsernameException();
        }

        if (!StringUtils.hasText(password)) {
            throw new PasswordException();
        }
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("- Database connected successfully");
        } else {
            throw new DatabaseException();
        }
    }

    public static void main(String[] args) {
        try {
            connect("", "1234");
        } catch (UsernameException e) {
            e.printStackTrace();
        } catch (PasswordException e) {
            e.printStackTrace();
        } catch (DatabaseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
