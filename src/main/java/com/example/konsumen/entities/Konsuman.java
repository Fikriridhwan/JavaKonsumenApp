package com.example.konsumen.entities;

import javax.persistence.*;

@Entity
@Table(name = "konsumen")
public class Konsuman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nama", length = 45)
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "kota", length = 20)
    private String kota;

    @Column(name = "provinsi", length = 20)
    private String provinsi;

    @Column(name = "tgl_registrasi")
    private Double tglRegistrasi;

    @Column(name = "status", length = 9)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Double getTglRegistrasi() {
        return tglRegistrasi;
    }

    public void setTglRegistrasi(Double tglRegistrasi) {
        this.tglRegistrasi = tglRegistrasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}