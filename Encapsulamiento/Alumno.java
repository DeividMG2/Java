public class Alumno {

    //ENCAPSULAMIENTO: Proceso de ocultar o prohibir accesos a los miembros de la clase.
    
    private String carne;
    public String nombre, apellidos;
    
    //Metodos get y set para poder acceder a los atributos privados
    
    void setCarne(String carne){
        this.carne = carne;
    }
    
    String getCarne(){
        return this.carne;
    }
    
    //Metodo para mostrar los datos:
    
    void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nApellidos: "+apellidos+"\nCarne: "+carne);
    }
    
}
