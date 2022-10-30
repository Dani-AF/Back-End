/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.DanielaBarrera.Service;

import com.portfolio.DanielaBarrera.Entity.skills;
import com.portfolio.DanielaBarrera.Repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pc
 */
@Transactional
@Service
public class SSkills {
    @Autowired
    RSkills rskills;
    
    public List<skills> list(){
        return rskills.findAll();
    }
    
    public Optional<skills> getOne(int id){
        return rskills.findById(id);
    }
    
    public Optional<skills> getByNombre(String nombre){
        return rskills.findByNombre(nombre);
    }
    
    public void save(skills skill){
        rskills.save(skill);
    }
    
    public void delete(int id){
        rskills.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rskills.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rskills.existsByNombre(nombre);
    }
}


