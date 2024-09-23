package com.example.demo;

import com.example.demo.exception.CustomException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class DemoApplication {
    public static void connect(String username, String password) {
        if (!StringUtils.hasText(username)) {
            throw new CustomException("NO_USERNAME", 3, "아이디를 입력하시오");
        }
        if (!StringUtils.hasText(password)) {
            throw new CustomException("NO_PASSWORD", 3, "비밀번호를 입력하시오");
        }
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("통과");
        } else {
            throw new CustomException("CONNECTION_ERROR", 3, "데이터베이스 에러");
        }
    }

    public static void main(String[] args) {
        try {
            connect("admi", "1234");
        } catch (CustomException e) {
            System.out.println(String.format(
                    "[%s] {priority: %s} %s",
                    e.getType(),
                    e.getPriority(),
                    e.getMessage()
            ));
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
