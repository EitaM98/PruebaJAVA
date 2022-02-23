package Clase14;

import javax.swing.*;
import java.awt.event.*;

public class JMenuEjemplo3Source extends javax.swing.JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1,mi2;
    private JTextField field1,field2;
       
    public JMenuEjemplo3Source() {
        initComponents();
        setLayout(null);
        mb = new JMenuBar ();
        setJMenuBar(mb);
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        mi1 = new JMenuItem("Redimensonar ventana");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2 = new JMenuItem("Salir");
        mi2.addActionListener(this);
        menu1.add(mi2);
        field1 = new JTextField();
        field1.setBounds(10, 10, 100, 30);
        add(field1);
        field2 = new JTextField();
        field2.setBounds(10, 50, 100, 30);
        add(field2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mi1) {
            String aux1=field1.getText();
            String axu2=field2.getText();
            int ancho=Integer.parseInt(aux1);
            int alto=Integer.parseInt(axu2);
            setSize(ancho,alto);
        }
        if(e.getSource()==mi2){
            System.exit(0);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JMenuEjemplo3Source JMEj3S = new JMenuEjemplo3Source();
                JMEj3S.setBounds(0, 0, 300, 200);
                JMEj3S.setLocationRelativeTo(null);
                JMEj3S.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}