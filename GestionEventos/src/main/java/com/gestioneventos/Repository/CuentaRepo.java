package com.gestioneventos.Repository;

import com.gestioneventos.Models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepo extends JpaRepository<Cuenta,String> {
}
