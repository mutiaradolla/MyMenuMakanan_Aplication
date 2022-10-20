package com.example.mymenumakanan_aplication;

public class Kuliner {
    private String nama, deskripsi, harga;
    private int imgFoto;

    public Kuliner(String nama, String deskripsi, String harga, int imgFoto) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.imgFoto = imgFoto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }
}
