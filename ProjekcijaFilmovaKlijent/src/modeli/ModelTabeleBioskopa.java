/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

import domen.Bioskop;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class ModelTabeleBioskopa extends AbstractTableModel {
ArrayList<Bioskop> lista;
    String[] kolone = {"Naziv", "Grad","Adresa"};

    public ModelTabeleBioskopa() {
        lista = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return kolone[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bioskop stavkaListe = lista.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return stavkaListe.getNaziv();
            case 1:
                return stavkaListe.getGrad();
            case 2:
                return stavkaListe.getAdresa();
            default:
                return "return!";
        }
    }

    public Bioskop vratiBioskop(int red) {
        return lista.get(red);
    }

    public void popuniBioskope(ArrayList<Bioskop> bioskopi) {
        lista=bioskopi;
        fireTableDataChanged();
    }
   
}
