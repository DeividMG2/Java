
public class Alumno {
    
    String carne, nombre, apellidos;
    
    //Constructor
    Alumno(String carne, String nombre, String apellidos){
        //Inicializando los atributos
        this.carne=carne;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    
    void verDatos(){
        System.out.println("Carne de estudiante: "+carne);
        System.out.println("Nombre de estudiante: "+nombre);
        System.out.println("Apellidos de estudiante: "+apellidos);
    }
    
    //GET -> Para obtener
    //SET -> Para asignar
    
    String getCarne(){
        return this.carne;
    }
    
    String getNombre(){
        return this.nombre;
    }
    
    String getApellidos(){
        return this.apellidos;
    }
    
    void setCarne(String carne){
        this.carne = carne;
    }
    
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
}
