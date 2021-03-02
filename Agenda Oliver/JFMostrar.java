import javax.swing.*;
import java.awt.*;

public class JFMostrar extends JFrame
{
   Mostrar mostrar = new Mostrar();

    public JFMostrar()
   {  
      
      initComponents();
   }

   private void initComponents()
   {
      
      setSize(300, 200);
      setTitle("Contactos Registrados");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);

   }   
}