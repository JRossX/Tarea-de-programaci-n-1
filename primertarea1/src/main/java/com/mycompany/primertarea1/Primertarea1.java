/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.primertarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Primertarea1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int numero;
        String numeroLec;

        numeroLec = JOptionPane.showInputDialog(" Ingrese el número a consultar: ");
        numero = Integer.parseInt(numeroLec);

        if (numero == 1) {
            System.out.println("Mes de Enero, primer Cuatrimestre");
        } else if (numero == 2) {
            System.out.println("Mes de Febrero, primer Cuatrimestre");
        } else if (numero == 3) {
            System.out.println("Mes de Marzo, primer Cuatrimestre");
        } else if (numero == 4) {
            System.out.println("Mes de Abril, primer Cuatrimestre");
        }

        if (numero == 5) {
            System.out.println("Mes de Mayo, segundo Cuatrimestre");
        } else if (numero == 6) {
            System.out.println("Mes de Junio, segundo Cuatrimestre");
        } else if (numero == 7) {
            System.out.println("Mes de Julio, segundo Cuatrimestre");
        } else if (numero == 8) {
            System.out.println("Mes de Agosto, segundo Cuatrimestre");
        }

        if (numero == 9) {
            System.out.println("Mes de Septiembre, tercer Cuatrimestre");
        } else if (numero == 10) {
            System.out.println("Mes de Octubre, tercer Cuatrimestre");
        } else if (numero == 11) {
            System.out.println("Mes de Noviembre, tercer Cuatrimestre");
        } else if (numero == 12) {
            System.out.println("Mes de Diciembre, tercer Cuatrimestre");
        }

        //JRossX
    }
}