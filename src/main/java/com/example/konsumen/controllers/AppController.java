package com.example.konsumen.controllers;

import com.example.konsumen.entities.Konsuman;
import com.example.konsumen.services.KonsumanService;
import com.example.konsumen.viewmodels.KonsumanVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private KonsumanService konsumanService;

    @GetMapping("/")
    public String index(Model model){
        List<Konsuman> konsumanList = konsumanService.getAllKonsuman();
        List<KonsumanVM> konsumanVMS = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Konsuman request : konsumanList) {
            String tglRegistrasi = dateFormat.format(new Date(request.getTglRegistrasi().longValue()));
            konsumanVMS.add(new KonsumanVM(
                    request.getId().toString(),
                    request.getNama(),
                    request.getAlamat(),
                    request.getKota(),
                    request.getProvinsi(),
                    tglRegistrasi,
                    request.getStatus()));
        }

        model.addAttribute("data", konsumanVMS);
        return "index";
    }

    @RequestMapping("/konsumen")
    public String konsumenForm(Model model){
        model.addAttribute("data", new KonsumanVM());
        return "konsumen";
    }

    @PostMapping("/konsumen/save")
    public String saveData(KonsumanVM konsumanVM){
        System.out.println(konsumanVM.toString());
        Konsuman konsumen = konsumanService.saveKonsuman(konsumanVM.getNama(), konsumanVM.getAlamat(), konsumanVM.getKota(), konsumanVM.getProvinsi(), konsumanVM.getStatus());
        System.out.println(konsumen != null ? "save sukses": "save gagal");
        return "redirect:/";
    }
}
