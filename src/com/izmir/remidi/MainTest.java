package com.izmir.remidi;

/**
 *
 * @author Izmir
 */
public class MainTest {
    public static void main(String[] args) {
        Driver d = new Driver("A01", "Yuwana Adipati Ayala");
        Pesanan p = new Pesanan("Pizza Hot America Bread", 125000, 3);
        Transaksi transaksi = new Transaksi();
        transaksi.setDiskon(10000);
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setTransaksi(transaksi);
        pelanggan.setNama("Izmir Ta'is Khasna Lugazi");
        pelanggan.setJmlBrg(3);
        pelanggan.setPesanan(p);
        System.out.println("Driver yang Melayani        : "+ d.getNama());
        System.out.println("Kode Driver                 : "+ d.getKode());
        System.out.println("========================================================");
        System.out.println("Pembeli                     : "+ pelanggan.getNama());
        System.out.println("Nama Pesanan                : "+ pelanggan.getPesanan().getNamaBrg());
        System.out.println("Jumlah Pesanan              : "+ p.getJmlhBrg());
        System.out.println("Jenis Pembayaran            : Tunai ");
        System.out.println("Total Belanja dengan Tunai  : "+ pelanggan.biayaBelanjaTotalTunai());
        System.out.println("Jenis Pembayaran            : Debit");
        System.out.println("Total Belanja dengan Debit  : "+ pelanggan.biayaBelanjaTotalDebit());
    }
}
