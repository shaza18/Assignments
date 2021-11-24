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
public class CS extends Work_Position
{
    public staff getStaff(String type)
    {
        type.toLowerCase();
        switch (type)
        {
            case "doctor" :
                return new docCS();
                
            case "teaching assist":
                return new teachCS();
        }
        return null;
    }
    
}
