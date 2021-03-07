import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameP extends JFrame
{
   PanelD pd = new PanelD();
   
   public JFrameP()
   {     
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(400, 300);
      setLocationRelativeTo(null);
      setTitle("DATOS PERSONALES");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pd);
      setVisible(true);
      JOptionPane.showMessageDialog(null,
      "1.- SELECCIONA UNA OPCION A REALIZAR\n2.- INGRESA LOS DATOS NECESARIOS Y VUELVE A PULSAR EL MISMO BOTON\n3.- PRESIONA FINALIZAR PARA USAR OTRA OPCION ",
      "INSTRUCCIONES DEL PROGRAMA", JOptionPane.INFORMATION_MESSAGE);

      addWindowListener(new WindowAdapter()                                      
      {                                     
         public void windowClosing(WindowEvent e)
         {
            pd.contactos.actualizarFichero();
         }
      });
   }   
}