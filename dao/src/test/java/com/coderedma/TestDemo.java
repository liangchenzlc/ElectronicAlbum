package com.coderedma;

import com.coderedma.service.UserService;
import com.coderedma.userdao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = RunApplication.class)
public class TestDemo {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testdemo1() {
        List<User> user = userMapper.selectByAll();
        System.out.println(user);
    }
}
