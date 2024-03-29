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
public class IzmeniRepertoarForma extends javax.swing.JDialog {
Repertoar repertoar;
    /**
     * Creates new form IzmeniRepertoarForma
     */
    public IzmeniRepertoarForma(java.awt.Frame parent, boolean modal, Repertoar repertoar) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Izmeni repertoar");
        this.repertoar=repertoar;
        ucitajBioskope();
        ucitajSale();
        ucitajZanrove();
        popuniPodatke();

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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSacuvajIzmenjenRepertoar = new javax.swing.JButton();
        btnZatvori = new javax.swing.JButton();
        cmbSala = new javax.swing.JComboBox();
        txtDatum = new javax.swing.JFormattedTextField();
        btnDodajFilm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnObrisiFilm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilmovi = new javax.swing.JTable();
        txtCena = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtVreme = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtFilmId = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbZanr = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTrajanje = new javax.swing.JFormattedTextField();
        txtGodina = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmbBioskop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Bioskop:");

        jLabel1.setText("Sala:");

        btnSacuvajIzmenjenRepertoar.setText("Sačuvaj izmene");
        btnSacuvajIzmenjenRepertoar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajIzmenjenRepertoarActionPerformed(evt);
            }
        });

        btnZatvori.setText("Zatvori");
        btnZatvori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZatvoriActionPerformed(evt);
            }
        });

        cmbSala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtDatum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy"))));
        txtDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatumActionPerformed(evt);
            }
        });

        btnDodajFilm.setText("Dodaj film");
        btnDodajFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajFilmActionPerformed(evt);
            }
        });

        jLabel2.setText("Datum:");

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 3, 14)); // NOI18N
        jLabel4.setText("FILMOVI");

        btnObrisiFilm.setText("Obriši film");
        btnObrisiFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiFilmActionPerformed(evt);
            }
        });

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

        txtCena.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCenaActionPerformed(evt);
            }
        });

        jLabel11.setText("Žanr:");

        txtVreme.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm:ss"))));

        jLabel12.setText("FilmID:");

        txtFilmId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel13.setText("Naziv filma:");

        txtNaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNazivActionPerformed(evt);
            }
        });

        jLabel14.setText("Trajanje(min):");

        cmbZanr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Cena(din):");

        jLabel16.setText("Godina:");

        jLabel17.setText("Vreme prikazivanja");

        txtTrajanje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTrajanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrajanjeActionPerformed(evt);
            }
        });

        txtGodina.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSacuvajIzmenjenRepertoar, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDodajFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNaziv)
                            .addComponent(txtFilmId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtFilmId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(txtVreme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDodajFilm))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObrisiFilm)
                    .addComponent(btnSacuvajIzmenjenRepertoar))
                .addGap(18, 18, 18)
                .addComponent(btnZatvori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajIzmenjenRepertoarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajIzmenjenRepertoarActionPerformed
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

            repertoar.setDatum(datum);
            repertoar.setBioskop(bioskop);
            repertoar.setSala(sala);
            repertoar.setAdministrator(administrator);
            repertoar.setFilmovi(filmovi);

            KontrolerKlijent.getInstance().izmeniRepertoar(repertoar);
            JOptionPane.showMessageDialog(this, "Uspešno ste izmenili repertoar.", "Obaveštenje", INFORMATION_MESSAGE);
            GlavnaForma gf = (GlavnaForma) getParent();
            gf.popuniTabelu();
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Neuspešna izmena.", "Obaveštenje", INFORMATION_MESSAGE);
            Logger.getLogger(IzmeniRepertoarForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSacuvajIzmenjenRepertoarActionPerformed

    private void btnZatvoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZatvoriActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnZatvoriActionPerformed

    private void txtDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatumActionPerformed

    private void btnDodajFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajFilmActionPerformed
        if (txtFilmId.getText().isEmpty() || txtNaziv.getText().isEmpty() || txtTrajanje.getText().isEmpty()
                || txtGodina.getText().isEmpty()
                || txtCena.getText().isEmpty() || txtVreme.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Sva polja moraju biti popunjena!", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ModelTabeleFilmovi tabela = (ModelTabeleFilmovi) tblFilmovi.getModel();
        long filmId=Long.parseLong(txtFilmId.getText());
        String nazivFilma = txtNaziv.getText();
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

    private void txtTrajanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrajanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrajanjeActionPerformed

    private void txtCenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCenaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajFilm;
    private javax.swing.JButton btnObrisiFilm;
    private javax.swing.JButton btnSacuvajIzmenjenRepertoar;
    private javax.swing.JButton btnZatvori;
    private javax.swing.JComboBox cmbBioskop;
    private javax.swing.JComboBox cmbSala;
    private javax.swing.JComboBox cmbZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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

    

    private void popuniPodatke() {
       try {
         SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        String datumString=sdf.format(repertoar.getDatum());
           txtDatum.setText(datumString);
            cmbBioskop.getModel().setSelectedItem(repertoar.getBioskop());
            cmbSala.getModel().setSelectedItem(repertoar.getSala());

            tblFilmovi.setModel(new ModelTabeleFilmovi(repertoar));
            ModelTabeleFilmovi model = (ModelTabeleFilmovi) tblFilmovi.getModel();
            
            ArrayList<Film> filmovi = model.vratiFilmove();
            Zanr z = filmovi.get(0).getZanr();
            cmbZanr.getModel().setSelectedItem(z);

        } catch (Exception ex) {
            Logger.getLogger(IzmeniRepertoarForma.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
}
