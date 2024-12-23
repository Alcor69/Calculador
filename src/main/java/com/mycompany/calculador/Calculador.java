/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculador;

import java.util.Scanner;

/**
 *
 * @author rb940
 */
public class Calculador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el número máximo hasta el cual se deben mostrar las tablas
        System.out.print("Ingresa el número hasta el cual deseas ver las tablas (ejemplo: 5): ");
        int maxNumero = scanner.nextInt();
        
        double sumaTotal = 0;

        // Generar y mostrar las tablas de multiplicar
        for (int i = 2; i <= maxNumero; i++) {
            TablaMultiplicar tabla = new TablaMultiplicar(i);
            tabla.realizarOperacion();
            sumaTotal += tabla.sumarTabla(i, 10);
        }
        
        // Preguntar si se desean ver las tablas invertidas
        System.out.print("\n¿Quieres ver las tablas invertidas? (si/no): ");
        scanner.nextLine();  // Limpiar el buffer
        String respuesta = scanner.nextLine().toLowerCase();
        
        if (respuesta.equals("si")) {
            for (int i = 2; i <= maxNumero; i++) {
                System.out.println("\nTabla de multiplicar invertida del " + i + ":");
                TablaMultiplicar tablaInvertida = new TablaMultiplicar(i);
                tablaInvertida.mostrarTablaInvertida(i);
            }
        }
        
        // Mostrar la suma total de todas las tablas de multiplicar
        System.out.println("\nLa suma total de todas las tablas de multiplicar es: " + sumaTotal);
        
        scanner.close();
    }
}
