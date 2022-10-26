
package foco;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Foco extends JFrame implements ActionListener{
    Icon Prendido = new ImageIcon("prendido.png");
    Icon Apagado = new ImageIcon("apagado.png");
    JLabel foco = new JLabel("apagado");
    static JButton boton = new JButton("Prender");
    
    public Foco(){
        setSize(200,300);
        setLayout(new FlowLayout());
        add(boton);
        add(foco);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void ActionPerformed(ActionEvent event){
        if(foco.getIcon().equals(Apagado)){
            foco.setIcon(Prendido);
            boton.setText("Apagar");
            boton.setBackground(Color.yellow);
        }else{
            foco.setIcon(Apagado);
            boton.setText("Prender");
            boton.setBackground(Color.gray);
        }
        
    }

    
    public static void main(String[] args) {
        Foco ejemplo = new Foco();
        boton.addActionListener(ejemplo);
        ejemplo.setVisible(true);
      
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
