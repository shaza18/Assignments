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
public class Work_Position extends abstractFactory
{

    @Override
    public staff getWorkPostion(String type) 
    {
        type.toLowerCase();
        switch (type)
        {
            case "cs doctor":
                return new docCS();
            case "is doctor":
                return new docIS();
            case "it doctor":
                return new docIT();
            case "cs teaching assist":
                return new teachCS();
            case"is teaching assist":
                return new teachIS();
            case "it teaching assist":
                return new teachIT();
        }
        return null;
    }
    
}
    