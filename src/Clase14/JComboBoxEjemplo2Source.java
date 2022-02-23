package Clase14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxEjemplo2Source extends JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JComboBox combo1, combo2, combo3;
    private JButton boton1, boton2;

    public JComboBoxEjemplo2Source() {
        initComponents();
        setLayout(null);
        label1 = new JLabel ("Rojo:");
        label1.setBounds(10, 10, 100, 30);
        add(label1);
        combo1 = new JComboBox ();
        combo1.setBounds(120,10,50,30);
        for(int f=0;f<=255;f++) {
            combo1.addItem(String.valueOf(f));
        }
        add(combo1);
        label2 = new JLabel ("Verde:");
        label2.setBounds(10, 50, 100, 30);
        add(label2);
        combo2 = new JComboBox ();
        combo2.setBounds(120, 50, 50, 30);
        for(int f=0;f<=255;f++) {
            combo2.addItem(String.valueOf(f));
        }
        add(combo2);
        label3 = new JLabel ("Azul:");
        label3.setBounds(10, 90, 100, 30);
        add(label3);
        combo3 = new JComboBox ();
        combo3.setBounds(120, 90, 50, 30);
        for(int f=0;f<=255;f++) {
            combo3.addItem(String.valueOf(f));
        }
        add(combo3);
        boton1 = new JButton ("Fijar color");
        boton1.setBounds(10, 130, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        boton2 = new JButton ("Cerrar");
        boton2.setBounds(10, 200, 100, 30);
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
    public void actionPerformed (ActionEvent e) {
        if (e.getSource()==boton1) {
            String aux1 = (String)combo1.getSelectedItem();
            String aux2 = (String)combo2.getSelectedItem();
            String aux3 = (String)combo3.getSelectedItem();
            int rojo = Integer.parseInt(aux1);
            int verde = Integer.parseInt(aux2);
            int azul = Integer.parseInt(aux3);
            Color color1= new Color(rojo, verde, azul);
            boton1.setBackground(color1);
        }
        if (e.getSource()==boton2) {
            System.exit(0);
        }
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JComboBoxEjemplo2Source JCBEj2S = new JComboBoxEjemplo2Source();
                JCBEj2S.setBounds(0, 0, 400, 300);
                JCBEj2S.setLocationRelativeTo(null);
                JCBEj2S.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
