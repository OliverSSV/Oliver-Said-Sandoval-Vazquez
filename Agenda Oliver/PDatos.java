import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PDatos extends JPanel implements ActionListener


{
       private JButton btnAceptar, btnCancelar;
      private JTextField txtNombre, txtApellidos, txtTelefono;
       private JRadioButton amigo, conocido;
          Manejo mpA = new Manejo();
             JFMostrar jfm;

    public PDatos()
    {
      setLayout(new GridLayout(5,2));
      JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
      txtNombre = new JTextField(20);
      add(lblNombre);
      add(txtNombre);
      JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
         txtApellidos = new JTextField(30);
      add(lblApellidos);
      add(txtApellidos);
      JLabel lblTelefono = new JLabel("Celular: ", JLabel.RIGHT);
      txtTelefono = new JTextField(15);
      add(lblTelefono);
      add(txtTelefono);
    
      ButtonGroup gpoBotones = new ButtonGroup();
      amigo = new JRadioButton("Amigo", true);
      conocido = new JRadioButton("Conocido");
      gpoBotones.add(amigo);
      gpoBotones.add(conocido);
      
      add(amigo);
      add(conocido);
   
       btnAceptar = new JButton("Guardar");
       btnAceptar.addActionListener(this);
       btnCancelar = new JButton("Cancelar");
       btnCancelar = new JButton("Mostrar");
       btnCancelar.addActionListener(this);

      add(btnAceptar);
      add(btnCancelar);
   }
  
   public void actionPerformed(ActionEvent e) {
     String tipo = "Amigo";
     if(conocido.isSelected())
        tipo="Conocido";
        
     if (e.getSource()==btnAceptar) {
         if (txtNombre.getText()==null||txtNombre.getText().isEmpty())
          { 
            JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
           txtNombre.requestFocus();
          }
         else
           if(txtTelefono.getText()==null||txtTelefono.getText().isEmpty()) 
           {
           JOptionPane.showMessageDialog(null, "Debes capturar su tel�fono",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
            }  
          else
          {  
            mpA.agregar(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(), tipo);
		  		JOptionPane.showMessageDialog(null, "Se guardar�n los datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);		
            txtTelefono.setText("");
            txtApellidos.setText("");
            txtNombre.requestFocus();
          }
      }

      if (e.getSource()==btnCancelar) {
         mpA.mostrar();
			System.exit(0);
          jfm = new JFrameMostrar();
		}
	}
}