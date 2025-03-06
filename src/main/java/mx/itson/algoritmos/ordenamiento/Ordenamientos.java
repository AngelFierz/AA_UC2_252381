/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.algoritmos.ordenamiento;

/**
 *
 * @author Propietario
 */

public class Ordenamientos {

    /**
     * Ordena un arreglo de enteros, Esto de forma ascendente por el metodo de burbuja ouyeah
     * @param arreglo el arreglo a ordenar
     */
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
}
