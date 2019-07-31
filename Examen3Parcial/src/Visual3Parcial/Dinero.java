/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual3Parcial;

/**
 *
 * @author tetzu
 */
public class Dinero {
     private int numeroCuenta;
    private double saldo;
    
    public Dinero(int cuenta, double inicial) {
        numeroCuenta = cuenta;
        saldo = inicial;
    } // Fin del constructor cuenta

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    } // Fin del método depositar

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    } // Fin del método retirar

    public double saldo() {
        return saldo;
    } // Fin del método saldo    
    
}