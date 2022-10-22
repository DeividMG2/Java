public class Encapsulamiento {

    public static void main(String[] args) {
        
        //ENCAPSULAMIENTO: Proceso de ocultar o prohibir accesos a los miembros de la clase.
        
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        
        a1.nombre = "Juan";
        a1.apellidos = "Perez";
        a1.setCarne("2021029302"); //Asi asigno los datos con el set al atributo carne porque este esta oculto.
        
        a2.nombre = "Emily";
        a2.apellidos = "Salas";
        a2.setCarne("2022180293");
        
        a1.mostrarDatos();
        a2.mostrarDatos();
        
        System.out.println("\nAccediendo al carne "+a1.getCarne()+" el cual es privado");
    }
    
}
