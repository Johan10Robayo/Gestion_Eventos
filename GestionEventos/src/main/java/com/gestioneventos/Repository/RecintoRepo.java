package com.gestioneventos.Repository;

import com.gestioneventos.Models.Recinto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecintoRepo extends JpaRepository<Recinto,String> {
}
