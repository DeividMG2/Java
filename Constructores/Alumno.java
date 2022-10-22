public class Alumno {
    //Atributos
    
    String carne, nombre, apellidos;
    
    
    //Metodo CONSTRUCTOR
    Alumno(String carne, String nombre, String apellidos){
        //Inicializando los atributos
        this.carne=carne;
        this.nombre=nombre;
        this.apellidos=apellidos;
        //Lo anterior se puede hacer así o incluso con diferentes nombres de parametros y hacerlo sin el this. Ej: nombre = n;
        // O incluso de la forma: this(carne,nombre,apellidos); Aunque me está dando un error
    }
    
    void verDatos(){
        System.out.println("Carne de estudiante: "+carne);
        System.out.println("Nombre de estudiante: "+nombre);
        System.out.println("Apellidos de estudiante: "+apellidos);
    }
}   
