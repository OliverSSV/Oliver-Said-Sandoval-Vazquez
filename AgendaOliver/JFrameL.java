import javax.swing.*;
import java.awt.*;

public class JFrameL extends JFrame
{
   LoginA log = new LoginA();
   
   public JFrameL()
   {     
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(400, 200);
      setLocationRelativeTo(null);
      setTitle("LOGIN AGENDA");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(log);
      setVisible(true);
   }   
}