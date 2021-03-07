import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelD extends JPanel implements ActionListener
{
   JButton btnAlta, btnBuscar, btnModificar, btnEliminar, btnContactos, btnSalir, btnFinalizar;
   JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;
   ControlP contactos = new ControlP();
   Persona contacto;
   JFrameMC jfmc;
   boolean ban = true;
  
   public PanelD()
   { 
      setLayout(new GridLayout(9,2));
      JLabel lblNombre = new JLabel("NOMBRE:   ", JLabel.RIGHT);
      txtNombre = new JTextField(30);
      txtNombre.setEditable(false);
      add(lblNombre);
      add(txtNombre);
     
      JLabel lblTelefono = new JLabel("TELEFONO:   ", JLabel.RIGHT);
      txtTelefono = new JTextField(30);
      txtTelefono.setEditable(false);
      add(lblTelefono);
      add(txtTelefono);
     
      JLabel lblCorreo = new JLabel("CORREO:   ", JLabel.RIGHT);
      txtCorreo = new JTextField(30);
      txtCorreo.setEditable(false);
      add(lblCorreo);
      add(txtCorreo);
     
      JLabel lblCumple = new JLabel("CUMPLEANOS:   ", JLabel.RIGHT);
      txtCumple = new JTextField(30);
      txtCumple.setEditable(false);
      add(lblCumple);
      add(txtCumple);
      
      btnFinalizar = new JButton("FINALIZAR");
      btnFinalizar.addActionListener(this);
      btnFinalizar.setMnemonic('F');
      
      btnSalir = new JButton("SALIR");
      btnSalir.addActionListener(this);
      btnSalir.setMnemonic('S');
      
      btnAlta = new JButton("ALTA");
      btnAlta.addActionListener(this);
      btnAlta.setMnemonic('A');
      
      btnBuscar = new JButton("BUSCAR");
      btnBuscar.addActionListener(this);
      btnBuscar.setMnemonic('B');
      
      btnModificar = new JButton("MODIFICAR");
      btnModificar.addActionListener(this);
      btnModificar.setMnemonic('M');
      
      btnEliminar = new JButton("ELIMINAR");
      btnEliminar.addActionListener(this);
      btnEliminar.setMnemonic('E');
      
      btnContactos = new JButton("CONTACTOS");
      btnContactos.addActionListener(this);
      btnContactos.setMnemonic('C');
      
      JLabel espacio = new JLabel();
      JLabel espacio2 = new JLabel();
     
      add(btnFinalizar);
      add(btnSalir);
      add(espacio);
      add(espacio2);
      add(btnAlta);
      add(btnBuscar);
      add(btnModificar);
      add(btnEliminar);
      add(btnContactos);
   }
  
   public void actionPerformed(ActionEvent e)
   {
      txtNombre.requestFocus();
      if(e.getSource() == btnFinalizar)
      {
         activarBtns(true);
         activarCampos(false);
         limpiarCampos();
         ban = true;
      } 
      
      if(e.getSource() == btnSalir)
      {
         contactos.actualizarFichero(); 
         System.exit(0);
      } 
      
      if (e.getSource() == btnAlta) 
      {    
         if(ban) 
         {       
            activarBtns(false);
            activarCampos(true);
            btnAlta.setEnabled(true);
            ban = false;
         }
         else          {
            if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(null, "DEBE COLOCAR EL NOMBRE",
               "ATENCION!!!", JOptionPane.INFORMATION_MESSAGE);
            }
            else
               if(txtTelefono.getText() == null || txtTelefono.getText().isEmpty())
               {
                  JOptionPane.showMessageDialog(null, "SE DEBE COLOCAR EL TELEFONO",
                  "ATENCION!!!", JOptionPane.INFORMATION_MESSAGE);
                  txtTelefono.requestFocus();
               }
               else
               {
                  contactos.agregar(txtNombre.getText(), txtTelefono.getText(), txtCorreo.getText(), txtCumple.getText());
                  JOptionPane.showMessageDialog(null, "SE HA DADO DE ALTA EL CONTACTO", "ALTA", JOptionPane.INFORMATION_MESSAGE);	
                  limpiarCampos();
               }
          }
      } 
      
      if(e.getSource() == btnBuscar)
      {
         if(ban)
         {
            activarBtns(false);
            txtNombre.setEditable(true);
            btnBuscar.setEnabled(true);
            ban = false;
         }
         else
         {
            if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(null, "DEBE COLOCAR SU NOMBRE",
               "ATENCION!!!", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
               contacto = contactos.buscarContacto(txtNombre.getText());
               if(contacto != null)
               {
                  txtNombre.setText(contacto.getNombre());
                  txtTelefono.setText(contacto.getTelefono());
                  txtCorreo.setText(contacto.getCorreo());
                  txtCumple.setText(contacto.getCumple());
                  contacto = null;
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA ESE CONTACTO",
                  "BUSCAR CONTACTO", JOptionPane.INFORMATION_MESSAGE);   
                  limpiarCampos();
               } 
            }  
         } 
      } 
      
      if(e.getSource() == btnModificar)
      {
         if(ban)
         {
            activarBtns(false);
            txtNombre.setEditable(true);
            btnModificar.setEnabled(true);
            ban = false;
         }
         else
         {
            if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(null, "DEBE COLOCAR EL NOMBRE",
               "ATENCION!!!", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
               if(contacto == null)
               {
                  contacto = contactos.buscarContacto(txtNombre.getText());
                  if(contacto != null)
                  {
                     activarCampos(true);
                     txtNombre.setText(contacto.getNombre());
                     txtTelefono.setText(contacto.getTelefono());
                     txtCorreo.setText(contacto.getCorreo());
                     txtCumple.setText(contacto.getCumple());
                  }
                  else
                  {
                     JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA EL CONTACTO",
                     "BUSCAR CONTACTO", JOptionPane.INFORMATION_MESSAGE);   
                     limpiarCampos();
                  } 
               }
               else
                  if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
                  {
                     JOptionPane.showMessageDialog(null, "DEBE COLOCAR EL NOMBRE",
                     "ATENCION!!!", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else
                     if(txtTelefono.getText() == null || txtTelefono.getText().isEmpty())
                     {
                        JOptionPane.showMessageDialog(null, "DEBE COLOCAR EL TELEFONO",
                        "ATENCION!!!", JOptionPane.INFORMATION_MESSAGE);
                        txtTelefono.requestFocus();
                     }
                     else
                     {
                        contactos.modificarContacto(txtNombre.getText(), txtTelefono.getText(),
                        txtCorreo.getText(), txtCumple.getText());
                        JOptionPane.showMessageDialog(null, "SE HAN GUARDADO LOS CAMBIOS",
                        "MODIFICAR CONTACTO", JOptionPane.INFORMATION_MESSAGE);   
                        txtNombre.requestFocus();
                        activarCampos(false);
                        txtNombre.setEditable(true);
                        contacto = null;
                        limpiarCampos();
                     }    
            }
         }
      } 
      
      if(e.getSource() == btnEliminar)
      {
         if(ban)
         {
            activarBtns(false);
            txtNombre.setEditable(true);
            btnEliminar.setEnabled(true);
            ban = false;
         }
         else
         {
            if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(null, "DEBE COLOCAR EL NOMBRE",
               "ATENCION!!!", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
               contacto = contactos.buscarContacto(txtNombre.getText());
               if(contacto != null)
               {
                  txtNombre.setText(contacto.getNombre());
                  txtTelefono.setText(contacto.getTelefono());
                  txtCorreo.setText(contacto.getCorreo());
                  txtCumple.setText(contacto.getCumple());
                  contacto = null;
                  
                  int opcion = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR EL CONTACTO?", "ATENCION!!!",
                               JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                  if(opcion == JOptionPane.YES_OPTION)
                  {
                     contactos.eliminarContacto();
                     JOptionPane.showMessageDialog(null, "EL CONTACTO SE HA ELIMINADO CON EXITO",
                     "ELIMINAR CONTACTO", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else
                     JOptionPane.showMessageDialog(null, "OPERACION CANCELADA",
                     "ELIMINAR CONTACTO", JOptionPane.INFORMATION_MESSAGE);
                  limpiarCampos();  
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA EL CONTACTO",
                  "BUSCAR CONTACTO", JOptionPane.INFORMATION_MESSAGE);   
                  limpiarCampos();
               } 
            }  
         }   
      } 
      
      if(e.getSource() == btnContactos)
      {
         jfmc = new JFrameMC();
      }
      
   } 
    
   public void limpiarCampos()
   {
      txtNombre.setText("");
      txtTelefono.setText("");
      txtCorreo.setText("");
      txtCumple.setText("");
   }
   
   public void activarBtns(boolean ban)
   {
      btnAlta.setEnabled(ban);
      btnBuscar.setEnabled(ban);
      btnModificar.setEnabled(ban);
      btnEliminar.setEnabled(ban);
      btnContactos.setEnabled(ban);
      btnSalir.setEnabled(ban);
   }
   
   public void activarCampos(boolean ban)
   {
      txtNombre.setEditable(ban);
      txtTelefono.setEditable(ban);
      txtCorreo.setEditable(ban);
      txtCumple.setEditable(ban);
   }
}