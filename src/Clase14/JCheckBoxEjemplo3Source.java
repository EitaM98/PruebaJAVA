package Clase14;

import javax.swing.*;
import java.awt.event.*;

public class JCheckBoxEjemplo3Source extends javax.swing.JFrame implements ActionListener{
    private JCheckBox check1, check2, check3;
    private JButton boton1, boton2;
    
    public JCheckBoxEjemplo3Source() {
        initComponents();
        setLayout(null);
        check1 = new JCheckBox("Google Chrome");
        check1.setBounds(10, 10, 150, 30);
        add(check1);
        check2 = new JCheckBox("Brave");
        check2.setBounds(10, 50, 100, 30);
        add(check2);
        check3=new JCheckBox("Mozilla Firefox");
        check3.setBounds(10, 90, 150, 30);
        add(check3);
        boton1 = new JButton ("Mostrar en el titulo");
        boton1.setBounds(10, 130, 150, 30);
        boton1.addActionListener(this);
        add(boton1);
        boton2 = new JButton ("Cerrar");
        boton2.setBounds(250, 200, 100, 30);
        boton2.addActionListener(this);
        add(boton2);
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
        if(e.getSource()==boton1) {
            String aux="";
            if (check1.isSelected()==true){
                aux=aux+"Google Chrome-";
            }
            if(check2.isSelected()==true) {
                aux=aux+"Brave-";
            }
            if (check3.isSelected()==true) {
                aux=aux+"Mozilla Firefox";
            }
            this.setTitle(aux);
        }
        if(e.getSource()==boton2) {
            System.exit(0);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JCheckBoxEjemplo3Source JCBoxEj3S = new JCheckBoxEjemplo3Source();
                JCBoxEj3S.setBounds(0, 0, 400, 300);
                JCBoxEj3S.setLocationRelativeTo(null);
                JCBoxEj3S.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}