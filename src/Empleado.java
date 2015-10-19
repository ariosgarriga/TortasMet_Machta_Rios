import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Empleado extends Thread{

    private Almacen Caja;
    private JTextArea ventana;
    private int tiempo;
    private String Alimento;
    boolean run=true;

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    
    

    public Empleado( Almacen Caja, JTextArea Ventana, int tiempo, String Alimento){
        
        this.ventana= Ventana;
        this.Caja = Caja;
        this.tiempo = tiempo*1000;
        this.Alimento = Alimento;
        
    }

    
    public void run(){
           
        try {
                while(true){
                    
                    if(run){
                        System.out.println("Entro "+Alimento);
                        Caja.CapDisponible.acquire();
                        Thread.sleep(tiempo);
                        ventana.append("SE COMPRO "+Alimento+"\n");
                        Caja.Ingrediente.release();
                        Caja.Comprar(Alimento);
                        
                        
                    }
                    System.out.print("");
                }    
        } catch (InterruptedException ex) {
                Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

  
}
