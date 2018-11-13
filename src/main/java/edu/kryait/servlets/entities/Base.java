package edu.kryait.servlets.entities;

public abstract class Base {
    private int id;

    public Base(int id) {
        this.id = id;
    }

    public Base(){

    }

    public int getId() {
        return id;
    }
}
