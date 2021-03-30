/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbagno;

/**
 *
 * @author PC
 */
public class EsBagno {

    
    public static void main(String[] args) {
       
        bagno b1 = new bagno ("Uomo");
        bagno b2 = new bagno ("Donna");
        
        Runnable R1= new Persona(b1);
        Runnable R2= new Persona(b2);
       
        
        Thread Uomo1=new Thread(R1);
        Thread Uomo2=new Thread(R2);
        
        Thread Donna1=new Thread(R1);
        Thread Donna2=new Thread(R2);
        
        Uomo1.start();
        Uomo2.start();
        
        Donna1.start();
        Donna2.start();
        
    }
    
}
