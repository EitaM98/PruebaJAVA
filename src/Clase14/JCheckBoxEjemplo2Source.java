package Clase14;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class JCheckBoxEjemplo2Source extends javax.swing.JFrame implements ActionListener, ChangeListener {
    private JLabel label1;
    private JCheckBox check1;
    private JButton boton1;
    
    public JCheckBoxEjemplo2Source() {
        initComponents();
        setLayout(null);
        label1 = new JLabel ("Estas de acuerdo con las normas del servicio?");
        label1.setBounds(10, 10, 400, 30);
        add(label1);
        check1 = new JCheckBox ("Acepto");
        check1.setBounds(10, 50, 100, 30);
        check1.addChangeListener(this);
        add(check1);
        boton1 = new JButton ("Continuar");
        boton1.setBounds(10, 100, 100, 40);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);
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
    public void stateChanged (ChangeEvent e) {
        if(check1.isSelected()==true) {
            boton1.setEnabled(true);
        } else {
            boton1.setEnabled(false);
        }
    }
    
    public void actionPerformed (ActionEvent e) {
        if(e.getSource()==boton1) {
            System.exit(0);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JCheckBoxEjemplo2Source JCBoxEj2S = new JCheckBoxEjemplo2Source();
                JCBoxEj2S.setBounds(0, 0, 400, 300);
                JCBoxEj2S.setLocationRelativeTo(null);
                JCBoxEj2S.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}