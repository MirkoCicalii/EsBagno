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
       
        Runnable R1= new runnable1();
        Runnable R2= new runnable2();
       
        
        Thread thr1=new Thread(R1);
        Thread thr2=new Thread(R2);
        Thread thr3=new Thread(R1);
        Thread thr4=new Thread(R2);
        
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        
    }
    
}
