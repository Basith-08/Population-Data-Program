/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Component;
import model.model_inputPenduduk;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author basith
 */
public class viewInput extends javax.swing.JFrame {

   public DefaultTableModel tblmodel;
   model_inputPenduduk IP = new model_inputPenduduk();
   String header[] = {"nik","nama","tempat_lahir","tanggal_lahir","jenis_kelamin","golongan_darah","alamat","agama","pendidikan_terakhir","status_pendidikan","pekerjaan","status","kewarganegaraan"};

   public viewInput() throws SQLException {
        initComponents();
        setLebarKolom();
        tblmodel = new DefaultTableModel(null,header);
        tabel.setModel(tblmodel);
        tabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void setColumnWidth(int kolom){
            DefaultTableColumnModel dtcm = (DefaultTableColumnModel) tabel.getColumnModel();
            TableColumn kolomtabel = dtcm.getColumn(kolom);
            int lebar = 0;
            int margin = 10;
            int a;
            TableCellRenderer renderer = kolomtabel.getHeaderRenderer();
            
            if (renderer == null ) {
                renderer = tabel.getTableHeader().getDefaultRenderer();
                
            }
            Component komponen = renderer.getTableCellRendererComponent(
            tabel,kolomtabel.getHeaderValue(), false, false,0,0);
            lebar = komponen.getPreferredSize().width;
            for (a = 0; a<tabel.getRowCount(); a++) {
                renderer = tabel.getCellRenderer(a, kolom);
                komponen = renderer.getTableCellRendererComponent(
                tabel, kolomtabel.getHeaderValue(), false,false,a,kolom);
                int lebarKolom = komponen.getPreferredSize().width;
                lebar = Math.max(lebar, lebarKolom);
            }
            lebar = lebar + margin;
            kolomtabel.setPreferredWidth(lebar);
        }
        public void setLebarKolom(){
            int a;
            for (a=0; a<tabel.getColumnCount(); a++){
                setColumnWidth(a);
            }
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNik = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTempatLahir = new javax.swing.JTextField();
        tanggalLahir = new com.toedter.calendar.JDateChooser();
        cbJeKe = new javax.swing.JComboBox<>();
        cbGolDar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbAgama = new javax.swing.JComboBox<>();
        cbPenTer = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtStsPnddk = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPkrjn = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtKewarganegaraan = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTampil = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INPUT DATA PENDUDUK");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nik");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Temapat Lahir");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Lahir");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jenis Kelamin");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Golongan Darah");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(225, 225, 225));
        jLabel8.setText("Alamat");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        cbJeKe.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        cbJeKe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));

        cbGolDar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        cbGolDar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Agama");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pendidikan Terakhir");

        cbAgama.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Budha", "Konghucu" }));

        cbPenTer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbPenTer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "SMA/SMK/MA", "S1" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Status Pendidikan");

        txtStsPnddk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStsPnddkActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pekerjaan");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Status");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Kewarganegaraan");

        btnSimpan.setBackground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTampil.setBackground(new java.awt.Color(255, 255, 255));
        btnTampil.setText("Tampil");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nik", "Nama Penduduk", "Tempat Lahir", "Tanggal Lahir", "Jenis Kelamin", "Golongan Darah", "Alamat", "Agama", "Pendidikan Terakhir", "Status", "Pekerjaan", "Status", "Kewarganegaraan"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTempatLahir)
                                .addComponent(txtNama)
                                .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                            .addComponent(cbJeKe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGolDar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbPenTer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStsPnddk)
                            .addComponent(txtPkrjn)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKewarganegaraan))
                        .addGap(109, 109, 109))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnTampil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addContainerGap(142, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbPenTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtStsPnddk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbGolDar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtKewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbJeKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPkrjn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnTampil)
                            .addComponent(btnEdit)
                            .addComponent(btnClear))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Arsip Penduduk");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtStsPnddkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStsPnddkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStsPnddkActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       try {
           IP.Edit(this);
       } catch (SQLException ex) {
           Logger.getLogger(viewInput.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            IP.Simpan(this);
        } catch (SQLException ex) {
            Logger.getLogger(viewInput.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
       try {
           IP.Tampil(this);
       } catch (SQLException ex) {
           Logger.getLogger(viewInput.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnTampilActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
       try {
           IP.KlikTabel(this);
       } catch (SQLException ex) {
           Logger.getLogger(viewInput.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_tabelMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        view.viewArsip va = null;
        va = new view.viewArsip();
        va.setVisible(true);
        setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       try {
           IP.Baru(this);
       } catch (SQLException ex) {
           Logger.getLogger(viewInput.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(viewInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new viewInput().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(viewInput.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTampil;
    public javax.swing.JComboBox<String> cbAgama;
    public javax.swing.JComboBox<String> cbGolDar;
    public javax.swing.JComboBox<String> cbJeKe;
    public javax.swing.JComboBox<String> cbPenTer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable tabel;
    public com.toedter.calendar.JDateChooser tanggalLahir;
    public javax.swing.JTextArea txtAlamat;
    public javax.swing.JTextField txtKewarganegaraan;
    public javax.swing.JTextField txtNama;
    public javax.swing.JTextField txtNik;
    public javax.swing.JTextField txtPkrjn;
    public javax.swing.JTextField txtStatus;
    public javax.swing.JTextField txtStsPnddk;
    public javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables
}
