package librerias.estructurasDeDatos.grafos;

/** Clase Adyacente: representa un vertice adyacente a otro de un grafo y el peso 
 *  de la arista que los une.<br>
 *  
 *  @version May 2012
 */
public class Adyacente { 
    protected int destino;
    protected double peso;
    
    /** Construye el vertice v adyacente a otro de un grafo y el peso 
      * de la arista que los une.
      * @param  v Vertice adyacente a otro
      * @param  peso de la arista que une al vertice v y al otro del que es adyacente 
      */
     public Adyacente(int codAdy, double pesoArista) { 
         destino = codAdy;   peso = pesoArista; 
     }
     /** Devuelve el vertice adyacente */
     public int getDestino() { return destino; }
     
     /** Devuelve el peso del arco al vertice adyacente */
     public double getPeso() { return peso; }
     
     /**Devuelve un String que representa a un vertice adyacente a otro y al peso de la arista que los une.
      * @return  String  que representa a un adyacente
      */          
     public String toString() { 
         return destino + "("+ peso+ ") ";
     }
}
