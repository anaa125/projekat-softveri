/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forme;

import domen.Repertoar;
import domen.Zanr;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import logika.KontrolerKlijent;
import modeli.ModelTabeleRepertoar;
import sesija.Sesija;

/**
 *
 * @author Korisnik
 * 
 */
public class GlavnaForma extends javax.swing.JFrame {

    /**
     * Creates new form GlavnaForma
     */
    public GlavnaForma() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Projekcije filmova u bioskopima");
        ModelTabeleRepertoar model=new ModelTabeleRepertoar();
        Thread nit=new Thread(model);
        nit.start();
        tblRepertoari.setModel(model);
       txtUlogovani.setText(Sesija.getInstance().getUlogovani().toString());
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
        txtUlogovani = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPretraga = new javax.swing.JTextField();
        btnObrisi = new javax.swing.JButton();
        btnIzmeni = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepertoari = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        pregledBioskopa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        odjaviSe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ulogovani administrator");

        txtUlogovani.setFont(new java.awt.Font("Viner Hand ITC", 3, 14)); // NOI18N
        txtUlogovani.setText("Ime i prezime");

        jLabel2.setText("Pretraga repertoara:");

        txtPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPretragaActionPerformed(evt);
            }
        });
        txtPretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPretragaKeyReleased(evt);
            }
        });

        btnObrisi.setText("Obriši repertoar");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnIzmeni.setText("Izmeni repertoar");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj repertoar");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        tblRepertoari.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRepertoari);

        jMenu1.setText("Bioskopi");

        pregledBioskopa.setText("Pregled bioskopa");
        pregledBioskopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pregledBioskopaActionPerformed(evt);
            }
        });
        jMenu1.add(pregledBioskopa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Odjavi se");

        odjaviSe.setText("Odjavi se");
        odjaviSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odjaviSeActionPerformed(evt);
            }
        });
        jMenu2.add(odjaviSe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUlogovani, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIzmeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUlogovani))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnObrisi)
                        .addGap(57, 57, 57)
                        .addComponent(btnIzmeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDodaj))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPretragaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPretragaActionPerformed

    private void txtPretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPretragaKeyReleased
        String rec = txtPretraga.getText();
        ((ModelTabeleRepertoar) tblRepertoari.getModel()).setParametar(rec); 
// TODO add your handling code here:
    }//GEN-LAST:event_txtPretragaKeyReleased

    private void pregledBioskopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pregledBioskopaActionPerformed
        BioskopiForma bf = new BioskopiForma(this, true);
        bf.setVisible(true);
    }//GEN-LAST:event_pregledBioskopaActionPerformed

    private void odjaviSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odjaviSeActionPerformed
        this.dispose();
    }//GEN-LAST:event_odjaviSeActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        int red = tblRepertoari.getSelectedRow();

        try {
            if (red >= 0) {
                ModelTabeleRepertoar tabela = (ModelTabeleRepertoar) tblRepertoari.getModel();
                Repertoar repertoar = tabela.vratiRepertoar(red);

                KontrolerKlijent.getInstance().obrisiRepertoar(repertoar);

                tabela.pronadjiRepertoare();
                JOptionPane.showMessageDialog(null, "Uspešno ste obrisali repertoar.", "Obaveštenje", INFORMATION_MESSAGE);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Neuspešno brisanje repertoara.", "Obaveštenje", INFORMATION_MESSAGE);

            Logger.getLogger(GlavnaForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        int red = tblRepertoari.getSelectedRow();

        if (red >= 0) {
            ModelTabeleRepertoar tabela = (ModelTabeleRepertoar) tblRepertoari.getModel();
            Repertoar repertoar = tabela.vratiRepertoar(red);

            IzmeniRepertoarForma of = new IzmeniRepertoarForma(this, true, repertoar);
            of.setVisible(true);

        }
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        DodajRepertoarForma df = new DodajRepertoarForma(this, true);
        df.setVisible(true);
    }//GEN-LAST:event_btnDodajActionPerformed

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
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavnaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem odjaviSe;
    private javax.swing.JMenuItem pregledBioskopa;
    private javax.swing.JTable tblRepertoari;
    private javax.swing.JTextField txtPretraga;
    private javax.swing.JLabel txtUlogovani;
    // End of variables declaration//GEN-END:variables
   void popuniTabelu() {
        ModelTabeleRepertoar tabela = (ModelTabeleRepertoar) tblRepertoari.getModel();
        tabela.pronadjiRepertoare();
    }
    
    
    

   
}