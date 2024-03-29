/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forme;

import domen.Administrator;
import domen.Bioskop;
import domen.Film;
import domen.Repertoar;
import domen.Sala;
import domen.Zanr;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import logika.KontrolerKlijent;
import modeli.ModelTabeleFilmovi;
import sesija.Sesija;

/**
 *
 * @author Korisnik
 */
public class DodajRepertoarForma extends javax.swing.JDialog {

    /**
     * Creates new form DodajRepertoarForma
     */
    public DodajRepertoarForma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        setTitle("Dodaj repertoar");
        ucitajBioskope();
        ucitajSale();
        ucitajZanrove();
        tblFilmovi.setModel(new ModelTabeleFilmovi());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBioskop = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbSala = new javax.swing.JComboBox();
        btnDodajFilm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnObrisiFilm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilmovi = new javax.swing.JTable();
        txtNaziv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSacuvajRepertoar = new javax.swing.JButton();
        cmbZanr = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnZatvori = new javax.swing.JButton();
        txtDatum = new javax.swing.JFormattedTextField();
        txtTrajanje = new javax.swing.JFormattedTextField();
        txtGodina = new javax.swing.JFormattedTextField();
        txtCena = new javax.swing.JFormattedTextField();
        txtVreme = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFilmId = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmbBioskop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Sala:");

        jLabel9.setText("Žanr:");

        cmbSala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnDodajFilm.setText("Dodaj film");
        btnDodajFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajFilmActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 3, 14)); // NOI18N
        jLabel4.setText("FILMOVI");

        btnObrisiFilm.setText("Obriši film");
        btnObrisiFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiFilmActionPerformed(evt);
            }
        });

        jLabel5.setText("Naziv filma:");

        tblFilmovi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblFilmovi);

        txtNaziv.setText("Nedelja");
        txtNaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNazivActionPerformed(evt);
            }
        });

        jLabel6.setText("Trajanje(min):");

        btnSacuvajRepertoar.setText("Sačuvaj repertoar");
        btnSacuvajRepertoar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajRepertoarActionPerformed(evt);
            }
        });

        cmbZanr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Datum:");

        jLabel7.setText("Cena(din):");

        jLabel10.setText("Godina:");

        jLabel3.setText("Bioskop:");

        jLabel8.setText("Vreme prikazivanja");

        btnZatvori.setText("Zatvori");
        btnZatvori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZatvoriActionPerformed(evt);
            }
        });

        txtDatum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy"))));
        txtDatum.setText("10.02.2024");
        txtDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatumActionPerformed(evt);
            }
        });

        txtTrajanje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTrajanje.setText("135");
        txtTrajanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrajanjeActionPerformed(evt);
            }
        });

        txtGodina.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtGodina.setText("2024");

        txtCena.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCena.setText("750");

        txtVreme.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm:ss"))));
        txtVreme.setText("12:00:00");

        jLabel11.setText("FilmID:");

        txtFilmId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtFilmId.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnZatvori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(cmbBioskop, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnObrisiFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodajFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGodina)
                                    .addComponent(txtVreme)
                                    .addComponent(txtCena)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(cmbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(txtFilmId))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSacuvajRepertoar, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cmbBioskop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmbSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtFilmId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtVreme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDodajFilm)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnSacuvajRepertoar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnObrisiFilm)
                .addGap(18, 18, 18)
                .addComponent(btnZatvori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajFilmActionPerformed
        if (txtFilmId.getText().isEmpty() || txtNaziv.getText().isEmpty() || txtTrajanje.getText().isEmpty()
                || txtGodina.getText().isEmpty()
                || txtCena.getText().isEmpty() || txtVreme.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Sva polja moraju biti popunjena!", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ModelTabeleFilmovi tabela = (ModelTabeleFilmovi) tblFilmovi.getModel();
        String nazivFilma = txtNaziv.getText();
        long filmId=Long.parseLong(txtFilmId.getText());
        if(filmId<=0) {
             JOptionPane.showMessageDialog(null, "Vrednost id filma mora biti veci od 0!", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
             return;
        }
        int trajanje = Integer.parseInt(txtTrajanje.getText());
        int godina = Integer.parseInt(txtGodina.getText());
        double cena=Double.parseDouble(txtCena.getText());
        String vremeString=txtVreme.getText();
        LocalTime vreme=LocalTime.parse(vremeString);
        Zanr zanr = (Zanr) cmbZanr.getSelectedItem();
        
        ArrayList<Film> filmovi = tabela.vratiFilmove();
        
        for (Film film : filmovi) {
            
            if(film.getNaziv().equals(nazivFilma) || film.getFilmID()==filmId){
                JOptionPane.showMessageDialog(null, "Ovaj film je vec unet!", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else if(film.getVremePrikazivanja().equals(vreme)) {
                 JOptionPane.showMessageDialog(null, "Ovo vreme je vec zauzeto za prikazivanje filma", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        Film film = new Film(null, filmId, nazivFilma, trajanje, godina, cena, vreme, zanr);
        tabela.dodajFilm(film);
    }//GEN-LAST:event_btnDodajFilmActionPerformed

    private void btnObrisiFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiFilmActionPerformed
        int red = tblFilmovi.getSelectedRow();

        if (red >= 0) {
            ModelTabeleFilmovi model = (ModelTabeleFilmovi) tblFilmovi.getModel();
            model.obrisiFilm(red);
        }
    }//GEN-LAST:event_btnObrisiFilmActionPerformed

    private void txtNazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNazivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNazivActionPerformed

    private void btnSacuvajRepertoarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajRepertoarActionPerformed
        try {
            if (txtDatum.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sva polja moraju biti popunjena!", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            ModelTabeleFilmovi tabela = (ModelTabeleFilmovi) tblFilmovi.getModel();
            ArrayList<Film> filmovi = tabela.vratiFilmove();

            if (filmovi.size() < 3 || filmovi.size() > 6) {
                JOptionPane.showMessageDialog(null, "Broj filmova na repertoaru mora biti od 3 do 6!", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
            Date datum = sdf.parse(txtDatum.getText());
            Bioskop bioskop = (Bioskop) cmbBioskop.getSelectedItem();
            Sala sala = (Sala) cmbSala.getSelectedItem();

            Administrator administrator = Sesija.getInstance().getUlogovani();

            Repertoar repertoar = new Repertoar(-1, datum, sala, bioskop, administrator, filmovi);
            KontrolerKlijent.getInstance().dodajRepertoar(repertoar);
            JOptionPane.showMessageDialog(this, "Uspešno ste dodali repertoar.","Obaveštenje",INFORMATION_MESSAGE);
            GlavnaForma gf = (GlavnaForma) getParent();
            gf.popuniTabelu();
            restart();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Neuspešno dodavanje repertoara.","Obaveštenje",INFORMATION_MESSAGE);
            Logger.getLogger(DodajRepertoarForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSacuvajRepertoarActionPerformed

    private void btnZatvoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZatvoriActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnZatvoriActionPerformed

    private void txtDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatumActionPerformed

    private void txtTrajanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrajanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrajanjeActionPerformed

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
            java.util.logging.Logger.getLogger(DodajRepertoarForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DodajRepertoarForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DodajRepertoarForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DodajRepertoarForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DodajRepertoarForma dialog = new DodajRepertoarForma(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDodajFilm;
    private javax.swing.JButton btnObrisiFilm;
    private javax.swing.JButton btnSacuvajRepertoar;
    private javax.swing.JButton btnZatvori;
    private javax.swing.JComboBox cmbBioskop;
    private javax.swing.JComboBox cmbSala;
    private javax.swing.JComboBox cmbZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFilmovi;
    private javax.swing.JFormattedTextField txtCena;
    private javax.swing.JFormattedTextField txtDatum;
    private javax.swing.JFormattedTextField txtFilmId;
    private javax.swing.JFormattedTextField txtGodina;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JFormattedTextField txtTrajanje;
    private javax.swing.JFormattedTextField txtVreme;
    // End of variables declaration//GEN-END:variables

   private void ucitajBioskope() {
        try {
            ArrayList<Bioskop> bioskopi = KontrolerKlijent.getInstance().ucitajBioskope();

            cmbBioskop.removeAllItems();

            for (Bioskop bioskop : bioskopi) {
                cmbBioskop.addItem(bioskop);
            }
        } catch (Exception ex) {
            Logger.getLogger(DodajRepertoarForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ucitajSale() {
        try {
            ArrayList<Sala> sale = KontrolerKlijent.getInstance().ucitajSale();

            cmbSala.removeAllItems();

            for (Sala sala : sale) {
                cmbSala.addItem(sala);
            }
        } catch (Exception ex) {
            Logger.getLogger(DodajRepertoarForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ucitajZanrove() {
        try {
            ArrayList<Zanr> zanrovi = KontrolerKlijent.getInstance().ucitajZanrove();

            cmbZanr.removeAllItems();

            for (Zanr zanr : zanrovi) {
                cmbZanr.addItem(zanr);
            }
        } catch (Exception ex) {
            Logger.getLogger(DodajRepertoarForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void restart() {
        txtFilmId.setText("");
        txtGodina.setText("");
        txtNaziv.setText("");
        txtTrajanje.setText("");
        txtDatum.setText("");
        txtCena.setText("");
        txtVreme.setText("");
        tblFilmovi.setModel(new ModelTabeleFilmovi());
    }
}
