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
public class docIT implements staff{

    @Override
    public void getSalary() 
    {
        System.out.println("Salary for the doctor it 20000  ");
        
    }

    @Override
    public void getYearsOfWork() 
    {
        
        System.out.println("IT doctors work for 5y ");
    }
    
}
