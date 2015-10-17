


import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Pastelero extends Thread {

   private  Almacen Caja; 
   private  Semaphore CapDisponible; 
   private  Semaphore Ingrediente;
   private int tiempo; 
    
    
   Pastelero(Almacen Caja,Semaphore CapDisponible,Semaphore Ingrediente,int sleep){
     this.Caja=Caja; 
     this.CapDisponible=CapDisponible; 
     this.Ingrediente=Ingrediente; 
     this.tiempo=sleep*1000;          
   } 
   
   
   public void run(){
    while(true){
      try{
         Ingrediente.acquire();
         Caja.Agarrar();
         CapDisponible.release();
         Thread.sleep(tiempo);
         
      }catch(Exception ex){}       
       
    }
   
    
    
      
  }





}