/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbagno;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class bagno {
    
    public String Tipo;

    public bagno(String Tipo) {
        this.Tipo = Tipo;
    }
    
    synchronized void Bagnogenerico(){
        
        System.out.println("Un "+Tipo+" è entrato");
        try {
            Thread.sleep(5000);
            
        } catch (InterruptedException ex) {
            
            Logger.getLogger(bagno.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Un"+Tipo+ " è uscito");
    }
 
    
}
