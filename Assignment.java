/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;



/**
 *
 * @author AB
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(55);
        tv1.setVolume(5);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
        // TODO code application logic here
   
   

