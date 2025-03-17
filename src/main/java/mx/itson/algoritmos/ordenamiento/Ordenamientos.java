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

   /* public static void ordenarSeleccion(int[] arreglo) { 
        for (int i = 0; i < arreglo.length - 1; i++) { 
            int minimo = i; 
            
            for (int j = i + 1; j < arreglo.length; j++) { 
                if (arreglo[j] < arreglo[minimo]) { 
                    minimo = j;
                }
            }
            int temporal = arreglo[minimo]; 
            arreglo[minimo] = arreglo[i]; 
            arreglo[i] = temporal; 
        }
    }*/

    public static void ordenarInsercion(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) { 
            int key = arreglo[i]; 
            int j = i - 1; 

            
            while (j >= 0 && arreglo[j] > key) { 
                arreglo[j + 1] = arreglo[j]; 
                j--; 
            }
            arreglo[j + 1] =key; 
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
