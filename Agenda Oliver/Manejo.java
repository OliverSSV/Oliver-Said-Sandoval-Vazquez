import java.util.*;
public class Manejo
{
   static ArrayList<Persona> Arrperson = new ArrayList<Persona>(); 
   private Persona objPersona;
   
   public Manejo()
   {  }
   
   public void agregar(String nom, String ap, String tel, String tipo)
   {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setApellidos(ap);
    objPersona.setTelefono(tel);
    objPersona.setTipo(tipo);
    Arrperson.add(objPersona);
   }

  public ArrayList datos()
   {
     return Arrperson;
   }

     }
 