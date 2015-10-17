

import javax.swing.JPanel;

public class Almacen {
    String[] Caja; 
    int pVacia; 
    int pLLena; 
    
    
    
    Almacen(String[] Caja){
    this.Caja=Caja;     
    pVacia=0; 
    pLLena=0;
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
