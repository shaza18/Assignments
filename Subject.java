/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;


public class Subject {
    int subject_id;
    String subject_name;
    double subject_hours;
    public Subject( int subject_id , String subject_name){
        this.subject_id=subject_id;
        this.subject_name=subject_name;
       
    }
    public void print(){
        System.out.println(subject_id+" "+subject_name+" "+subject_hours);
    }
    
    
}
