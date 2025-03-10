/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.algoritmos.ordenamiento;

/**
 *
 * @author Propietario
 */
public class Seleccion {
    public static void ordenarSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++){
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
    }
 } // Sii yo hice esto de forma profesionals
    
