package com.volkodav4ik;

import com.volkodav4ik.dao.UserDao;
import com.volkodav4ik.model.User;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        int count = userDao.clear();
        userDao.addUser(new User("Olya", 26));
        userDao.addUser(new User("Kolya", 42));
        userDao.addUser(new User("Valya", 28));
        userDao.addUser(new User("Slava", 35));
        userDao.addUser(new User("Artur", 22));
        System.out.println(count);

        System.out.println(userDao.getAllUsers().toString());
        System.out.println("============================================================================");
        userDao.removeUserByName("Olya");
        userDao.removeUser(58);

        User someUser = userDao.getUser(59);
        someUser.setAge(150);
        someUser.setName("Starche");
        userDao.updateUser(someUser);
        System.out.println(userDao.getAllUsers().toString());
        userDao.close();
    }
}
