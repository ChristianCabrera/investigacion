
package Examen;

public class Rectangulo {
    private static double AreaTotal;
    private static double b;
    private static double a;
    
    public Rectangulo(){    
    }
    public Rectangulo(double base,double altura){
        Rectangulo.b = base;
        Rectangulo.a= altura;
    }

    public static double getAreaTotal() {
        return AreaTotal;
    }

    public static void setAreaTotal(double AreaTotal) {
        Rectangulo.AreaTotal = AreaTotal;
    }

    public static double getB() {
        return b;
    }

    public static void setB(double b) {
        Rectangulo.b = b;
    }

    public static double getA() {
        return a;
    }

    public static void setA(double a) {
        Rectangulo.a = a;
    }
    public static double CalcularArea(){
        AreaTotal=  b *a;
        return AreaTotal;
    }
}
