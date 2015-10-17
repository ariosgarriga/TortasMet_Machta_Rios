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

public class Comprador extends Thread{
    
    
    private Almacen caja;
    private JTextArea area;
    private Semaphore Vacios;
    private Semaphore Comprados;
    
    public Comprador(String nombre, Semaphore Vacio, Semaphore Comprado, Almacen Al){
        Super 
    
    }
    
    
    
}
