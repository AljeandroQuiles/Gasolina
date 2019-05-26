
package vendedore_unitario;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


 @RunWith(Parameterized.class)
public class ParamVendedorBuscar {
    
     public   void setUp(){
        
          Vendedor ven1 = new Vendedor(1,"alex","mercado","alicante","elche","calle 123");
          Vendedor ven2 = new Vendedor(2,"maria","profesor","alicante","elche","calle 234");
          Vendedor ven3 = new Vendedor(1,"javi","pescadero","alicante","m","calle 12345");
          Vendedor ven4 = new Vendedor(2,"maria","profesor","castellon","elche","calle 23467");
          vends.agregar(ven1);
          vends.agregar(ven2);
          vends.agregar(ven3);
          vends.agregar(ven4);   
          vprueba.agregar(ven1);
          vprueba.agregar(ven2);
          vprueba.agregar(ven3);
    }              
         Vendedores vends = new Vendedores();
         static Vendedores vprueba=new Vendedores();
         String provincia;   
     @Parameterized.Parameters
         public static Iterable data(){
         return Arrays.asList(new Object[][]{{"Alicante",vprueba}});               
         }
         
         public ParamVendedorBuscar(String provincia, Vendedores vprueba){
             this.provincia=provincia;
             this.vprueba=vprueba;
         }
        
         @Test
         public void buscar_vendedor(){
         vprueba = vends.buscar_vendedor(provincia);
         Assert.assertEquals(vends,vprueba);
         }

         
                 
      
          
    

    
    
    
}
