package net.zjitc.domain;

public class User {
    private int id;
    private String username;
    private String password;
    private String sex;
    private String  email;
    private String tel;

    public User() {
    }

    public User(int id, String username, String password, String sex, String email, String tel) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.email = email;
        this.tel = tel;
    }

    public User(String username, String password, String sex, String email, String tel) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.email = email;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return ""+id+" "+username+" "+password+" "+" "+sex+" "+email+" "+tel;
    }
}
