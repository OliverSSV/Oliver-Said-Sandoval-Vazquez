public class LibroPublicacion extends PublicacionPrograma
{
    private String ISBN;
    private String edicion;
    private String autor;
       
    public String getISBN(){
     return ISBN;
    }
    
    public void setISBN(String isbn){
       ISBN = isbn;
    }
    
    public String getEdicion(){
     return edicion;
    }
    
    public void setEdicion(String edi){
        edicion = edi;
    }
    
     public String getAutor(){
     return autor;
    }
    
    public void setAutor(String aut){
        autor = aut;
    }

}