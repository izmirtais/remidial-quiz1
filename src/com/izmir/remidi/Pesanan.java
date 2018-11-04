package com.izmir.remidi;

/**
 *
 * @author Izmir
 */
public class Pesanan {
private String namaBrg;
    private int harga;
    private int jumlahBrg;
    
    public Pesanan() {
        
    }
    
    public Pesanan(String namaBrg, int harga, int jumlahBrg) {
        this.namaBrg = namaBrg;
        this.harga = harga;
        this.jumlahBrg = jumlahBrg;
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

    public int getJumlahBrg() {
        return jumlahBrg;
    }

    public void setJumlahBrg(int jumlahBrg) {
        this.jumlahBrg = jumlahBrg;
    }
    
        public int hitungBiaya(int jumlahBrg) {
        return harga * jumlahBrg;
    }
}

