/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttareasemana4Folder1;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Clase1 {
    
    public String curso;
    public int edad;
    public int aula; //Instituto que dejararía elegir su grupo o aula
    public String nombre;
    public String nombre2;

    public static void escuela() {
        System.out.println("ttareasemana4Folder1.Clase1.escuela()");
    }

    public void ingresar() {
        nombre2 = JOptionPane.showInputDialog("Ingrese del tutor legal: ");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre menor: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de" + nombre));
        curso = JOptionPane.showInputDialog("Ingrese la materia: ");
        aula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la aula que desea estar el menor: "));
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "El nombre del menor es: " + nombre);
        JOptionPane.showMessageDialog(null, "la edad de " + nombre + " es de: " + edad);
        JOptionPane.showMessageDialog(null, "El curso matriculado es: " + curso);
        JOptionPane.showMessageDialog(null, "El aulo indicada sería: " + curso);
    }

    public void eliminarEstudiante() {
    }

    public void modificarDatos() {
    }

    public void becas() {
    }

    public void reglamento() {
    }

    public void costoDeMatricula() {
    }

    public void ListaDeDocenstes() {
    } //tambien para elegir el docente

    public void DatosdelaInstitucion() {
    }

    public void clasesvirtuales() {
    }

}
