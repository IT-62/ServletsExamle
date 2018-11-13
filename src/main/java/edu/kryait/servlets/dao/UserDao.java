package edu.kryait.servlets.dao;

import edu.kryait.servlets.entities.User;

public abstract class UserDao implements Dao<User> {
    public abstract void closeCon();

}

