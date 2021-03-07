import javax.swing.*;
import java.awt.*;

public class JFrameMC extends JFrame
{
   MostrarC mostrar = new MostrarC();
   
   public JFrameMC()
   {     
      initComponents();  
   }
   
   private void initComponents()
   {
      setSize(250, 300);
      setLocationRelativeTo(null);
      setTitle("CONTACTOS REGISTRADOS");
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
   }   
}