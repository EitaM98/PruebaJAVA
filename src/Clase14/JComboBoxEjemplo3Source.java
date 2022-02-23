package Clase14;

import javax.swing.*;
import java.awt.event.*;

public class JComboBoxEjemplo3Source extends javax.swing.JFrame implements ActionListener {
    private JLabel label1, label2;
    private JComboBox combo1;
    private JTextField field1;
    private JButton boton1, boton2;

    public JComboBoxEjemplo3Source() {
        initComponents();
        label1 = new JLabel ("Nombre:");
        label1.setBounds(10, 10, 100, 30);
        add(label1);
        field1 = new JTextField();
        field1.setBounds(150, 10, 100, 30);
        add(field1);
        label2 = new JLabel ("Pais:");
        label2.setBounds(10, 50, 100, 30);
        add(label2);
        combo1 = new JComboBox();
        combo1.setBounds(150, 50, 100, 30);
        combo1.addItem("Argentina");
        combo1.addItem("Brasil");
        combo1.addItem("España");
        combo1.addItem("Italia");
        combo1.addItem("Uruguay");
        add(combo1);
        boton1 = new JButton ("Confirmar");
        boton1.setBounds(100, 100, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        boton2 = new JButton ("Cerrar");
        boton2.setBounds(250, 150, 100, 30);
        add(boton2);
        boton2.addActionListener(this);
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
        if (e.getSource()==boton1) {
            String nombre=field1.getText();
            String pais=(String)combo1.getSelectedItem();
            this.setTitle(nombre+" - "+pais);
        }
        if (e.getSource()==boton2) {
            System.exit(0);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JComboBoxEjemplo3Source JCBEj3SC = new JComboBoxEjemplo3Source();
                JCBEj3SC.setBounds(0, 0, 400, 300);
                JCBEj3SC.setLocationRelativeTo(null);
                JCBEj3SC.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}