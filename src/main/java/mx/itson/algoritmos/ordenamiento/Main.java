/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.algoritmos.ordenamiento;

/**
 *
 * @author Propietario
 */

public class Main { // Declaración de la clase Main
    
    public static void main(String[] args) { // Método principal, punto de entrada
        
        int[] numeros = {8, 4, 7, 3, 9, 2, 5}; // Arreglo de números a ordenar
        
        Ordenamientos.quickSort(numeros, 0, numeros.length - 1); // Llamada a quickSort con inicio y finnnnnnnnnnnnnnnnnnnnnnnn
        
        for (int numero : numeros) { 
            System.out.print(numero + ", "); // Imprime el arreglo ordenado con comas.
        }
    }
}

