public class PruebaEquipo {
    public static void main(String[] args) {

        Equipo equipo = new Equipo("Equipo A", 5); // Permite hasta 5 ciclistas
        Velocista velocista = new Velocista(1, "Carlos", 400.5, 60.2);
        Escalador escalador = new Escalador(2, "Luis", 3.5f, 15.0f);
        Contrarelojista contrarrelojista = new Contrarelojista(3, "Ana", 70.0);

        equipo.anadirCiclista(velocista);
        equipo.anadirCiclista(escalador);
        equipo.anadirCiclista(contrarrelojista);

        equipo.imprimirDatos();

        System.out.println("Total de tiempos acumulados: " + equipo.calcularTotalTiempos() + " minutos");
        equipo.listarNombresCiclistas();

        equipo.imprimirCiclistaPorId(2);
        equipo.imprimirCiclistaPorId(4); // Este ID no existe, mostrará un mensaje
    }
}