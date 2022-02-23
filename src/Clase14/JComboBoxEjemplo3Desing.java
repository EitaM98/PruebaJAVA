package Clase14;

public class JComboBoxEjemplo3Desing extends javax.swing.JFrame {

    public JComboBoxEjemplo3Desing() {
        initComponents();
        setLayout(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label1 = new javax.swing.JLabel();
        Field1 = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        Combo1 = new javax.swing.JComboBox<>();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label1.setText("Nombre :");

        Field1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Label2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label2.setText("Pais:");

        Combo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Brasil", "España", "Italia", "Uruguay" }));

        Boton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Boton1.setText("Confirmar");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Boton2.setText("Cerrar");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton2)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Field1)
                            .addComponent(Combo1, 0, 120, Short.MAX_VALUE)))
                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label1)
                    .addComponent(Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2)
                    .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(Boton1)
                .addGap(32, 32, 32)
                .addComponent(Boton2)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        if(evt.getSource()==Boton1) {
            String nombre=Field1.getText();
            String pais = (String)Combo1.getSelectedItem();
            this.setTitle(nombre+" - "+pais);
        }
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        if(evt.getSource()==Boton2) {
            System.exit(0);
        }
    }//GEN-LAST:event_Boton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JComboBoxEjemplo3Desing JCBEj3D = new JComboBoxEjemplo3Desing();
                JCBEj3D.setBounds(0, 0, 400, 300);
                JCBEj3D.setLocationRelativeTo(null);
                JCBEj3D.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JTextField Field1;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    // End of variables declaration//GEN-END:variables
}