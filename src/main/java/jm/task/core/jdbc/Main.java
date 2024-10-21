package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    //public UserServiceImpl usi;

    public static void main(String[] args) {
        UserServiceImpl usi = new UserServiceImpl();
        usi.createUsersTable();
        usi.saveUser("ass", "bigass", (byte) 66);
        System.out.println("User с именем — ass добавлен в базу данных");
        usi.saveUser("Lestat", "Delionkur", (byte) 125);
        System.out.println("User с именем — Lestat добавлен в базу данных");
        usi.saveUser("Akasha", "Goddes", (byte) -1);
        System.out.println("User с именем — Akasha добавлен в базу данных");
        usi.saveUser("Anne", "Rice", (byte) 80);
        System.out.println("User с именем — Anne добавлен в базу данных");
        usi.removeUserById(1L);
        List<User> ulist = usi.getAllUsers();
        for (int i = 0; i < ulist.size(); i++) {
            System.out.println(ulist.get(i).toString());
        }
        usi.cleanUsersTable();
        usi.dropUsersTable();
        usi.shutdown();

    }
}
