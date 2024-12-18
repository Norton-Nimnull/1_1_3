package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.*;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao udao;

    public UserServiceImpl() {
        udao = new UserDaoJDBCImpl();
    }

    @Override
    public void createUsersTable() {
        udao.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        udao.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        udao.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        udao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return udao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        udao.cleanUsersTable();
    }

}
