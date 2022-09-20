public class Pentagono {
    private double lado, apotema;
    private int numeroDeLados = 5;



    public double getApotema() {
        return apotema;
    }
    public double getLado() {
        return lado;
    }

    public void setLado( double l ) {
        if (l < 0) {
            l *= -1;
        }
        lado = l;
    }
    
    public void setApotema( double a ) {
        if (a < 0) {
            a *= -1;
        }
        lado = a;
    }

    public double perimetro() {
        double perimetro;
        perimetro = lado * numeroDeLados;

        return perimetro;
    }
}
 