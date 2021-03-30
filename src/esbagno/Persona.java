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
public class Persona implements Runnable {
     bagno x;

    public Persona(bagno x) {
        this.x = x;
    }
     
     public void run(){
        x.Bagnogenerico();
    }
    
    
    
}
