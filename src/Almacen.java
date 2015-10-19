

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JPanel;

public class Almacen {
    public String[] Caja; 
    public int pVacia; 
    public int pLLena; 
   
    public Semaphore CapDisponible;
    public Semaphore Ingrediente;
    
    
    
    Almacen(int cant){
        Caja = new String[cant];    
        pVacia=0; 
        pLLena=0;
        CapDisponible = new Semaphore(cant);
        Ingrediente = new Semaphore(0);
    }
    
    synchronized public void Comprar(String alimento){ //Se Agregra alimento en una posicion vacia de la caja
      Caja[pVacia]=alimento;
      pVacia= (pVacia+1) % Caja.length; 
      
    }
    
    
    synchronized public String Agarrar(){
        String alimento=Caja[pLLena];
        pLLena=(pLLena+1)%Caja.length;        
        return alimento;
    }    
    
}
