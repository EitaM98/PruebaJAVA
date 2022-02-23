package Clase14;

import javax.swing.*;
import java.awt.event.*;

public class JButtonEjemplo2Source extends javax.swing.JFrame implements ActionListener {
    private JButton boton1, boton2, boton3;
    public JButtonEjemplo2Source() {
        initComponents();
        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10, 100, 90, 30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("2");
        boton2.setBounds(110, 100, 90, 30);
        add(boton2);
        boton2.addActionListener(this);
        boton3=new JButton("3");
        boton3.setBounds(210, 100, 90, 30);
        add(boton3);
        boton3.addActionListener(this);
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
        if (e.getSource()==boton1) {
            this.setTitle("Boton 1");
        }
        if (e.getSource()==boton2) {
            this.setTitle("Boton 2");
        }
        if (e.getSource()==boton3) {
            this.setTitle("Boton 3");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JButtonEjemplo2Source JBEj2S = new JButtonEjemplo2Source();
                JBEj2S.setBounds(0, 0, 350, 200);
                JBEj2S.setLocationRelativeTo(null);
                JBEj2S.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}