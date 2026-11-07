package models;

public class Customer {
    private String customerName;
    private String city;
    private int age;
    private String username;
    private String password;
    
    public Customer(String customerName, String city, int age, String username, String password){
        this.customerName = customerName;
        this.city = city;
        if(age > 0)
            this.age = age;
        else
            System.out.println("Age cannot be negative!!");
        this.username = username;
        this.password = password;
    }
}
