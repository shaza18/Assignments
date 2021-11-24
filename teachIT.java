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
public class teachIT implements staff
{

    @Override
    public void getSalary() 
    {
        System.out.println("Teaching Assist's Salary is 4300 ");
        
    }

    @Override
    public void getYearsOfWork() 
    {
        
        System.out.println("Teaching Assists work for 6y ");
    }
    
}
