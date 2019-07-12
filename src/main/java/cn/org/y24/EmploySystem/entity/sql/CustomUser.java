package cn.org.y24.EmploySystem.entity.sql;

public class CustomUser {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public CustomUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
