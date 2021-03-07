import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginA extends JPanel implements ActionListener
{
   private JButton btnIngresar, btnSalir;
   private JTextField txtUser;
   private JPasswordField contra;
   
   public LoginA()
   {
      setLayout(new GridLayout(3, 2));
      JLabel lblUser = new JLabel("USUARIO:   ", JLabel.RIGHT);
      txtUser = new JTextField(20);
      add(lblUser);
      add(txtUser);
      
      JLabel lblContra = new JLabel("CONTRASENA:   ", JLabel.RIGHT);
      contra = new JPasswordField(20);
      contra.setToolTipText("INGRESE LA CONTRASENA:");
      add(lblContra);
      add(contra);
      
      btnIngresar = new JButton("INGRESAR");
      btnIngresar.addActionListener(this);
      btnIngresar.setMnemonic('I');
      
      btnSalir = new JButton("SALIR");
      btnSalir.addActionListener(this);
      btnSalir.setMnemonic('S');
      
      add(btnIngresar);
      add(btnSalir);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      String usuario = txtUser.getText();
      String password = new String(contra.getPassword());
      
      if(e.getSource() == btnIngresar)
      {
         if(usuario.isEmpty() && password.isEmpty())
         {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR NOMBRE Y CONTRASENA");
            txtUser.requestFocus();
         }
         else
         {
            if(usuario.equals("OliverSandoval") && password.equals("12345"))
            {
               JOptionPane.showMessageDialog(null, "AGENDA");
               JFrameP panel = new JFrameP();
            }
            else 
            {
               JOptionPane.showMessageDialog(null, "USUARIO O CONTRASENA INCORRECTO","CUIDADO", JOptionPane.WARNING_MESSAGE);
               txtUser.setText(null);
               contra.setText(null);
               txtUser.requestFocus();
            }
         }
      } 
      
      if(e.getSource() == btnSalir)
      {
         System.exit(0);
      } 
   }
}