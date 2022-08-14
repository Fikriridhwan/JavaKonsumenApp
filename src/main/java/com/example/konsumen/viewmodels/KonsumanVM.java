package com.example.konsumen.viewmodels;

public class KonsumanVM {
    private String id;
    private String nama;
    private String alamat;
    private String kota;
    private String provinsi;
    private String tanggalRegistrasi;
    private String status;

    public KonsumanVM() {
    }

    public KonsumanVM(String id, String nama, String alamat, String kota, String provinsi, String tanggalRegistrasi, String status) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.provinsi = provinsi;
        this.tanggalRegistrasi = tanggalRegistrasi;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getTanggalRegistrasi() {
        return tanggalRegistrasi;
    }

    public void setTanggalRegistrasi(String tanggalRegistrasi) {
        this.tanggalRegistrasi = tanggalRegistrasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "KonsumanVM{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", kota='" + kota + '\'' +
                ", provinsi='" + provinsi + '\'' +
                ", tanggalRegistrasi='" + tanggalRegistrasi + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
