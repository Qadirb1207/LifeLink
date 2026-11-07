package models;

public class Admin {
    private String adminName;
    private String adminCity;
    private String username;
    private String password;

    public Admin(String adminName, String adminCity, String username, String password){
        this.adminName = adminName;
        this.adminCity = adminCity;
        this.username = username;
        this.password = password;
    }
}
