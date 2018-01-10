/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Requenes
 */
public abstract   class Profesor {

private String cedula;
private String nombres;
private String apellidos;
private int horasClase;
private String carrera;

    public Profesor(String cedula, String nombres, String apellidos, int horasClase, String carrera) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.horasClase = horasClase;
        this.carrera = carrera;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    

public abstract int horasComplementarias();

    @Override
    public String toString() {
        return  "cedula=" + cedula + ", nombre=" + nombres + ", apellido=" + apellidos + ", horasClase=" + horasClase + ", carrera=" + carrera ;
    }



}
