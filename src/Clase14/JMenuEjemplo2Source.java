package Clase14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuEjemplo2Source extends javax.swing.JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menu1, menu2,menu3;
    private JMenuItem mi1,mi2,mi3,mi4;
    
    public JMenuEjemplo2Source() {
        initComponents();
        setLayout(null);
        mb = new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        menu2 = new JMenu ("Tamaño de Ventana");
        menu1.add(menu2);
        mi1 = new JMenuItem("640*480");
        mi1.addActionListener(this);
        menu2.add(mi1);
        mi2 = new JMenuItem("800*600");
        mi2.addActionListener(this);
        menu2.add(mi2);
        menu3 = new JMenu ("Color de fondo");
        menu1.add(menu3);
        mi3 = new JMenuItem("Rojo");
        mi3.addActionListener(this);
        menu3.add(mi3);
        mi4 = new JMenuItem("Azul");
        mi4.addActionListener(this);
        menu3.add(mi4);
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
            setSize(640,480);
        }
        if(e.getSource()==mi2) {
            setSize(800,600);
        }
        if(e.getSource()==mi3) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if(e.getSource()==mi4) {
            getContentPane().setBackground(new Color(0,0,255));
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JMenuEjemplo2Source JMEj2S = new JMenuEjemplo2Source();
                JMEj2S.setBounds(0, 0, 400, 300);
                JMEj2S.setLocationRelativeTo(null);
                JMEj2S.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}