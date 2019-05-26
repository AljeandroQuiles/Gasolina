
package vendedore_unitario;


public class DB_Tabla_Vendedores {
    static String conexion;
    
    DB_Tabla_Vendedores(String conex){conexion=conex;}
    
    public static boolean anyadir_vendedor(Object Vendedor){
    return true;
    }
    
    public static boolean Modificar_vendedor(int numvend){
    return true;
    }
    
     public static boolean borrar_vendedor(int numvend){
    return true;
    }
    public static Vendedor buscar_vendedor(String provincia){
    return null;
    }
    public static void Desconectar(){}

    DB_Tabla_Vendedores() {
    }
    
    
    
}

