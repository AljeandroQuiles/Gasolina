package vendedore_unitario;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


          
   
    @RunWith(Parameterized.class)
    public  class ParamVendedor{
           
         @Parameterized.Parameters
         public static Iterable data(){
         return Arrays.asList(new Object[][]{{1,true},{2,true},{3,true},{4,true},{5,false}});       
         
         } 
        Vendedores vends = new Vendedores();

        public   void setUp(){
        
          Vendedor ven1 = new Vendedor(1,"alex","mercado","alicante","elche","calle 123");
          Vendedor ven2 = new Vendedor(2,"maria","profesor","alicante","elche","calle 234");
          Vendedor ven3 = new Vendedor(1,"javi","pescadero","alicante","m","calle 12345");
          Vendedor ven4 = new Vendedor(2,"maria","profesor","alicante","elche","calle 23467");
          vends.agregar(ven1);
          vends.agregar(ven2);
          vends.agregar(ven3);
          vends.agregar(ven4);   
    }
              
        int metido;
        boolean resultado;
        public ParamVendedor(int esperad, boolean resultad){
            this.metido=esperad;
            this.resultado=resultad;        
        }    
             
        @Test
        public void Eliminar_Vendedor(){    
             boolean result=vends.Eliminar_Vendedor(metido);
             Assert.assertEquals(result, resultado);}

    } 

            
            
            
    

            
            
            
            
