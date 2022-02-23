package Clase14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuEjemplo1Source extends javax.swing.JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1,mi2,mi3;
    
    public JMenuEjemplo1Source() {
        initComponents();
        setLayout(null);
        mb = new JMenuBar();
        setJMenuBar(mb);
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        mi1 = new JMenuItem("Rojo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2 = new JMenuItem("Verde");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3 = new JMenuItem("Azul");
        mi3.addActionListener(this);
        menu1.add(mi3);
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
        Container f=this.getContentPane();
        if(e.getSource()==mi1) {
            f.setBackground(new Color (255,0,0));
        }
        if(e.getSource()==mi2) {
            f.setBackground(new Color(0,255,0));
        }
        if(e.getSource()==mi3) {
            f.setBackground(new Color(0,0,255));
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JMenuEjemplo1Source JMEj1S = new JMenuEjemplo1Source();
                JMEj1S.setBounds(0, 0, 400, 300);
                JMEj1S.setLocationRelativeTo(null);
                JMEj1S.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
