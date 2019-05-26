
package vendedore_unitario;


public class Vendedor {

    static int numvend;
    static String nomvend;
    static String nombrecomer;
    static String provincia;
    static String localidad;
    static String direccion;
    

    Vendedor(int num,String nom, String comer, String prov, String loc, String di) {
    numvend=num;
    nomvend=nom;
    nombrecomer=comer;
    provincia=prov; 
    localidad=loc;
    direccion=di;   
    }
    Vendedor(){}

    public  int getNumvend() {
        return numvend;
    }

    public  void setNumvend(int numvend) {
        numvend = numvend;
    }

    public static String getNomvend() {
        return nomvend;
    }

    public  void setNomvend(String nomvend) {
        this.nomvend = nomvend;
    }

    public String getNombrecomer() {
        return nombrecomer;
    }

    public void setNombrecomer(String nombrecomer) {
        this.nombrecomer = nombrecomer;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
  
}
