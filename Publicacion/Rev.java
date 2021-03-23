
public class Rev extends PublicacionPrograma implements Periodicidad
{
    private String ISSN;
    private int numero;
    private int ano;
    
    public String getISSN(){
     return ISSN;
    }
    
    public void setISSN(String issn){
        ISSN = issn;
    }
    
    public int getNumero(){
     return numero;
    }
    
    public void setNumero(int num){
        numero = num;
    }
    
     public int getAno(){
     return ano;
    }
    
    public void setAno(int year){
        ano = year;
    }
    
   @Override
    public String getPeriodicidad()
    {
     return periodicidad;
    }
        
  }