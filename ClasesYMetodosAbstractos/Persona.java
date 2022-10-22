//SUPER CLASE
public abstract class Persona {

    /* Una clase abstracta contiene al menos 1 metodo que no ha sido especificado,
    es decir, este será heredado para sobreescribirse.
    
    Para lo que sirve la abstraccion es para proteger la super clase y que no pueda ser instanciada.

    */




    String nombre;
    int edad;
    public Persona(String nombre, int edad){ //Se usa las palabra abstract
        this.nombre = nombre;
        this.edad = edad;
    }
        
    // Creando al metodo abstracto, para que obligue a la clase hija a sobreescribir estos metodos.        
    abstract public void verDatos(); 

    // Obligatoriamente deben ser sobreescritos los metodos abstractos en la clase hija.
}
