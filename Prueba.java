public class Prueba {
    public static void main(String[] args) {
        Pentagono figura_pentag = new Pentagono();
        
        figura_pentag.setLado(-3);

        System.out.println(figura_pentag.getLado());

        System.out.println(figura_pentag.perimetro());
    }
}
