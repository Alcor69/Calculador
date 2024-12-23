/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculador;

/**
 *
 * @author rb940
 */
public abstract class Operacion {
    public abstract void realizarOperacion();
    
    // Método para sumar los resultados de la tabla
    public double sumarTabla(int numero, int hasta) {
        double suma = 0;
        for (int i = 1; i <= hasta; i++) {
            suma += numero * i;
        }
        return suma;
    }
    
    // Método para mostrar la tabla invertida
    public void mostrarTablaInvertida(int numero) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
