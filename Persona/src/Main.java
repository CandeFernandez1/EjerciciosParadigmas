public class Main {
    public static void main(String[] args) {
        Persona pablo = new Persona();
        pablo.darNombre("Pablo Hernandez");

        System.out.println(pablo.saludar());

        System.out.println("Pablo tiene " + pablo.decirEdad() + " años de edad.");

        for (int i=0; i<25; i++){
            pablo.cumplirAnios();
        }

        System.out.println("Pablo tiene " + pablo.decirEdad() + " años de edad.");

        System.out.print("Voy a hacer lo que me dijo el medico: ");
        pablo.caminar();
    }
}