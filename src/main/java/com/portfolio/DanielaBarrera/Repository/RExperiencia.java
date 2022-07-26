/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.DanielaBarrera.Repository;

import com.portfolio.DanielaBarrera.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
           public Optional<Experiencia> finByNombreE(String nombreE);
           public boolean existByNombreE(String nombreE);

    public boolean existById(int id);

    public boolean existsByNombreE(String nombreE);

    public Optional<Experiencia> findByNombreE(String nombreE);
    
}
