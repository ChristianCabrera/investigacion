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
public class Examen {
   
    public static void main(String[] args) {

        
        double totalCuenta;
        
        Dinero Cuenta1;
        Cuenta1 = new Dinero(121, 50);

        
        totalCuenta = Cuenta1.saldo();
        System.out.println("cantidad de dinero: " + totalCuenta + " $");

        
        double retiro = 12 +12 + 12 +12 ;
        System.out.println("precios : " + retiro + "$ ");
        Cuenta1.depositar(retiro);
        
        System.out.println("-------------------------------------------------");

        // Consultamos el saldo
        totalCuenta = Cuenta1.saldo();
        System.err.println("Cantidad de precios: 1 12 5 11 200 1000 10");
        System.out.println("Total actual: 2 $");        
        System.err.println("Resultado: 4");
    }
}
