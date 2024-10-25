package com.borisfdev.crud.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "table_registro_diario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistroDiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;

    private LocalDate fecha;
    private byte cantidadCortes;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
    
}
