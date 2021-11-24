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
public class IS  extends Work_Position
{
    public staff getStaff(String type)
    {
        type.toLowerCase();
        switch(type)
        {
            case "doctor":
                return new docIS();
            case "teaching assist":
                return new teachIS();
        }
        return null;
    }
    
}