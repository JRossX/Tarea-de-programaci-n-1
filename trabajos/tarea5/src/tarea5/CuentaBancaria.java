/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class CuentaBancaria {

    public String identificacion;
    public String numero_Cuenta;
    public double saldo_actual;
    public double tasa_interes = 0;

    public void leerInfo() {
        numero_Cuenta = JOptionPane.showInputDialog("Ingrese su numero de cuenta: ");
        identificacion = JOptionPane.showInputDialog("Ingrese su numero de Identificación: ");
        saldo_actual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su saldo actual: "));
        tasa_interes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese TASA INT: "));

    }

    public void mostrarInfo(String numCuenta, String id, double saldo, double tInteres) {
        JOptionPane.showMessageDialog(null, "Su número de cuenta es: " + numero_Cuenta);
        JOptionPane.showMessageDialog(null, "Su número de Identificacion: " + identificacion);
        JOptionPane.showMessageDialog(null, "Su saldo es de: " + saldo_actual);
        JOptionPane.showMessageDialog(null, "La tasa del Interés de este mes: " + tasa_interes);

    }

    public void CalcularInter() {
        double nuevo_saldo = saldo_actual * (tasa_interes / 100);
        JOptionPane.showMessageDialog(null, "La ganacia es de: " + nuevo_saldo);

    }

    public void ActualizarSaldo(double saldo, double tInteres) {
        saldo_actual = saldo + (saldo * (tInteres / 100));
        JOptionPane.showMessageDialog(null, "Su nuevo saldo es de: " + saldo_actual);
    }

    public void Deposito() {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el deposito: "));
        if (deposito <= 0) {
            JOptionPane.showMessageDialog(null, "Transacción erronia \nEl deposito debe ser mayor 0");
        } else {
            saldo_actual += deposito;
            JOptionPane.showMessageDialog(null, "Transacción exitosa");
        }
    }

    public void Retirar() {
        double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el retiro que desea realizar: "));
        if (retiro >= saldo_actual) {
            JOptionPane.showMessageDialog(null, "Transacción erronia \nsaldo insuficiente");

        } else if (retiro <= 0) {
            JOptionPane.showMessageDialog(null, "Transacción erronia \nEl retiro debe de ser mayor a 0");
        } else {
            saldo_actual = saldo_actual - retiro;
            JOptionPane.showMessageDialog(null, "Transacción exitosa");

        }

    }

    public String menu() {
        Menu menu = new Menu();
        String seleccion;
        seleccion = menu.menuPrincipal("                      MENU PRINCIPAL", "Leer informacion de cuenta", "Calcular intereses", "Actualizar saldo por interes mensual", "Depositar fondos", "Retirar fondos", "Cerrar Aplicacion");
        return seleccion;
    }
}
