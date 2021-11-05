
import javax.swing.JOptionPane;



public class swing extends javax.swing.JFrame {


    
    public swing() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id_mensaje = new javax.swing.JLabel();
        cifrado = new javax.swing.JButton();
        descifrado = new javax.swing.JButton();
        mensaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CIFRADO RSA");

        id_mensaje.setText("Mensaje:");

        cifrado.setText("Cifrado");
        cifrado.setToolTipText("");
        cifrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cifradoMouseClicked(evt);
            }
        });
        cifrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifradoActionPerformed(evt);
            }
        });

        descifrado.setText("Descifrado");
        descifrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descifradoMouseClicked(evt);
            }
        });
        descifrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifradoActionPerformed(evt);
            }
        });

        mensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajeActionPerformed(evt);
            }
        });
        mensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mensajeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(id_mensaje)
                        .addGap(18, 18, 18)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cifrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descifrado)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_mensaje)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cifrado)
                    .addComponent(descifrado))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cifradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifradoActionPerformed

     
    }//GEN-LAST:event_cifradoActionPerformed

    private void cifradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cifradoMouseClicked
      
    
        
    }//GEN-LAST:event_cifradoMouseClicked

    private void descifradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifradoActionPerformed
        
    
    }//GEN-LAST:event_descifradoActionPerformed

    private void mensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajeActionPerformed
       
    }//GEN-LAST:event_mensajeActionPerformed

    private void mensajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mensajeKeyTyped
        

    mensaje = new ;
        
 
        char validar = evt.getKeyChar();
  
        if(Character.isLetter(validar)){
        
            getToolkit().beep();
            
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Solo ingrese numeros ");
           
        }
    }//GEN-LAST:event_mensajeKeyTyped

    private void descifradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descifradoMouseClicked

        
        RSA descifrado = new RSA();
        
        descifrado.setVisible(true);
         
        
    }//GEN-LAST:event_descifradoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new swing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cifrado;
    private javax.swing.JButton descifrado;
    private javax.swing.JLabel id_mensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField mensaje;
    // End of variables declaration//GEN-END:variables
}
