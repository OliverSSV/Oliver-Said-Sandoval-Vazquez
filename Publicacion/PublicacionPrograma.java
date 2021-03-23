
public abstract class PublicacionPrograma {
    private String titulo;
    private int numeroP;
    private double precio;
     
    public String getTitulo(){
     return titulo;
    }
    
    public void setTitulo(String titu){
        titulo = titu;
    }
    public int getNumpag(){
     return numeroP;
    }
    
    public void setNumpag(int np){
        numeroP = np;
    }
    
    public double getPrecio(){
     return precio;
    }
    
    public void setPrecio(double pre){
        precio = pre;
    }
    
}