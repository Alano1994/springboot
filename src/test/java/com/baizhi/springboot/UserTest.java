package com.baizhi.springboot;

import com.baizhi.springboot.AppRun;
import com.baizhi.springboot.dao.UserDao;
import com.baizhi.springboot.entity.User;
import com.baizhi.springboot.service.Userservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    private static Logger logger = LoggerFactory.getLogger(AppRun.class);

    @Autowired
    private Userservice userservice;
    @Test
    public void test1(){
        List<User> userList = userservice.getAll();
        for (User user : userList) {
            logger.info(user.toString());
        }
    }

}
