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
public class bagno2  {
     
    synchronized void Donna(){
        
        System.out.println("La Donna è entrata");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(bagno.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("La Donna è uscita");
    
    }
}
