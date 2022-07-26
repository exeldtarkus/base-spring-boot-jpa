package com.examplejavaexel.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplejavaexel.demo.models.entities.Keluarga;
import com.examplejavaexel.demo.models.repos.KeluargaRepos;

@Service
@Transactional
public class KeluargaService {
    
    /* Autorwired digunakan untuk memanggil fungsi lain /  injeksi fungsi lain */
    @Autowired 
    private KeluargaRepos keluargaRepos;

    /* memanggil entities Keluarga sebagai gata setter getter untuk proses CRUD */
    public Keluarga create(Keluarga keluarga) {
        return keluargaRepos.save(keluarga);
    }

    public Keluarga findOne(Long id) {
        return keluargaRepos.findById(id).get();
    }

    public List<Keluarga> findAll() {
        return (List<Keluarga>) keluargaRepos.findAll();
    }

    // public void removeOne(Long id) {
    //     return keluargaRepos.deleteById(id);
    // }
}
