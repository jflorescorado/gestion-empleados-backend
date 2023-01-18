package com.gestion.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.modelo.Empleado;

@Repository
public interface EmpleadoRepostorio extends JpaRepository<Empleado, Long>{

}
