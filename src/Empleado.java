/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndrésEduardo
 */


import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class Empleado extends Thread{
    
    
    private Almacen Caja;
    private JTextArea ventana;
    private Semaphore CapDisponible;
    private Semaphore Ingrediente;
    private int tiempo;
    private String Alimento;
    
    
    
    
    public Empleado(String nombreEmp, Semaphore Cap, Semaphore Ing, Almacen Caja, JTextArea Ventana, int tiempo, String Alimento){
        super (nombreEmp);
        this.CapDisponible=Cap;
        this.Ingrediente=Ing;
        this.ventana= Ventana;
        this.Caja = Caja;
        this.tiempo = tiempo*1000;
        this.Alimento = Alimento;
    }
    
    public void run(){
            
        try {
            while(true){
                
                CapDisponible.acquire();
                Thread.sleep(tiempo);
                
                Ingrediente.release();
                ventana.append(super.getName()+" COMPRO "+Alimento+"/n");
            }              
        } catch (InterruptedException ex) {
           Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }

    
    
    
    
}
