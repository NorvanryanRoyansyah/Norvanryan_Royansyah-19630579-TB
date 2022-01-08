/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan;

import Koneksi.koneksi;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author USER
 */
public class Laporan_pegawaiout extends javax.swing.JDialog {

   public final Connection conn = new koneksi().connect();
    JasperReport JasRep;
    JasperPrint JasPrint;
    Map param = new HashMap(2);
    JasperDesign JasDes;
    
    public void tampil_combo1(){
        cbPegawai1.removeAllItems();
        cbPegawai1.addItem("--Pilih Pegawai--");
        try {
            String sql = "select * from tb_pegawaiout order by nik asc";
            java.sql.Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                cbPegawai1.addItem(res.getString("NIK"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void tampil_combo2(){
        cbPegawai2.removeAllItems();
        cbPegawai2.addItem("--Pilih Pegawai--");
        try {
            String sql = "select * from tb_pegawaiout order by nik asc";
            java.sql.Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                cbPegawai2.addItem(res.getString("NIK"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
   
   
    public Laporan_pegawaiout(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampil_combo1();
        tampil_combo2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbPegawai2 = new javax.swing.JComboBox<>();
        cbPegawai1 = new javax.swing.JComboBox<>();
        btnCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(null);

        cbPegawai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPegawai1ActionPerformed(evt);
            }
        });

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbPegawai2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPegawai1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbPegawai1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(cbPegawai2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        try {
            File file = new File("src/Laporan/Lap_Pegawaiout.jrxml");
            String cb1 = (String) cbPegawai1.getSelectedItem();
            String cb2 = (String) cbPegawai2.getSelectedItem();
            JasDes = JRXmlLoader.load(file);
            param.put("realPath","src/Gambar/");
            param.put("Pegawai1", cb1);
            param.put("Pegawai2", cb2);
            JasRep = JasperCompileManager.compileReport(JasDes);
            JasPrint = JasperFillManager.fillReport(JasRep, param, conn);
            JasperViewer jasperviewer = new JasperViewer(JasPrint, false);
            jasperviewer.setExtendedState(jasperviewer.getExtendedState() | javax.swing.JFrame.MAXIMIZED_BOTH);
            jasperviewer.setVisible(true); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Membuka Laporan" +e);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void cbPegawai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPegawai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPegawai1ActionPerformed

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
            java.util.logging.Logger.getLogger(Laporan_pegawaiout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan_pegawaiout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan_pegawaiout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan_pegawaiout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Laporan_pegawaiout dialog = new Laporan_pegawaiout(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JComboBox<String> cbPegawai1;
    private javax.swing.JComboBox<String> cbPegawai2;
    // End of variables declaration//GEN-END:variables
}
