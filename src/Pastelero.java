


import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Pastelero extends Thread {

   private Almacen CajaH;
   private Almacen CajaL;
   private Almacen CajaA;
   private ArrayList pedidos;
   
    
    
   Pastelero(Almacen H, Almacen A, Almacen L, ArrayList Lista){
        CajaH=H;
        CajaL=L;
        CajaA=A;
        pedidos=Lista;
   } 
   
   
   public void run(){
    while(true){
      try{
          
          
          
         /*Ingrediente.acquire();
         Caja.Agarrar();
         CapDisponible.release();
         Thread.sleep(tiempo);*/
         
      }catch(Exception ex){}       
       
    }
   
    
    
      
  }





}