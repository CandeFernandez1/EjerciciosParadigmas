class Contrarelojista extends Ciclista {
    private double velocidadMaxima;
    public Contrarelojista (int identificador,String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }
    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public String imprimirTipo(){
        return "Es un Contrarelojista";
    }
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Velocidad Maxima: " + velocidadMaxima + "km/h");
    }
}
