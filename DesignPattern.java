/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package designpattern;

/**
 *
 * @author AB
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        abstractFactory s = factoryProducer.getFactory("cs");
        staff f1 =s.getWorkPostion("cs doctor");
        f1.getSalary();
        f1=s.getWorkPostion("is teaching assist");
        f1.getSalary();
        f1.getYearsOfWork();
    }
    
}
