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
public class docIS implements staff{

    @Override
    public void getSalary() 
    {
        System.out.println(" Salary for the doctor is 10000 ");
        
    }

    @Override
    public void getYearsOfWork() 
    {
        
        System.out.println("IS doctors work for 3y ");
    }
    
}
