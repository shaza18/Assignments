/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

/**
 *
 * @author AB
 */
public class Mammal implements animal
{
    int numoflegs;
    public Mammal( int numoflegs)
    {
        this.numoflegs=numoflegs;
        
    }
    public void eat()
    {
        System.out.println("this method in interface class");
    }
    public void travel()
    {
        System.out.println("this method in interface class");
    }
    public int NoofLegs()
    {
        return numoflegs;
    }
    public String FavFood( String FavFood)
    {
        return FavFood;
    }
    
}
