package com.gestioneventos.Repository;

import com.gestioneventos.Models.Evento;
import com.gestioneventos.Models.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FuncionRepo extends JpaRepository<Funcion,Long> {
    @Query(value = "SELECT e FROM Evento e JOIN Funcion f ON e.id = f.evento.id " +
            "JOIN Recinto r ON f.recinto.nombre= r.nombre WHERE r.tipo = :tipo_recinto")
    List<Evento> findCartelera(@Param("tipo_recinto") String tipo);
}
