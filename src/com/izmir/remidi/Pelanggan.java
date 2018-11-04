package com.izmir.remidi;

/**
 *
 * @author Izmir
 */
public class Pelanggan {
    private String nama;
    private Pesanan pesanan;
    private Transaksi transaksi;
    private int jmlBrg;
    
    public Pelanggan() {
        
    }
    public Pelanggan(String nama, Pesanan pesanan, Transaksi transaksi, int jmlBrg){
        this.nama = nama;
        this.pesanan = pesanan;
        this.transaksi = transaksi;
        this.jmlBrg = jmlBrg;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Pesanan getPesanan() {
        return pesanan;
    }

    public void setPesanan(Pesanan pesanan) {
        this.pesanan = pesanan;
    }

    public int getJmlBrg() {
        return jmlBrg;
    }

    public void setJmlBrg(int jmlBrg) {
        this.jmlBrg = jmlBrg;
 
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }
    
    
    public int biayaBelanjaTotalTunai() {
        return pesanan.hitungBiaya(jmlBrg);
    }
    
    public int biayaBelanjaTotalDebit() {
        return pesanan.hitungBiaya(jmlBrg) - transaksi.biayaTambahan(jmlBrg);
    }
}
