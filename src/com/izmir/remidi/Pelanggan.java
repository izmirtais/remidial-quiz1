package com.izmir.remidi;

/**
 *
 * @author Izmir
 */
public class Pelanggan {
    private String nama;
    private String pesanan;
    private Transaksi transaksi;
    private int biaya;
    
    public Pelanggan(){
        
    }

    public Pelanggan(String nama, String pesanan, int biaya) {
        this.nama = nama;
        this.pesanan = pesanan;
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
}
