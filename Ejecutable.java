
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bryan Requenes
 */
public class Ejecutable {

    public static void main(String[] args) {
ListaProfesores lista = new ListaProfesores();
        int opcion = -1;
        while (opcion != 4) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion\n"
                    + "1. Ingresar Profesor Tiempo Parcial\n"
                    + "2. Ingresar Profesor Medio Tiempo\n"
                    + "3. Ingresar Profesor Tiempo Completo\n"
                    + "4. Salir\n"));
            switch (opcion) {
                case 1:
                    
                    String cedula =JOptionPane.showInputDialog(null,"Ingrese cedula del Profesor");
                    String nombres=JOptionPane.showInputDialog(null,"Ingrese nombre del Profesor");;
                    String apellidos=JOptionPane.showInputDialog(null,"Ingrese apellido del Profesor");;
                    int horasClase;
                     
                    do {
                        horasClase=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las horas de clase del Profesor(ENTRE 2 A 9 HORAS)"));
                       } while (horasClase < 2 || horasClase > 9);

                    String carrera=JOptionPane.showInputDialog(null,"Ingrese la carrera del Profesor");;
                    ProfesorTiempoParcial pp=new ProfesorTiempoParcial(opcion, cedula, nombres, apellidos, opcion, carrera);
                    
                    lista.agregar(pp);
                    break;
                case 2:
                    String cedula1 =JOptionPane.showInputDialog(null,"Ingrese cedula del Profesor");
                    String nombres1=JOptionPane.showInputDialog(null,"Ingrese nombre del Profesor");;
                    String apellidos1=JOptionPane.showInputDialog(null,"Ingrese apellido del Profesor");;
                    int horasClase1;
                     
                    do {
                        horasClase1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la hora(OBLIGATORIAMENTE 10)"));
                       } while (horasClase1 !=10);

                    
                    String carrera1=JOptionPane.showInputDialog(null,"Ingrese la carrera del Profesor");;
                    ProfesorMedioTiempo pm=new ProfesorMedioTiempo(cedula1, nombres1, apellidos1, horasClase1, carrera1);
                    lista.agregar(pm);
                    break;
                case 3:
                    String cedula2 =JOptionPane.showInputDialog(null,"Ingrese cedula del Profesor");
                    String nombres2=JOptionPane.showInputDialog(null,"Ingrese nombre del Profesor");;
                    String apellidos2=JOptionPane.showInputDialog(null,"Ingrese apellido del Profesor");;
                    int horasClase2; 
                    do {
                        horasClase2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las horas de clase del Profesor(ENTRE 3 A 16 HORAS)"));
                       } while (horasClase2 < 3 || horasClase2 > 16);
                    String carrera2=JOptionPane.showInputDialog(null,"Ingrese la carrera del Profesor");;
                    ProfesorTiempoCompleto pc=new ProfesorTiempoCompleto(cedula2, nombres2, apellidos2, horasClase2, carrera2);
                    lista.agregar(pc);
                    break;
                case 4:
                     lista.grabar();
                     JOptionPane.showMessageDialog(null, "Saliendo........");
                    break;
                default : JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");

            }

        }
    }
}
