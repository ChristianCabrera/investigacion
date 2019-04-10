package Examen;
import java.util.Scanner;
public class AreaRectangulo {
    public static void main (String[]args){
        double area;
        Scanner sc= new Scanner(System.in);
        Rectangulo Rec;
        System.out.println("ingresar ancho del rectangulo");
        double a=sc.nextDouble();
        System.out.println("ingrese alto del rectangulo");
        double b=sc.nextDouble();
        area= a*b;
        System.out.println("el area del rectangulo es =");
        System.out.println(area);
        System.out.println("cuanto cuesta por metro cuadrado");
        double costo = sc.nextDouble();
        Rectangulo.CalcularArea();
        System.out.println("Es costo total es: $ "+Precio.Calcular(Costo)+"$");
        System.out.println("El area de mesa:"Rec.getAreaTotal());
        
}
}