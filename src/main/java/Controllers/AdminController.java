package Controllers;


import Models.Empleado;
import Repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    private EmpleadoRepository empleadoRepository;
    ModelAndView index(@PageableDefault(sort="anno_contratacion", size = 4) Pageable pageable) {
        Page<Empleado> empleados = empleadoRepository.findAll(pageable);

        return new ModelAndView("index").addObject("empleados", empleados);
    }
}
