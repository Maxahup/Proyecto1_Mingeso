package com.example.Proyecto_Mingeso.Services;

import com.example.Proyecto_Mingeso.Models.Empleado;

import java.util.List;

public interface EmpleadoService {

    public List<Empleado> listarTodosEmpleados();

    public List<Empleado> generatePayment();

    public Empleado obtenerEmpleadoId(Integer id);

    public Empleado actualizarEmpleado(Empleado empleado);

}
