/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_person;

public class Employee extends person {

    private String office;
    private String salary;
    private myDate hire_date;
   
  public Employee(String name ){
      super(name);
  }
   public Employee(String office, String salary,String name){
       super(name);
       this.office=office;
       this.salary=salary;
    
   }
   

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }


    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public myDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(myDate hire_date) {
        this.hire_date = hire_date;
    }
    @Override
    public String toString(){
        return "Name" + getName()+"Class Name" + this.getClass().getName();
   
    }
    
    
}
