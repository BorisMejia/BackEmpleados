package com.borisfdev.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.borisfdev.crud.models.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Byte> {

    
}