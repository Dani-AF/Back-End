package com.portfolio.DanielaBarrera.Repository;

import com.portfolio.DanielaBarrera.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
