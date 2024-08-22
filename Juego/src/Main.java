public class Main {
    public static void main(String[] args) {

        System.out.println("Hola");
        Juego prueba1 = new Juego("Juego1",5);
        prueba1.MuestraVidasRestantes();
        prueba1.vidas -=1;
        prueba1.MuestraVidasRestantes();

        Juego prueba2 = new Juego("Juego2",5);
        prueba2.MuestraVidasRestantes();
        prueba2.vidas-=1;
        prueba1.MuestraVidasRestantes();
    }
}