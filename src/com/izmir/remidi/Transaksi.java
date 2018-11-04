package com.izmir.remidi;

/**
 *
 * @author Izmir
 */
public class Transaksi {
    private String jenisByr;
    private int jmlhBrg;
    private int barang;
    private int diskon;
    
    public Transaksi() {
        
    }
    
    public Transaksi(String jenisByr, int jmlhBrg, int barang, int diskon) {
        this.jenisByr = jenisByr;
        this.jmlhBrg = jmlhBrg;
        this.barang = barang;
        this.diskon = diskon;
    }

    public String getJenisByr() {
        return jenisByr;
    }

    public void setJenisByr(String jenisByr) {
        this.jenisByr = jenisByr;
    }
    

    public int getJmlhBrg() {
        return jmlhBrg;
    }

    public void setJmlhBrg(int jmlhBrg) {
        this.jmlhBrg = jmlhBrg;
    }

    public int getBarang() {
        return barang;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public void setBarang(int barang) {
        this.barang = barang;
    }
    public int biayaTambahan(int harga) {
        return harga * diskon;
    }
}