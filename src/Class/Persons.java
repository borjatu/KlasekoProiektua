/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author bortu
 */
public class Persons {
    
    private int id;
    private String name;
    private String email;
    private String passwd;
    
    public void Persons(){
        
    }
    
    public void Persons(int id, String name, String email, String passwd){
        
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwd = passwd;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    public String toString(){
        return this.name;
    }
    
}
