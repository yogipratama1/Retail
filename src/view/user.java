/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDOWS 10
 */
public class user extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
    public user() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tIDadmin = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        telp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cblevel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbladmin = new javax.swing.JTable();
        tCari = new javax.swing.JTextField();
        btnrefresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kelola Data User Apps");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Dashboard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addContainerGap(585, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID PETUGAS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("NAMA/USERNAME");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 26));

        tIDadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tIDadminActionPerformed(evt);
            }
        });
        jPanel3.add(tIDadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 211, 34));

        tNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaActionPerformed(evt);
            }
        });
        jPanel3.add(tNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 211, 34));

        tPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(tPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 211, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TELEPON");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 26));

        btnsimpan.setBackground(new java.awt.Color(51, 51, 255));
        btnsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel3.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 92, 48));

        btnupdate.setBackground(new java.awt.Color(255, 102, 51));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UBAH");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 92, 48));

        btnhapus.setBackground(new java.awt.Color(153, 153, 0));
        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel3.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 89, 48));
        jPanel3.add(telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 211, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("LEVEL");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 26));

        cblevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cblevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "petugas" }));
        jPanel3.add(cblevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 211, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 410, 420));

        tbladmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbladmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbladminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbladmin);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 670, 320));

        tCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCariActionPerformed(evt);
            }
        });
        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCariKeyReleased(evt);
            }
        });
        jPanel2.add(tCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 470, 40));

        btnrefresh.setBackground(new java.awt.Color(51, 51, 255));
        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnrefresh.setText("Refresh form");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        jPanel2.add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 160, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CARI PETUGAS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 210, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1370, 519));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tIDadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tIDadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tIDadminActionPerformed

    private void tNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaActionPerformed

    private void tPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPasswordActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
//        ID_AUTO();
//        String id = tIDadmin.getText();
//        String pass = tPassword.getText();
//        String nama = tNama.getText();
//        String telpon = telp.getText();
//        String level = cblevel.getSelectedItem().toString();
//
//        if (nama.length() == 0) {
//            JOptionPane.showMessageDialog(null, "Masukan data dengan benar!!");
//            Resetform();
//            btnupdate.setEnabled(false);
//
//        } else {
//
//            try {
//                con.createStatement().executeUpdate("INSERT INTO tbl_user VALUE('" + id + "','" + nama + "','" + pass + "','" + telpon + "','"+level+"')");
//                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
//                Resetform();
//            } catch (Exception ex) {
//                System.out.println("" + ex);
//                JOptionPane.showMessageDialog(null, "Gagal !! Isi Form Dengan Benar ");
//            }
//        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
//        try {
//
//            String nama = tNama.getText();
//            String pass = tPassword.getText();
//            String telpon = telp.getText();
//            String level = cblevel.getSelectedItem().toString();
//
//            con.createStatement().executeUpdate("update tbl_user set Nama_user='" + nama + ""
//                + "',pass='" + pass + "',Telephon='" + telpon + "',level='"+level+"'"
//                + "where Kode_user ='" + model.getValueAt(tbladmin.getSelectedRow(), 0) + "'");
//            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
//            Resetform();
//        } catch (Exception e) {
//            System.out.println(e);
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
//        try {
//            con.createStatement().executeUpdate("delete from tbl_user where Kode_user = '" + model.getValueAt(tbladmin.getSelectedRow(), 0) + "'");
//            JOptionPane.showMessageDialog(null, "Berhasil");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Gagal !!!");
//
//        }
//        Resetform();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void tbladminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbladminMouseClicked
//        int i = tbladmin.getSelectedRow();
//        tIDadmin.setText(model.getValueAt(i, 0).toString());
//        tNama.setText(model.getValueAt(i, 1).toString());
//
//        tPassword.setText(model.getValueAt(i, 2).toString());
//        telp.setText(model.getValueAt(i, 3).toString());
//        cblevel.setSelectedItem(String.valueOf(model.getValueAt(i, 4)));
//
//        //  disabled item on klik row table
//        btnsimpan.setEnabled(false);
//        btnupdate.setEnabled(true);
//        tIDadmin.setEnabled(false);
//        btnhapus.setEnabled(true);
    }//GEN-LAST:event_tbladminMouseClicked

    private void tCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCariActionPerformed
//        tabelAdmin();
    }//GEN-LAST:event_tCariActionPerformed

    private void tCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyReleased
//        tabelAdmin();
    }//GEN-LAST:event_tCariKeyReleased

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // Resetform();
        btnupdate.setEnabled(false);
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new dashboard().setVisible(true);
        dispose();
//        Dashboard dsb = new Dashboard();
//        dsb.dashAdmin();
//        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        dsb.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cblevel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tIDadmin;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tPassword;
    private javax.swing.JTable tbladmin;
    private javax.swing.JTextField telp;
    // End of variables declaration//GEN-END:variables
 //private void tabelAdmin() {
//        String[] judul = {"ID", "Nama/Username", "Password", "Telephone","Level"};
//        model = new DefaultTableModel(judul, 0);
//        tbladmin.setModel(model);
//        String sql = "SELECT * FROM tbl_user where Nama_user like '%" + tCari.getText() + "'";
//
//        try {
//            rs = con.createStatement().executeQuery(sql);
//
//            while (rs.next()) {
//                String id = rs.getString("Kode_user");
//                String nama = rs.getString("Nama_user");
//                String pass = rs.getString("Pass");
//                String Telp = rs.getString("Telephon");
//                String level = rs.getString("level");
//
//                String[] data = {id, nama, pass, Telp,level};
//                model.addRow(data);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
//    }
//
//    public void ID_AUTO() {
//        try {
//            String sql = "Select max(right(Kode_user,2)) as no_iduser from tbl_user";
//            rs = con.createStatement().executeQuery(sql);
//            while (rs.next()) {
//                if (rs.first() == false) {
//                    tIDadmin.setText("U-01");
//
//                } else {
//                    rs.last();
//                    int autoid = rs.getInt(1) + 1;
//                    String nomor = String.valueOf(autoid);
//
//                    for (int a = 0; a < 1; a++) {
//                        nomor = "0" + nomor;
//                    }
//                    tIDadmin.setText("U-" + nomor);
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//            JOptionPane.showMessageDialog(null, "masukan data dengan benar!!");
//        }
//    }
//
//    private void Resetform() {
//       ID_AUTO();
//        tNama.setText("");
//        tPassword.setText("");
//        telp.setText("");
//
//        tabelAdmin();
//
//        btnsimpan.setEnabled(true);
//        btnupdate.setEnabled(false);
//        tIDadmin.setEnabled(true);
//        tIDadmin.setEnabled(false);
//        tIDadmin.setText("Auto Fill");
//        btnhapus.setEnabled(false);
//
//    }
}
