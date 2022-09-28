package com.example.Proyecto_Mingeso.Controllers;


import com.example.Proyecto_Mingeso.Repositories.EmpleadoRepository;
import com.example.Proyecto_Mingeso.Services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public String listarEmpleados(Model modelo){
        modelo.addAttribute("empleados", empleadoService.listarTodosEmpleados());
        return "empleados"; //nos retorna al archivo empleados
    }

}
