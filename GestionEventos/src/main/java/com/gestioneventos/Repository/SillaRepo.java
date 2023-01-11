package com.gestioneventos.Repository;

import com.gestioneventos.Models.Persona;
import com.gestioneventos.Models.SillaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SillaRepo extends JpaRepository<Persona, SillaId> {
}
