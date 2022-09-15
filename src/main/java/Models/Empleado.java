package Models;

import java.util.Date;

public class Empleado {
    private String Nombre;
    private String Rut;
    private char Categoria;
    private double SueldoBruto;
    private Date FechaContratacion;

    public Empleado(String nombre, String rut, char categoria, double sueldoBruto, Date fechaContratacion) {
        Nombre = nombre;
        Rut = rut;
        Categoria = categoria;
        SueldoBruto = sueldoBruto;
        FechaContratacion = fechaContratacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String rut) {
        Rut = rut;
    }

    public char getCategoria() {
        return Categoria;
    }

    public void setCategoria(char categoria) {
        Categoria = categoria;
    }

    public double getSueldoBruto() {
        return SueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        SueldoBruto = sueldoBruto;
    }

    public Date getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        FechaContratacion = fechaContratacion;
    }
}
