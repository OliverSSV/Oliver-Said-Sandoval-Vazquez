import javax.swing.*;
import java.awt.*;

public class JFDatos extends JFrame
{
   PDatos pdA = new PDatos();
      public JFDatos()
   {     initComponents();
   }

   private void initComponents()
   {
      setSize(300, 200);
      setTitle("Datos Personales");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pdA);
      setVisible(true);
   }   
}