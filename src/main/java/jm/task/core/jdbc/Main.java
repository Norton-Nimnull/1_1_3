package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;


import java.util.List;

public class Main {
  //public UserServiceImpl usi;

    public static void main(String[] args) {
        UserServiceImpl usi = new UserServiceImpl();
usi.createUsersTable();
usi.saveUser("Lestat","Delionkur",(byte)125);
System.out.println("User с именем — Lestat добавлен в базу данных");
usi.saveUser("Akasha","Goddes",(byte)-1);
        System.out.println("User с именем — Akasha добавлен в базу данных");
usi.saveUser("Claudia","Rice",(byte)6);
        System.out.println("User с именем — Claudia добавлен в базу данных");
usi.saveUser("Anne","Rice",(byte)80);
        System.out.println("User с именем — Anne добавлен в базу данных");
        List<User> ulist = usi.getAllUsers();
        for(int i=0; i< ulist.size();i++){
            System.out.println(ulist.get(i).toString());
        }
        usi.removeUserById(3L);
        usi.dropUsersTable();
        usi.dropUsersTable();
        usi.shutdown();

        }
    }
