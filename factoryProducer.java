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
public class factoryProducer 
{
    public static abstractFactory getFactory(String s)
    {
        s.toLowerCase();
        
        if (s.equalsIgnoreCase("cs"))
        {
            CS cs1 = new CS();
        }
        else if(s.equalsIgnoreCase("IS"))
        {
            IS is1 = new IS();
        }
        else
        {
            IT it1 = new IT();
        }
    }  
        
    
    
