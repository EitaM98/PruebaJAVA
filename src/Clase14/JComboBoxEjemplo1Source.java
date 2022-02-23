package Clase14;

import javax.swing.*;
import java.awt.event.*;

public class JComboBoxEjemplo1Source extends JFrame implements ActionListener{
    private JComboBox combo1;
    private JButton boton1;
    
    public JComboBoxEjemplo1Source() {
        initComponents();
        setLayout(null);
        combo1 = new JComboBox();
        combo1.setBounds(10, 10, 80, 20);
        combo1.addItem("Rojo");
        combo1.addItem("Azul");
        combo1.addItem("Verde");
        combo1.addItem("Naranja");
        combo1.addItem("Violeta");
        add(combo1);
        combo1.addActionListener(this);
        boton1 = new JButton ("Cerrar");
        boton1.setBounds(80, 100, 80, 20);
        add(boton1);
        boton1.addActionListener(this);
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
    public void actionPerformed (ActionEvent e) {
        if(e.getSource()==combo1) {
            String seleccionado=(String)combo1.getSelectedItem();
            this.setTitle(seleccionado);
        }
        if(e.getSource()==boton1) {
            System.exit(0);
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JComboBoxEjemplo1Source JCBEj1S = new JComboBoxEjemplo1Source();
                JCBEj1S.setBounds(0, 0, 300, 200);
                JCBEj1S.setLocationRelativeTo(null);
                JCBEj1S.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}