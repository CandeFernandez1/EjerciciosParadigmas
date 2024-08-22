public class Juego {
    private int vidas;
    private int vidasIniciales;

    public Juego(int vidasIniciales){
        this.vidas=vidasIniciales;
        this.vidasIniciales= vidasIniciales;
    }

    public void MuestraVidasRestantes(){
        System.out.println("Te quedan " + vidas + " vidas.");
    }

    public boolean QuitaVida(){
        if(vidas>0){
            vidas-=1;
        }
        return vidas>0;
    }

    public void reiniciaPartida() {
        vidas = vidasIniciales;
        System.out.println("La partida ha sido reiniciada. Tienes " + vidas + "vidas nuevamente.");
    }
}
