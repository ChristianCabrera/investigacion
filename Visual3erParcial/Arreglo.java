/**
 *
 * @author tetzu
 */
public class Arreglo {
    private static int numeros[] = { 0,1,1,0,1,0,1};
 
    public static void main(String[] args) {
        //imprimimos por pantalla el arreglo de números enteros
        System.out.println("Arreglo sin orden:");
        for (int num : numeros) {
            System.out.println(num);
        }
 
        System.out.println();
        //ordenamos en forma ascendente el arreglo de números enteros y lo imprimimos 
        System.out.println("Orden ascendente:");
        ordSelAsc(numeros);
        for (int num : numeros) {
            System.out.println(num);
        }
 
        System.out.println();
    }
    /**
     * Este método ordena en forma ascendente 
     */
    static void ordSelAsc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int min = i;
 
            //buscamos el menor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;    
                }
            }
 
            if (i != min) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
    }
}