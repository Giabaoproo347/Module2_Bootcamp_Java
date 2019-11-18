package com.logIn.Dao;

import com.logIn.Model.Login;
import com.logIn.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users = new ArrayList<>();
    static {
        User user = new User();
        user.setAge(10);
        user.setName("John");
        user.setAccount("john123");
        user.setEmail("john@gmail.com");
        user.setPassword("123123");
        users.add(user);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Bill");
        u2.setAccount("bill");
        u2.setEmail("bill@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Mike");
        u3.setAccount("mike");
        u2.setEmail("mike@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User check(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) &&
                    (u.getPassword().equals(login.getPassword()))) {
                return u;
            }
        }
        return null;
    }
}
