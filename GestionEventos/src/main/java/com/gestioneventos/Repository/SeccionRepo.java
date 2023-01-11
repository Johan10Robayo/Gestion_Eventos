package com.gestioneventos.Repository;

import com.gestioneventos.Models.Seccion;
import com.gestioneventos.Models.SeccionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeccionRepo extends JpaRepository<Seccion, SeccionId> {

}
