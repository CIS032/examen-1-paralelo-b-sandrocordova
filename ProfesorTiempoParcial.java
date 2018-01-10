/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Requenes
 */
public class ProfesorTiempoParcial extends Profesor{

   private int horasSemanales;

    public ProfesorTiempoParcial(int horasSemanales, String cedula, String nombres, String apellidos, int horasClase, String carrera) {
        super(cedula, nombres, apellidos, horasClase, carrera);
        this.horasSemanales = horasSemanales;
    }



    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
    
  
    public int horasComplementarias() {
        int hc =getHorasSemanales()-ProfesorTiempoParcial.super.getHorasClase();
        return hc;
    }
    
   
}
