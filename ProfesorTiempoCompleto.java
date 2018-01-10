/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Requenes
 */
public class ProfesorTiempoCompleto extends Profesor{
int HORAS_SEMANALES = 40;

    public ProfesorTiempoCompleto(String cedula, String nombres, String apellidos, int horasClase, String carrera) {
        super(cedula, nombres, apellidos, horasClase, carrera);
    }

    
    public int horasComplementarias() {
        int hc =HORAS_SEMANALES-ProfesorTiempoCompleto.super.getHorasClase();
        return hc;
    }

    
}
