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

    /* 
    public static void ordenarSeleccion(int[] arreglo) { 
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

    /*
    public static void ordenarInsercion(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) { 
            int key = arreglo[i]; 
            int j = i - 1; 
            
            while (j >= 0 && arreglo[j] > key) { 
                arreglo[j + 1] = arreglo[j]; 
                j--; 
            }
            arreglo[j + 1] = key; 
        }
    }
    */

    public static void quickSort(int[] arreglo, int inicio, int fin) { 
        if (inicio < fin) { 
            int pivote = particion(arreglo, inicio, fin); 
            quickSort(arreglo, inicio, pivote - 1); 
            quickSort(arreglo, pivote + 1, fin); // q cool
        }
    }

    private static int particion(int[] arreglo, int inicio, int fin) { 
        int pivote = arreglo[fin]; 
        int i = inicio - 1; 

        for (int j = inicio; j < fin; j++) { 
            if (arreglo[j] < pivote) { 
                i++; 
                int temp = arreglo[i]; 
                arreglo[i] = arreglo[j]; 
                arreglo[j] = temp; 
            }
        }

        int temp = arreglo[i + 1]; 
        arreglo[i + 1] = arreglo[fin]; 
        arreglo[fin] = temp; 

        return i + 1; 
    }
}
