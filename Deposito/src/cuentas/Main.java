/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author Manuel Garcia
 */
public class Main {

    /**
    * Método principal que inicia la operación de la cuenta bancaria.
    * 
    * @param args.
    */
    public static void main(String[] args) {

        operativa_cuenta();

    }
    
    /**
     * Método que lleva a cabo la operativa de una cuenta bancaria.
     */
    private static void operativa_cuenta() {

        CCuenta cuenta1;
        double saldoActual;
        float cantidad;
        
        // Creamos una instancia de CCuenta y la inicializamos con valores.
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        // Obtenemos el saldo actual de la cuenta y lo mostramos.
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        // Realizamos un retiro y mostramos el saldo actualizado.
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        // Realizamos un ingreso y mostramos el saldo actualizado.
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
