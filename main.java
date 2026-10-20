/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo_de_ordenamiento;

/**
 *
 * @author aidas
 */
import java.util.Arrays;
public class main {
    
    // METODO 1: Ordenamiento Burbuja Tradicional
    public static void ordenamientoBurbuja(int[] arreglo) {
        int N = arreglo.length;
        // N-1 pasadas necesarias
        for (int i = 0; i < N - 1; i++) {
            // Recorrido hasta N-2 para poder comparar j con j+1 sin salirse
            for (int j = 0; j < N - 1; j++) {
                // Comparación con el vecino
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio con variable temp
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // METODO 2: Ordenamiento Burbuja Mejorado / Optimizado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int N = arreglo.length;
        for (int i = 0; i < N - 1; i++) {
            // Bandera booleana que se reinicia en cada pasada
            boolean huboIntercambio = false;

            // Optimización: N-1-i, no revisamos los que ya están ordenados al final
            for (int j = 0; j < N - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    huboIntercambio = true; // Si hubo intercambio
                }
            }

            // Si no hubo ningún intercambio, ya está ordenado y salimos con break
            if (!huboIntercambio) {
                break;
            }
        }
    }

    // CLASE PRINCIPAL: Pruebas en consola
    public static void main(String[] args) 
    {
       
        int[] arreglo1 = {5, 1, 4, 2, 8};
        int[] arreglo2 = {5, 1, 4, 2, 8};

       //Metodo normal
        System.out.println("Arreglo inicial: " + Arrays.toString(arreglo1));
        ordenamientoBurbuja(arreglo1);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo1));

        //metodo mejorado
        System.out.println("Arreglo inicial: " + Arrays.toString(arreglo2));
        ordenamientoBurbujaMejorado(arreglo2);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo2));
    }
        

        
    
}
