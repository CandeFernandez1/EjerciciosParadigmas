class Escalador extends Ciclista{
    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador (int identificador,String nombre, float aceleracionPromedio,float gradoRampa){
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;

    }
    public float getAcelareacionPromedio(){
        return aceleracionPromedio;
    }
    public void setAcelareacionPromedio(float acelareacionPromedio){
        this.aceleracionPromedio = acelareacionPromedio;
    }
    public float getGradoRampa(){
        return gradoRampa;
    }
    public void setGradoRampa(float gradoRampa){
        this.gradoRampa = gradoRampa;
    }
    public String imprimirTipo(){
        return "Es un Escalador";
    }
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Aceleracion promedio subida: " + aceleracionPromedio + "m/s2");
        System.out.println("Grado Rampa: " + gradoRampa + "grados");
    }
}
