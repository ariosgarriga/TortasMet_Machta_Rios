


import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Pastelero extends Thread {

   protected Almacen CajaH;
   protected Almacen CajaL;
   protected Almacen CajaA;
   protected ArrayList<Integer> pedidos ;
   protected JTextArea ventana;
   protected boolean run = true;
   protected JDialog Fin;

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
   
    
    
   Pastelero(Almacen H, Almacen A, Almacen L, ArrayList Lista, JTextArea ventana, JDialog Fin){
        CajaH=H;
        CajaL=L;
        CajaA=A;
        pedidos=Lista;
        this.ventana=ventana;
        this.Fin=Fin;
        
   } 
   
   
   public void run(){
        
        while(!pedidos.isEmpty()){
                
            try {
                if(run){
                    int aux= pedidos.remove(0);
                    System.out.println(pedidos);
                    
                    if(aux==1){

                        CajaH.Ingrediente.acquire();
                        CajaH.CapDisponible.release();
                        CajaH.Agarrar();
                        ventana.append("--El Pastelero agarro 1 HARINA--\n");
                        CajaL.Ingrediente.acquire(2);
                        CajaL.CapDisponible.release(2);                       
                        CajaL.Agarrar();
                        CajaL.Agarrar();
                        ventana.append("--El Pastelero agarro 2 LECHES--\n");
                        Thread.sleep(15000);
                        CajaA.Ingrediente.acquire();
                        CajaA.CapDisponible.release();
                        CajaA.Agarrar();
                        ventana.append("--El Pastelero agarro 1 AZUCAR--\n");
                        Thread.sleep(10000);
                        ventana.append("***Se hizo un pastel de tipo 1****\n");
                    }
                    else{
                        CajaH.Ingrediente.acquire();
                        CajaH.CapDisponible.release();
                        CajaH.Agarrar();
                        ventana.append("--El Pastelero agarro 1 HARINA--\n");
                        CajaL.Ingrediente.acquire();
                        CajaL.CapDisponible.release();
                        CajaL.Agarrar();
                        ventana.append("--El Pastelero agarro 1 LECHES--\n");
                        Thread.sleep(10000);
                        CajaA.Ingrediente.acquire(3);
                        CajaA.CapDisponible.release(3);
                        CajaA.Agarrar();
                        CajaA.Agarrar();
                        CajaA.Agarrar();
                        ventana.append("--El Pastelero agarro 3 AZUCAR--\n");
                        Thread.sleep(15000);
                        ventana.append("***Se hizo un pastel de tipo 2****\n");
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Pastelero.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("---NO HAY MAS PEDIDOS---\n");
            }
                System.out.print("");
        }
        ventana.append("---NO HAY MAS PEDIDOS---\n");
        Fin.pack();
        Fin.setVisible(true);
    }

 


}