/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_person;


public class Staff extends Employee{
    private String title;
    public Staff(String name){
        super(name);
    }
    public Staff(String office, String salary, String name,String title){
    super(office,salary, name);
    this.title=title;
}
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
        @Override
    public String toString(){
        return "Name" + getName()+"Class Name" + this.getClass().getName();
   
    }

}
