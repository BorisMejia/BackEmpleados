package com.borisfdev.crud.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.borisfdev.crud.models.RegistroDiario;

@Repository
public interface RegistroDiarioRepository extends JpaRepository<RegistroDiario, Byte> {

    
}
