class Equipo {
    private String nombre;
    private Ciclista[] ciclistas;
    private int contador;

    public Equipo(String nombre, int maxCiclistas){
        this.nombre=nombre;
        this.ciclistas=new Ciclista[maxCiclistas];
        this.contador=0;
    }
    public String getNombre(){
        return nombre;
    }
    public void getNombre(String nombre){
        this.nombre = nombre;
    }
    public void imprimirDatos(){
        System.out.println("Nombre del equipo: "+nombre);
        for (int i = 0; i<contador; i++){
            ciclistas[i].imprimirDatos();
            System.out.println(ciclistas[i].imprimirTipo());
            System.out.println();
        }
    }
    public void anadirCiclista(Ciclista ciclista){
        if (contador < ciclistas.length){
            ciclistas[contador]=ciclista;
            contador++;
        } else {
            System.out.println("El equipo ya tiene el maximo de ciclistas permitidos");
        }
    }

    public int calcularTotalTiempos(){
        int totalTiempo= 0;
        for (int i = 0; i< contador; i++){
            totalTiempo += ciclistas[i].getTiempoAcumulado();
        }
        return totalTiempo;
    }
    public void listarNombresCiclistas(){
        System.out.println("Nombres de los ciclistas en el equipo: ");
        for (int i = 0; i< contador; i++){
            System.out.println(ciclistas[i].getNombre());
        }
    }
    public void imprimirCiclistaPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (ciclistas[i].getIdentificador() == id) {
                ciclistas[i].imprimirDatos();
                return;
            }
        }
        System.out.println("No se encontró un ciclista con el identificador: " + id);
    }
}
