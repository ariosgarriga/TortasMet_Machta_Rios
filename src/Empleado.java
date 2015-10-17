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
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Empleado extends Thread{
    
    
    private Almacen caja;
    private JTextArea ventana;
    private Semaphore Vacio;
    private Semaphore Comprado;
    
    public Empleado(String nombre, Semaphore Vacio, Semaphore Comprado, Almacen Al){
        super (nombre);
        this.Vacio=Vacio;
        this.Comprado=Comprado;
        this.ven
    
    }

    
    
    
    
}
