/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.algoritmos.ordenamiento;

/**
 *
 * @author Propietario
 */

public class Main { // Declaración de independencia de la clase mamaimaiamin
    
    public static void main(String[] args) { // Metodo principal, creo que era entry point
        
        int[] numeros = {10, 4, 24, 3, 8, 12}; // Arreglos, son 6
        
        //Ordenamientos.ordenarBurbuja(numeros); // de ordenamientos. ordenarburbuja a numeros
        Ordenamientos.ordenarInsercion(numeros); // de ordenamientos. ordenarseleccion a numeros
        
        for (int numero : numeros) { 
            System.out.print(numero + ", "); // Imprime la lista de arriba pero con una coma.
        }
        
    }
}

