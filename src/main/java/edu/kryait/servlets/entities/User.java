package edu.kryait.servlets.entities;

public class User extends Base {
    private String username;
    private String password;
    public User(int id, String username, String password) {
        super(id);

        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getCPass(){
        String res = "";
        for(int i = 0; i < password.length(); i++)
            res+="*";
        return res;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

