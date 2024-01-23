public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        System.out.println("Radio del círculo: " + circulo.getRadio());
        System.out.println("Área del círculo: " + circulo.getArea());

        Cilindro cilinder = new Cilindro(1.0, 4.0);
        System.out.println("Radio del cilindro: " + cilinder.getRadio());
        System.out.println("Altura del cilindro: " + cilinder.getAltura());
        System.out.println("Área del círculo en el cilindro: " + cilinder.getArea());
        System.out.println("Volumen del cilindro: " + cilinder.getVolumen());
    }
}
