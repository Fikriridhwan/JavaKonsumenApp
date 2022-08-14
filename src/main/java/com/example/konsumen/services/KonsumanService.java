package com.example.konsumen.services;

import com.example.konsumen.entities.Konsuman;
import com.example.konsumen.repositories.KonsumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KonsumanService {

    KonsumanRepository konsumanRepository;

    @Autowired
    public KonsumanService(KonsumanRepository konsumanRepository) {
        this.konsumanRepository = konsumanRepository;
    }

    public List<Konsuman> getAllKonsuman(){ return konsumanRepository.findAll();}

    public Optional<Konsuman> getByIdKonsuman(int id){ return konsumanRepository.findById(id);}

    public Konsuman saveKonsuman(String nama, String alamat, String kota, String provinsi, String status){
        Konsuman konsumen = new Konsuman();

        if(status.compareToIgnoreCase("aktif") == 0 || status.compareToIgnoreCase("non-aktif") == 0){
            konsumen.setStatus(status.toUpperCase());
            konsumen.setNama(nama);
            konsumen.setAlamat(alamat);
            konsumen.setKota(kota);
            konsumen.setProvinsi(provinsi);
            konsumen.setTglRegistrasi((double)System.currentTimeMillis());
            konsumanRepository.save(konsumen);
        }
        return konsumen;
    }

    public String deleteKonsuman(Integer id){
        try {
            konsumanRepository.deleteById(id);
            return "delete succes id:" + id;
        } catch (Exception e) {
            return "detele failed";
        }
    }

}
