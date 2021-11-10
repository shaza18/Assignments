/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_person;


public class person {
    private String name;
    private String address;
    private int phone_number;
    private String Email;
    public person(String name){
        this.name=name;
    }
    public person(String name, String address, int phone_number, String Email){
        this.name=name;
        this.address=address;
        this.phone_number=phone_number;
        this.Email=Email;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

   
    public String getEmail() {
        return Email;
    }

    
    public void setEmail(String Email) {
        this.Email = Email;
    }
   @Override
    public String toString(){
        return "Name " + getName()+" Class Name " + this.getClass().getName();
   
    }
}
