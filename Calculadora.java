import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    private JButton b1;
    
    private JTextField texto1; 
    
    private JButton b2;
    private JButton b3;
    private JButton b4;
    
    private JTextField texto2;
    private JTextField texto3;


    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        cal.setTitle("Calculadora Grafica _ Oliver Said Sandoval Vazquez");

        cal.setVisible(true);

        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cal.setSize(500, 300);
    }

    public Calculadora() {
        JPanel panel1 = new JPanel();

        b1 = new JButton(" + ");
        b2 = new JButton(" - ");
        b3 = new JButton(" * ");
        b4 = new JButton(" / ");
        texto1 = new JTextField(20);
        texto2 = new JTextField(20);
        texto3 = new JTextField(10);


        ListenForButton listenForButton = new ListenForButton();
        b1.addActionListener(listenForButton);
        b2.addActionListener(listenForButton);
        b3.addActionListener(listenForButton);
        b4.addActionListener(listenForButton);

        panel1.add(texto1);
        panel1.add(texto2);
        panel1.add(texto3);

        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);

        this.add(panel1);
    }

    private class ListenForButton implements ActionListener {


    
        public void actionPerformed(ActionEvent e) {
            //1
            double n1 = 0;
            double n2 = 0;

            //2
            try {
                n1 = Double.parseDouble(texto1.getText());
                n2 = Double.parseDouble(texto2.getText());
            } catch (Exception error) {
                error.printStackTrace();
            }

            //3
            if (e.getSource() == b1) {
                texto3.setText(n1 + n2 + " ");
            } else if (e.getSource() == b2) {
                texto3.setText(n1 - n2 + " ");
            } else if (e.getSource() == b3) {
                texto3.setText(n1 * n2 + " ");
            } else if (e.getSource() == b4) {
                texto3.setText(n1 / n2 + " ");
            }
        }
    }
}