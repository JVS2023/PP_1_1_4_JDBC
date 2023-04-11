package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivanov", "Egor", (byte) 19);
        userService.saveUser("Sidorov", "Sergey", (byte) 20);
        userService.saveUser("Vetrova", "Anna", (byte) 21);
        userService.saveUser("Kapustin", "Andrey", (byte) 19);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
