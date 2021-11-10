/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;


public class Address {
    int street_no;
    String city;
    String country;
    public Address(int street_no, String city,String country){
        this.street_no=street_no;
        this.city=city;
        this.country=country;
    }
    public void print2(){
        System.out.print(street_no+" "+city+" "+country);
    }
    
}
