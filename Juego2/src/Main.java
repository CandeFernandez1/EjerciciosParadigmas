public class Main {
    public static void main(String[] args){
        Juego juego1 = new Juego(5);
        juego1.MuestraVidasRestantes();

        while (juego1.QuitaVida()){
            juego1.MuestraVidasRestantes();
        }

        System.out.println("No te quedan mas vidas");

        juego1.MuestraVidasRestantes();
    }
}