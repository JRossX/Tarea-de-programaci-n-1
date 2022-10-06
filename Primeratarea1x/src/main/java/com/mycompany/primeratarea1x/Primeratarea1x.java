/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primeratarea1x;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Primeratarea1x {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int edad;
        String edadLec;
        
        edadLec = JOptionPane.showInputDialog(" Ingrese la edad a consultar: ");
        edad = Integer.parseInt(edadLec);
        
        if (edad >= 1 && edad <= 5){
            System.out.println("Primera Infancia");
        }
        if (edad >= 6 && edad <= 11){
            System.out.println("Infancia");
        }
        if (edad >= 12 && edad <= 18){
            System.out.println("Adolescencia");
        }
        if (edad >= 19 && edad <= 30){
            System.out.println("Juventud");
        }
        if (edad >= 31 && edad <= 59){
            System.out.println("Adultez");
        }
        if (edad >= 60 ){
            System.out.println("Persona Mayor");
        }
    }
}
