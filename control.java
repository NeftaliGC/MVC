public class control {
    public static void main(String[] args) {

        double lado;
        double perim;
        lado = VistaDatosCuadrado.pideLado();
        System.out.println("La medida del lado es: " + lado);
        perim = perimetro(lado);
        System.out.println("El perimetro es: " + perim);

    }

    public static double perimetro(double lado) {
        return lado * 4;
    }
}
