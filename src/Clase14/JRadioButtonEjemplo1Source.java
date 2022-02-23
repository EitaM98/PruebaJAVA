package Clase14;

import javax.swing.*;
import javax.swing.event.*;

public class JRadioButtonEjemplo1Source extends javax.swing.JFrame implements ChangeListener {
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;
    
    public JRadioButtonEjemplo1Source() {
        initComponents();
        setLayout(null);
        bg = new ButtonGroup();
        radio1 = new JRadioButton("640*480");
        radio1.setBounds(10, 20, 100, 30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);
        radio2 = new JRadioButton("800*600");
        radio2.setBounds(10, 60, 100, 30);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);
        radio3 = new JRadioButton("1024*768");
        radio3.setBounds(10, 100, 100, 30);
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3);
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
    public void stateChanged(ChangeEvent e) {
        if(radio1.isSelected()==true) {
            setSize(640,480);
        }
        if(radio2.isSelected()==true) {
            setSize(800,600);
        }
        if(radio3.isSelected()==true) { 
            setSize(1024,768);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JRadioButtonEjemplo1Source JRBEj1S = new JRadioButtonEjemplo1Source();
                JRBEj1S.setBounds(0, 0, 350, 230);
                JRBEj1S.setLocationRelativeTo(null);
                JRBEj1S.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}