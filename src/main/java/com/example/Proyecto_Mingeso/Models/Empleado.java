package com.example.Proyecto_Mingeso.Models;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Empleado {
    @Id
    @Column(name = "id")
    private Integer id;
    @NotNull
    private String Nombres;
    @NotNull
    private String Apellidos;
    @NotNull
    private String Rut;
    @NotNull
    private char Categoria;
    @NotNull
    private float Sueldo_bruto;
    @NotNull
    private int anno_contratacion;
    @NotNull
    private int mes_contratacion;

}
