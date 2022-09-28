package com.example.Proyecto_Mingeso.Services;


import com.example.Proyecto_Mingeso.Models.Empleado;
import com.example.Proyecto_Mingeso.Repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImp implements EmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarTodosEmpleados(){

        return empleadoRepository.findAll();
    }

}
