//en esta clase vamos a crear un objeto de tipo persona
//para que haga algunas acciones
//y poder setear algunos atributos de la clase
public class Persona {
    private String nombre;
    private int edad;

    public void darNombre(String nombre){
        this.nombre=nombre;
    }
    public void cumplirAnios(){
        //this.edad=this.edad + 1;
        this.edad++; //metodo polimorfico de sobrecarda de
        //operadores para escribir menos
    }
    public String saludar(){
        return "Hola, soy " + this.nombre;
    }
    public String decirNombre(){
        return this.nombre;
    }
    public int decirEdad(){
        return this.edad;
    }
    public void caminar(){
        System.out.println("Estoy caminando"); //ya vamos a ver que esto hay que corregirlo
        //porque estamos acoplando
    }


}
