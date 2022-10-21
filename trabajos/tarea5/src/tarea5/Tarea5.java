/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5;

import javax.swing.JOptionPane;

public class Tarea5 {
    
    public static void main(String[] args) {
       CuentaBancaria cuenta = new CuentaBancaria();
       cuenta.leerInfo();
       boolean menu = true;
       while(menu == true){
         String seleccion = cuenta.menu();
          switch(seleccion){
              case "1" -> cuenta.mostrarInfo(cuenta.numero_Cuenta, cuenta.identificacion, cuenta.saldo_actual, cuenta.tasa_interes);
              case "2" -> {cuenta.CalcularInter();}
              case "3" -> cuenta.ActualizarSaldo(cuenta.saldo_actual, cuenta.tasa_interes);
              case "4" -> cuenta.Deposito();
              case "5" -> cuenta.Retirar();
              case "6" -> menu = false;
            }
       }
    }

}
