package Examen2Del3Parcial;
import java.util.*;

public class Examen3  {

    public static void main(String argv[]) {
        Scanner scan = new Scanner(System.in);

        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        //tamaño de pilas y los numeros del arregllo
        System.out.println("digite el tamaño de la pila 1");
        int tama1 = scan.nextInt();
        int[] arreglo = new int[tama1];
        System.out.println("digite el tamaño de la pila 2");
        int tamaño2 = scan.nextInt();
        int[] arreglo2 = new int[tamaño2];
        System.out.println("digite el tamaño de la pila 3");
        int tamaño3 = scan.nextInt();
        int[] arreglo3 = new int[tamaño3];
        for (int x = 0; x < tama1; x++) {
            System.out.println("digite los numeros en el arreglo 1: ");
            arreglo[x] = scan.nextInt();
        }
        for (int x = 0; x < tamaño2; x++) {
            System.out.println("digite los numeros del arreglo 2: ");
            arreglo2[x] = scan.nextInt();
        }
        for (int x = 0; x < tamaño3; x++) {
            System.out.println("digite los numeros del arreglo 3: ");
            arreglo3[x] = scan.nextInt();
        }


        System.out.println("Pila 1: " + Arrays.toString(arreglo));
        System.out.println("Pila 2: " + Arrays.toString(arreglo2));
        System.out.println("Pila 2: " + Arrays.toString(arreglo3));
        System.out.println("Resultado: " + alturaMaxima(arreglo, arreglo2, arreglo3, tama1, tamaño2, tamaño3));




    }
    public static int alturaMaxima(int pila1[], int pila2[], int pila3[], int tama1, int tamaño2, int tamaño3) {
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        for (int i=0; i < tama1; i++) {
            s1 += pila1[i];
        }

        for (int i=0; i < tamaño2; i++) {
            s2 += pila2[i];
        }

        for (int i=0; i < tamaño3; i++) {
            s3 += pila3[i];
        }

        int altura1 =0;
        int altura2 = 0;
        int altura3 = 0;
        int resultado = 0;

        while (true) {
            if (altura1 == tama1 || altura2 == tamaño2 || altura3 == tamaño3) {
                return 0;
            }

            if (s1 == s2 && s2 == s3) {
                return s1;
            }
            //operacion del resultado de las pilas
            if (s1 >= s2 && s1 >= s3) {
                s1 -= pila1[altura1++];
            } else if (s2 >= s3 && s2 >= s3) {
                s2 -= pila2[altura2++];
            } else if (s3 >= s2 && s3 >= s1) {
                s3 -= pila3[altura3++];
            }
        }
    }



}
