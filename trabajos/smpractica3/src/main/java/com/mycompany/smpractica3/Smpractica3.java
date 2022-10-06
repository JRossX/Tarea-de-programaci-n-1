/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.smpractica3;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Smpractica3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //**Ejercicio 1**//
        int pits = 0;
        int promediopits = 0;
        int vuelta = 0;
        int promediovuelta = 0;
        int porcentaje = 0;
        for (int i = 0; i < 10; i++) {
            String pitsLectura = JOptionPane.showInputDialog("Ingrese el tiempo de los pits: ");
            pits = Integer.parseInt(pitsLectura);
            promediopits = promediopits + pits;

            String vueltaLectura = JOptionPane.showInputDialog("Ingrese el tiempo por cada vuelta realizada: ");
            vuelta = Integer.parseInt(vueltaLectura);
            promediovuelta = promediovuelta + vuelta;

            porcentaje = (promediovuelta * 100) / promediopits;

        }
        System.out.println("El promedio del total de las 10 vuelta en los pits es de: " + promediopits / 10);
        System.out.println("El promedio del total de las 10 vuelta es de: " + promediovuelta / 10);
        System.out.println("porcentaje: " + porcentaje);

        //**Ejercicio 2**//
        int n = 1;
        int estatura = 0;
        int cantidad_menos100 = 0;
        int cantidad_menos120 = 0;
        int cantidad_menos130 = 0;
        int cantidad_menos140 = 0;
        int cantidad_mas140 = 0;
        int promedioesta = 0;
        int contadoresta = 1;
        int menor_estatura = 0;
        while (n >= 1) {
            String estaturaLectura = JOptionPane.showInputDialog("Ingrese la estatura a calcular:  (Para salir ingerese el numero: 0)");
            estatura = Integer.parseInt(estaturaLectura);
            promedioesta = promedioesta + estatura;
            if (n == 1) {
                menor_estatura = estatura;
            } else if (estatura < menor_estatura) {
                menor_estatura = estatura;
            }
            if (n < 99) {
                cantidad_menos100 = cantidad_menos100 + 1;
            }
            if (n >= 100 && n <= 120) {
                cantidad_menos120 = cantidad_menos120 + 1;
            }
            if (n >= 121 && n <= 130) {
                cantidad_menos130 = cantidad_menos130 + 1;
            }
            if (n >= 131 && n <= 140) {
                cantidad_menos140 = cantidad_menos140 + 1;
            }
            if (n > 140) {
                cantidad_mas140 = cantidad_mas140 + 1;
            }
            contadoresta = contadoresta + 1;
            n = estatura;

        }
        System.out.println("Niños de estatura inferior a 100cm: " + cantidad_menos100);
        System.out.println("Niños de estatura entre los 100cm y 120cm: " + cantidad_menos120);
        System.out.println("Niños de estatura entre los 121cm y 130cm: " + cantidad_menos130);
        System.out.println("Niños de estatura entre los 131cm y 140cm: " + cantidad_menos140);
        System.out.println("Niños de estatura mayor a 140cm: " + cantidad_mas140);
        System.out.println("El promedio de las estaturas es de: " + promedioesta / contadoresta);

    }

}
