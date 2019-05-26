
package vendedore_unitario;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Objects;


public class Vendedores {
    
     Hashtable<Integer, Vendedor> tb =new Hashtable<>();
     
     //Vendedor ven=new Vendedor(1,"alex","mercado","alicante","elche","calle 123");

     
     public boolean agregar(Vendedor ven){
     int numvend;
      if(!tb.containsKey(ven.getNumvend())){
          tb.put(ven.getNumvend(), ven);
          
          String provin = ven.getProvincia();
          
          return true;
      } else {      return false;     

      }
      }
     
     public  boolean Eliminar_Vendedor(int numvend){
         if(tb.containsKey(numvend)){
            tb.remove(numvend);
            return true;}
         else{ return false;}
    }
     
      public Enumeration<Integer> total(){
          Enumeration<Integer> claves=tb.keys();
          return claves;         
      }
     
     
     public Vendedor buscar_vendedor(int numvend ){
         if(tb.containsKey(numvend)){
              return tb.get(numvend);
      }
          return null;
             
     }  
    
     public Vendedores buscar_vendedor(String provincia ){
         Vendedores buscar=new Vendedores();
         Enumeration e = total();        
         while (e.hasMoreElements() ){
             Vendedor v = (Vendedor) e.nextElement();
             if(v.getProvincia()==provincia){
                 buscar.agregar(v);
             }
            
             }
             return buscar;
         }
                          
     
     public void cargar_datos(String provincia){
        Vendedor ven1 = new Vendedor(1,"alex","mercado","alicante","elche","calle 123");
          Vendedor ven2 = new Vendedor(2,"maria","profesor","alicante","elche","calle 234");
          Vendedor ven3 = new Vendedor(1,"javi","pescadero","alicante","m","calle 12345");
          Vendedor ven4 = new Vendedor(2,"maria","profesor","alicante","elche","calle 23467");
          agregar(ven1);
          agregar(ven2);
          agregar(ven3);
          agregar(ven4);
     
     }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.tb);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedores other = (Vendedores) obj;
        if (!Objects.equals(this.tb, other.tb)) {
            return false;
        }
        return true;
    }
     
         
}
