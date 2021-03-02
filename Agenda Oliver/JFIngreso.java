import javax.swing.*;
import java.awt.*;

public class JFIngreso extends JFrame
{
  IngresoAgenda piA = new IngresoAgenda();

  public JFIngreso()
   {   
      initComponents();
   }

   private void initComponents()
   {
      setSize(300, 200);
      setTitle("Usuario y contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(piA);
      setVisible(true);

   }   
}