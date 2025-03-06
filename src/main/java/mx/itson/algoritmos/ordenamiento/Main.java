/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.algoritmos.ordenamiento;

/**
 *
 * @author Propietario
 */

public class Main {
    
    public static void main(String[] args) {
        
        int[] numeros = {7, 10, 24, 9, 3, 14, 6, 4, 2};
        Ordenamientos.ordenarBurbuja(numeros);
        for (int numero : numeros){
            System.out.print(numero + ", "); // Numeros separados con coma.
        }
    }
}

