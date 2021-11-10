/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_person;


public class Faculty extends Employee{
    private String office_hours;
    private String rank;
    public Faculty(String name){
        super(name);
    }
    public Faculty(String  name,String office, String salary, String office_hours, String rank){
    super(name, office,salary);
    this.rank=rank;
    this.office_hours=office_hours;
   
   
    }
  

    public String getOffice_hours() {
        return office_hours;
    }

    public void setOffice_hours(String office_hours) {
        this.office_hours = office_hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
      
     @Override
    public String toString(){
        return "Name" + getName()+"Class Name" + this.getClass().getName();
   
    }
}
