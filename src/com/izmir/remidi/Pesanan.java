package com.izmir.remidi;

/**
 *
 * @author Izmir
 */
public class Pesanan {
private String namaBrg;
    private int harga;
    private int jmlhBrg;
    
    public Pesanan() {
        
    }
    
    public Pesanan(String namaBrg, int harga, int jmlhBrg) {
        this.namaBrg = namaBrg;
        this.harga = harga;
        this.jmlhBrg = jmlhBrg;
    }

    public String getNamaBrg() {
        return namaBrg;
    }

    public void setNamaBrg(String namaBrg) {
        this.namaBrg = namaBrg;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJmlhBrg() {
        return jmlhBrg;
    }

    public void setJmlhBrg(int jmlhBrg) {
        this.jmlhBrg = jmlhBrg;
    }
    
        public int hitungBiaya(int jmlhBrg) {
        return harga * jmlhBrg;
    }
}

