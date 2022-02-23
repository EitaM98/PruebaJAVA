package Clase14;

import javax.swing.*;
import java.awt.event.*;

public class JRadioButtonEjemplo2Source extends javax.swing.JFrame implements ActionListener {
    private JTextField field1,field2;
    private JRadioButton radio1,radio2;
    private ButtonGroup bg;
    private JButton boton1;
    
    public JRadioButtonEjemplo2Source() {
        initComponents();
        setLayout(null);
        field1 = new JTextField();
        field1.setBounds(10, 10, 100, 30);
        add(field1);
        field2 = new JTextField();
        field2.setBounds(10, 50, 100, 30);
        add(field2);
        bg = new ButtonGroup();
        radio1 = new JRadioButton("Sumar");
        radio1.setBounds(10, 100, 100, 30);
        bg.add(radio1);
        add(radio1);
        radio2 = new JRadioButton("Restar");
        radio2.setBounds(10, 140, 100, 30);
        bg.add(radio2);
        add(radio2);
        boton1 = new JButton("Mostrar");
        boton1.setBounds(150, 180, 100, 30);
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
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1) {
            int v1=Integer.parseInt(field1.getText());
            int v2=Integer.parseInt(field2.getText());
            int resultado=0;
            if (radio1.isSelected()) {
                resultado=v1+v2;
            }
            if (radio2.isSelected()) {
                resultado=v1-v2;
            }
            this.setTitle(String.valueOf(resultado));
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JRadioButtonEjemplo2Source JRBEj2S = new JRadioButtonEjemplo2Source();
                JRBEj2S.setBounds(0, 0, 400, 300);
                JRBEj2S.setLocationRelativeTo(null);
                JRBEj2S.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}