/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculador;

/**
 *
 * @author rb940
 */
public class TablaMultiplicar extends Operacion {
    
    private int numero;
    
    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }
    
    // Implementación del método realizarOperacion
    @Override
    public void realizarOperacion() {
        System.out.println("\nTabla de multiplicar del " + numero + ":");
        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            double resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            suma += resultado;
        }
        System.out.println("Suma de los resultados: " + suma);
    }
    
}
