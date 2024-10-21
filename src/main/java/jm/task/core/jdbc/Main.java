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
usi.saveUser("ass","bigass",(byte)66);
System.out.println("User с именем — ass добавлен в базу данных");
usi.saveUser("29A666","cunt",(byte)99);
        System.out.println("User с именем — 29A666 добавлен в базу данных");
usi.saveUser("bender","rodrigas",(byte)100);
        System.out.println("User с именем — bender добавлен в базу данных");
usi.saveUser("lila","turanga",(byte)25);
        System.out.println("User с именем — lila добавлен в базу данных");
        List<User> ulist = usi.getAllUsers();
        for(int i=0; i< ulist.size();i++){
            System.out.println(ulist.get(i).toString());
        }
        usi.removeUserById(1L);
        usi.dropUsersTable();
        usi.dropUsersTable();
        usi.shutdown();

        }
    }
