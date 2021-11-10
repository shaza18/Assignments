
package std;

public class Student {
    String std_name;
     int std_id;
    int std_gpa;
   Subject subject_id;
   Subject subject_name;
   Subject subject_hours;
   Address street_no;
   Address city;
   Address country;
    public Student(String std_name, int std_gpa , Subject subject_id, Subject subject_name, Address street_no , Address city){
      
        this.std_name=std_name;
        this.std_gpa=std_gpa;
        this.subject_id=subject_id;
        this.subject_name=subject_name;
        this.street_no=street_no;
        this.city=city;
       
                
    }
    public void printInfo(){
        System.out.print(std_name+" "+std_id+" "+std_gpa);
    }
    
        
        
    }
    
    
    

