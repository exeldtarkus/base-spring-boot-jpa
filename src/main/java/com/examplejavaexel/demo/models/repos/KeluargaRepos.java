package com.examplejavaexel.demo.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.examplejavaexel.demo.models.entities.Keluarga;

/* dalam membuat reporitory harus menggunakan interface dan juga memanggil entiti dari table sql sebagai contoh:
 *  ( public interface KeluargaRepos extends CrudRepository<Keluarga, Long> )
 * 
 * Keluarga adalah entiti sql dan Long adalah tipe dari primary key nya 
 */
public interface KeluargaRepos extends CrudRepository<Keluarga, Long>{
    
}
