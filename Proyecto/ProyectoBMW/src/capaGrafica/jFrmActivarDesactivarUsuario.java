/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaGrafica;

import capaLogica.Status;
import capaLogica.Usuario;
import capaPersistencias.PersistenciaUsuario;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author anchi
 */
public class jFrmActivarDesactivarUsuario extends javax.swing.JFrame {

    DefaultListModel listaUsuarios = new DefaultListModel(); //Se inicializa y se crea un objeto de la clase DefaultListModel
    /**
     * Creates new form jFrmActivarDesactivarUsuario
     */
    public jFrmActivarDesactivarUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstUsuarios = new javax.swing.JList<>();
        jbtnActivarDesactivar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Activar o Desactivar Usuario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Lista de Usuarios");

        jScrollPane1.setViewportView(jlstUsuarios);

        jbtnActivarDesactivar.setText("Activar o Desactivar");
        jbtnActivarDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActivarDesactivarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(259, 259, 259))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnActivarDesactivar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnActivarDesactivar)
                    .addComponent(jbtnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jlstUsuarios.setModel(listaUsuarios); //Se crea una conexion entre el DefaultListModel y el jlstUsuarios
        llenarLista(); //Al abrirse la ventana se ejecutará el método llenarLista
    }//GEN-LAST:event_formWindowOpened

    private void jbtnActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActivarDesactivarActionPerformed
        int indice = jlstUsuarios.getSelectedIndex(); //Variable indice de tipo int que guardará la posición seleccionada
        Status status = null; //Se inicializa una variable de la clase enumerador y se le dará un valor null
        ArrayList<Usuario> arrayUsuarios = PersistenciaUsuario.getArrayUsuarios(); //Se inicializa un arrayList y guardará el arrayList de la clase PersistenciaUsuario

        if (indice == -1) { //Si el indice seleccionado es -1, osea no hay nada seleccionado
            JOptionPane.showMessageDialog(this, "Seleccione el cliente que desea Activar/Desactivar"); //Mostrará un mensaje de alerta por medio de un JOptionPane
        } //Se cierra la condición if
        else {
            if (arrayUsuarios.get(indice).getStatus()== status.ACTIVO) { //Condicion que se aplicará Si el status del objeto es ACTIVO
                PersistenciaUsuario.desactivarUsuario(indice); //Instrucción para cambiar el status del objeto a INACTIVO
                JOptionPane.showMessageDialog(this, "Se ha desactivado la información del cliente"); //Mensaje de confirmación
                llenarLista(); //Método para llenar o actualizar el jlstUsuarios
            }  //Se cierra la condicion if
            else {
                PersistenciaUsuario.activarUsuario(indice); //Instrucción para cambiar el status del objeto a ACTIVO
                JOptionPane.showMessageDialog(this, "Se ha activado el cliente"); //Mensaje de confirmación
                llenarLista(); //Método para llenar o actualizar el jlstUsuarios
            } //Se cierra la condicion else
        }
    }//GEN-LAST:event_jbtnActivarDesactivarActionPerformed

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
            java.util.logging.Logger.getLogger(jFrmActivarDesactivarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmActivarDesactivarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmActivarDesactivarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmActivarDesactivarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmActivarDesactivarUsuario().setVisible(true);
            }
        });
    }
    
    public void llenarLista() { //Método llenar con el propósito de llenar o actualizar el jlstUsuarios
        listaUsuarios.removeAllElements(); //Antes de llenar el jlstUsuarios, primera se limpiará
        for (Usuario usuario : PersistenciaUsuario.getArrayUsuarios()) { //ciclo for each
            String hilera = usuario.toStringEstado(); //Concatenación de los atributos que se mostrarán en el jlstUsuarios
            listaUsuarios.addElement(hilera); //Se agrega la variable hilera a la posición del jlstUsuarios
        } //Se cierra el ciclo for each
    } //Se cierra el método llenarLista

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnActivarDesactivar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JList<Usuario> jlstUsuarios;
    // End of variables declaration//GEN-END:variables
}
