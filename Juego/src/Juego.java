public class Juego {
    public int vidas;
    public String nombreJuego;
    public Juego(String nombreJuego, int vidasIniciales) {
        this.nombreJuego= nombreJuego;
        this.vidas = vidasIniciales;
    }
    public void MuestraVidasRestantes (){
        System.out.println("En el juego: " + nombreJuego + " te quedan " + vidas + "vidas.");
    }

}
