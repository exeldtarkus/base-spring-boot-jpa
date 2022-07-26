package com.examplejavaexel.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplejavaexel.demo.models.entities.Keluarga;
import com.examplejavaexel.demo.services.KeluargaService;


/* Dalam Spring-Boot :
 *  Controller biasanya digunakan base untuk get api-nya
 * 
 *  Services digunakan sebagai layer fungsi sebelum melakukan CRUD di database
 * 
 *  Entitis digunakan untuk melakukan table mapping antara spring-boot dan database
 * 
 *  Repository digunakan untuk menulis query sql CRUD
 */


@RestController
@RequestMapping("/api/keluarga")
public class KeluargaController {

    @Autowired
    KeluargaService keluargaService;

    @GetMapping("/welcome")
    public String welcome() {

        return "Welcome Exel";
    }

    /* Tidak menggunakan tanda kurung pada @GetMapping berarti route api-nya mengikuti @RequestMapping */
    @GetMapping
    public List<Keluarga> allMembers() {
        return keluargaService.findAll();
    }

    @PostMapping
    public Keluarga createData(@RequestBody Keluarga keluarga) {
        return keluargaService.create(keluarga);
    }
    
}
