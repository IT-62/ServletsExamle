package edu.kryait.servlets.dao;

import edu.kryait.servlets.entities.Base;

import java.util.ArrayList;

public interface Dao<T extends Base> {
    public abstract void insert(T entity);
    public abstract T getById(int id);
    public abstract void update(T entity);
    public abstract void delete(T entity);
    public abstract ArrayList<T> getAll();
}
