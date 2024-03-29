/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaGrafica;

import capaLogica.EstadoParte;
import capaLogica.Parte;
import capaPersistencias.PersistenciaParte;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author anchi
 */
public class jFrmActualizarParte extends javax.swing.JFrame {

    /**
     * Creates new form jFrmAgregarUsuario
     */
    public jFrmActualizarParte() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        jlblClave = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jlblTipoUsuario = new javax.swing.JLabel();
        jtxtDescripcion = new javax.swing.JTextField();
        jtxtPrecio = new javax.swing.JTextField();
        jcboEstado = new javax.swing.JComboBox<>();
        jbtnGuardar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jtxtModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcboParte = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        jTextField5.setText("jTextField5");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Parte");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jlblUsuario.setText("Descripción:");

        jlblClave.setText("Modelo:");

        jlblNombre.setText("Precio:");

        jlblTipoUsuario.setText("Estado:");

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione la parte a modificar:");

        jcboParte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcboParteItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jcboParte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlblUsuario)
                                .addComponent(jlblClave)
                                .addComponent(jlblNombre))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtDescripcion)
                                .addComponent(jtxtPrecio)
                                .addComponent(jtxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnGuardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblTipoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcboParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblUsuario)
                    .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblClave)
                    .addComponent(jtxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNombre)
                    .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTipoUsuario)
                    .addComponent(jcboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnSalir))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(Parte p:PersistenciaParte.getArrayPartes()){
            jcboParte.addItem(p);
        }
        
        for (EstadoParte estadoParte:EstadoParte.values()){
            jcboEstado.addItem(estadoParte);
        }
        
        jcboParte.setSelectedIndex(-1);
        limpiarCampos();
    }//GEN-LAST:event_formWindowOpened

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        if(jcboParte.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una Parte");
            jcboParte.requestFocus();
            return;
        }
        
        if(jtxtDescripcion.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Digite una descripción");
            jtxtDescripcion.requestFocus();
            jtxtDescripcion.selectAll();
            return;
        }
        
        if(jtxtModelo.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Digite un modelo");
            jtxtModelo.requestFocus();
            jtxtModelo.selectAll();
            return;
        }
        
        try{
            double precio = Double.parseDouble(jtxtPrecio.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"El precio debe ser un número");
            jtxtPrecio.requestFocus();
            jtxtPrecio.selectAll();
            return;
        }
        
        if(jcboEstado.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar el estado de la Parte");
            jcboEstado.requestFocus();
            return;
        }
        
        double precio = Double.parseDouble(jtxtPrecio.getText());
        Parte parte = new Parte(jtxtDescripcion.getText(),jtxtModelo.getText(),precio,(EstadoParte)jcboEstado.getSelectedItem());
        PersistenciaParte.actualizarParte(jcboParte.getSelectedIndex(), parte);
        
        jcboParte.setSelectedIndex(-1);
        jtxtDescripcion.setText("");
        jtxtModelo.setText("");
        jtxtPrecio.setText("");
        jcboEstado.setSelectedIndex(-1);
        
        JOptionPane.showMessageDialog(this, "Parte Actualizada");
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jcboParteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcboParteItemStateChanged
        try{
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                Parte p = (Parte)jcboParte.getSelectedItem();
                jtxtDescripcion.setText(p.getDescripcion());
                jtxtModelo.setText(p.getModelo());
                jtxtPrecio.setText(String.valueOf(p.getPrecio()));
                jcboEstado.setSelectedItem(p.getEstadoParte());
            }
        }
        catch(Exception e){ 
        }
    }//GEN-LAST:event_jcboParteItemStateChanged

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
            java.util.logging.Logger.getLogger(jFrmActualizarParte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmActualizarParte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmActualizarParte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmActualizarParte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmActualizarParte().setVisible(true);
            }
        });
    }
    
    public void limpiarCampos(){
        jtxtDescripcion.setText("");
        jtxtPrecio.setText("");
        jtxtModelo.setText("");
        jcboEstado.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<EstadoParte> jcboEstado;
    private javax.swing.JComboBox<Parte> jcboParte;
    private javax.swing.JLabel jlblClave;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblTipoUsuario;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtModelo;
    private javax.swing.JTextField jtxtPrecio;
    // End of variables declaration//GEN-END:variables
}
