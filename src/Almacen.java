

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Almacen {
    private String[] Caja; 
    private int pVacia; 
    private int pLLena;
    private JProgressBar Barra;
    private String name;
   
    Semaphore CapDisponible;
    Semaphore Ingrediente;
    
    
    
    Almacen(int cant, JProgressBar Barra, String name){
        Caja = new String[cant];    
        pVacia=0; 
        pLLena=0;
        CapDisponible = new Semaphore(cant);
        Ingrediente = new Semaphore(0);
        this.Barra=Barra;
        this.name=name;
    }
    
    synchronized public void Comprar(String alimento){ //Se Agregra alimento en una posicion vacia de la caja
      Caja[pVacia]=alimento;
      pVacia= (pVacia+1) % Caja.length; 
      Barra.setValue(Ingrediente.availablePermits());
      Barra.setString(name+": "+String.valueOf(Ingrediente.availablePermits()));
    }
    
    
    synchronized public String Agarrar(){
        String alimento=Caja[pLLena];
        pLLena=(pLLena+1)%Caja.length;
        Barra.setValue(Ingrediente.availablePermits());
        Barra.setString(name+": "+String.valueOf(Ingrediente.availablePermits()));
        return alimento;
    }    
    
}
