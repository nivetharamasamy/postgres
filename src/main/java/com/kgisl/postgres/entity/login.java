package com.kgisl.postgres.entity;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "login")
public class login {
    String username;
    String password;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public login(int id,String username, String password) {
       this.id=id;
    this.username=username;
    this.password = password;
  
    
    }
public login(){
    
}

    public String toString() { 
        return String.format(username+" " +password); 
    } 


}