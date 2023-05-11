/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;


import DAO.EntradaDAO;
import DAO.ProveedorDAO;
import Modelo.Entrada;
import Modelo.Iva;
import Modelo.Proveedor;
import java.util.List;
import Modelo.Usuario;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class formRegistroEntradasAdd1 extends javax.swing.JFrame {

    Usuario sysUser;
    
    /**
     * Creates new form formUsuarioAdd
     */
    public formRegistroEntradasAdd1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public formRegistroEntradasAdd1(Usuario user) {
        initComponents();
        this.sysUser = user;
        this.setLocationRelativeTo(null);
        this.getPorcentaje();
        this.getproveedores();
    }
    public void getproveedores(){
        ProveedorDAO proveDAO = new ProveedorDAO();
        List<Proveedor> prove = proveDAO.listar();

        jtxEntradaProv.removeAllItems();
        for(Proveedor pro:prove){
            jtxEntradaProv.addItem(new Proveedor(pro.getIdProveedor(), pro.getPrimerNombre()));
            //jtxentrada.addItem(new Proveedor(String.valueOf(pro.getIdProveedor()), String.valueOf(pro.getPrimerNombre())));
        }    
    }
     public void getPorcentaje(){
        
        listLIva.removeAllItems();
        listLIva.addItem(new Iva("0%",1));
        listLIva.addItem(new Iva("12%",2));
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        labTitle = new javax.swing.JLabel();
        labCodigo = new javax.swing.JLabel();
        txtCodigoEn = new javax.swing.JTextField();
        labIdProveedor = new javax.swing.JLabel();
        labFecha = new javax.swing.JLabel();
        labSubTotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        labiva = new javax.swing.JLabel();
        labTotal = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        txtfecha2 = new javax.swing.JFormattedTextField();
        listLIva = new javax.swing.JComboBox<>();
        jtxEntradaProv = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(255, 255, 255));
        panMain.setForeground(new java.awt.Color(255, 255, 255));
        panMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labTitle.setForeground(new java.awt.Color(11, 58, 82));
        labTitle.setText("Registrar Entradas");
        panMain.add(labTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labCodigo.setText("Codigo");
        panMain.add(labCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtCodigoEn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigoEn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCodigoEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEnActionPerformed(evt);
            }
        });
        panMain.add(txtCodigoEn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 30));

        labIdProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labIdProveedor.setText("ID Provedor");
        panMain.add(labIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        labFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labFecha.setText("Fecha");
        panMain.add(labFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        labSubTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labSubTotal.setText("SubTotal");
        panMain.add(labSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        txtSubTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSubTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        panMain.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 30));

        labiva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labiva.setText("Iva");
        panMain.add(labiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        labTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labTotal.setText("Total");
        panMain.add(labTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txttotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        panMain.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 190, 30));

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("Cancelar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panMain.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 90, 30));

        btnGuardar1.setBackground(new java.awt.Color(11, 58, 82));
        btnGuardar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setText("Guardar");
        btnGuardar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        panMain.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 90, 30));

        txtfecha2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtfecha2.setText("dd/MM/yyyy");
        txtfecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfecha2ActionPerformed(evt);
            }
        });
        panMain.add(txtfecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 210, 30));

        listLIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listLIvaActionPerformed(evt);
            }
        });
        panMain.add(listLIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 80, 30));

        jtxEntradaProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEntradaProvActionPerformed(evt);
            }
        });
        panMain.add(jtxEntradaProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtCodigoEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEnActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        
        Entrada entra = new Entrada();
       EntradaDAO EntraDAO = new EntradaDAO();
        
        if(!txtCodigoEn.getText().equals("") && 
                !txtfecha2.getText().equals("") && !txtSubTotal.getText().equals("") &&
                !txttotal.getText().equals("") ){
            
            entra.setCodigo((String)txtCodigoEn.getText());
            entra.setIdProveedor(String.valueOf(jtxEntradaProv.getItemAt(jtxEntradaProv.getSelectedIndex()).getIdProveedor()));     
           
            entra.setSubtotal(Float.parseFloat(txtSubTotal.getText()));
            entra.setValorIva((int) listLIva.getItemAt(listLIva.getSelectedIndex()).getValor());
           // entra.setTotal(Float.parseFloat(txtTotal.getText()));
            LocalDate fecha = LocalDate.parse(txtfecha2.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
            entra.setFechaEntrada(fecha);

            
            if(entra.getCodigo().length() > 4 && entra.getCodigo().length() <= 5){
                
                if(entra.getIdProveedor().length() >= 1){
                    if(entra.getIdProveedor().length() <= 11){

                       entra.setEstado(1);
                        entra.setFechaIngreso(LocalDateTime.now());
                        entra.setUsuarioIngreso(sysUser.getUsername());
                            
                        if(EntraDAO.registrar(entra)){                           
                            this.dispose();
                            formRegistroEntradas.getEntradas();

                        }else{
                            JOptionPane.showMessageDialog(null, "No se guradaron los datos.");
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "El id del provedor debe de ser de 1 caracter maximo 11.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El id del provedor debe de ser de 1 caracter maximo 11.");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "El codigo deber tener 5 caracteres.");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos del formulario.");
        }
        
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtfecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfecha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfecha2ActionPerformed

    private void listLIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listLIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listLIvaActionPerformed

    private void jtxEntradaProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEntradaProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEntradaProvActionPerformed

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
            java.util.logging.Logger.getLogger(formRegistroEntradasAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formRegistroEntradasAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formRegistroEntradasAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formRegistroEntradasAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formRegistroEntradasAdd1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JComboBox<Proveedor> jtxEntradaProv;
    private javax.swing.JLabel labCodigo;
    private javax.swing.JLabel labFecha;
    private javax.swing.JLabel labIdProveedor;
    private javax.swing.JLabel labSubTotal;
    private javax.swing.JLabel labTitle;
    private javax.swing.JLabel labTotal;
    private javax.swing.JLabel labiva;
    private javax.swing.JComboBox<Modelo.Iva> listLIva;
    private javax.swing.JPanel panMain;
    private javax.swing.JTextField txtCodigoEn;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JFormattedTextField txtfecha2;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}