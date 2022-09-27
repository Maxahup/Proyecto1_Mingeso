package com.example.Proyecto_Mingeso.Repositories;

import com.example.Proyecto_Mingeso.Models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
