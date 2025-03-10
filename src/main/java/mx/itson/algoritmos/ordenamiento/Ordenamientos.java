/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.algoritmos.ordenamiento;

/**
 *
 * @author Propietario
 */

public class Ordenamientos { // Declaración de la clase Ordenamientos

    /**
     * Ordena un arreglo de enteros en orden ascendente usando el método de selección.
     * @param arreglo el arreglo a ordenar
     */
    public static void ordenarSeleccion(int[] arreglo) { // Método que implementa el algoritmo de selección
        for (int i = 0; i < arreglo.length - 1; i++) { // Bucle exterior: recorre cada elemento del arreglo
            int minimo = i; // Asigna el índice actual como el índice del valor mínimo
            
            for (int j = i + 1; j < arreglo.length; j++) { // Bucle interior: encuentra el valor mínimo en el resto del arreglo
                if (arreglo[j] < arreglo[minimo]) { // Compara el valor actual con el valor mínimo encontrado
                    minimo = j; // Actualiza el índice del valor mínimo si se encuentra un valor más pequeño
                }
            }
            int temporal = arreglo[minimo]; // Guarda el valor mínimo encontrado en una variable temporal
            arreglo[minimo] = arreglo[i]; // Intercambia el valor mínimo con el valor actual
            arreglo[i] = temporal; // Coloca el valor mínimo en su posición correcta en el arreglo
        }
    }
    
    /*
    public static void ordenarBurbuja(int[] arreglo) {
        // Realiza múltiples pasadas por el arreglo
        
        for (int pasada = 1; pasada < arreglo.length; pasada++) {
            
            // Compara y ordena elementos adyacentes
            for (int indice = 0; indice < arreglo.length - pasada; indice++) {
                if (arreglo[indice] > arreglo[indice + 1]) {
                    
                    // Intercambia los elementos si están en el orden incorrecto
                    int temporal = arreglo[indice];
                    arreglo[indice] = arreglo[indice + 1];
                    arreglo[indice + 1] = temporal;
                }
            }
        }
    }
    */
}
