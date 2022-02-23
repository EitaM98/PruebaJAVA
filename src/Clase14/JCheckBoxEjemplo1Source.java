package Clase14;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class JCheckBoxEjemplo1Source extends javax.swing.JFrame implements ActionListener, ChangeListener {
    private JCheckBox check1, check2, check3;
    private JButton boton1;
    
    public JCheckBoxEjemplo1Source() {
        initComponents();
        setLayout(null);
        check1 = new JCheckBox ("Inglés");
        check1.setBounds(10, 10, 150, 30);
        check1.addChangeListener(this);
        add(check1);
        check2 = new JCheckBox ("Francés");
        check2.setBounds(10, 50, 150, 30);
        check2.addChangeListener(this);
        add(check2);
        check3 = new JCheckBox ("Alemán");
        check3.setBounds(10, 90, 150, 30);
        check3.addChangeListener(this);
        add(check3);
        boton1 = new JButton ("Cerrar");
        boton1.setBounds(250, 200, 100, 30);
        boton1.addActionListener(this);
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
        String aux="";
        if(check1.isSelected()==true) {
            aux=aux+"Inglés-";
        }
        if(check2.isSelected()==true) {
            aux=aux+"Francés-";
        }
        if(check3.isSelected()==true) {
            aux=aux+"Alemán";
        }
        this.setTitle(aux);
    }
    
    public void actionPerformed (ActionEvent e) {
        if(e.getSource()==boton1) {
            System.exit(0);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JCheckBoxEjemplo1Source JCBEj1S = new JCheckBoxEjemplo1Source();
                JCBEj1S.setBounds(0, 0, 400, 300);
                JCBEj1S.setLocationRelativeTo(null);
                JCBEj1S.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}